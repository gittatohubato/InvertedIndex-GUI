package sample;

import javafx.scene.control.ProgressBar;

import java.io.*;

public class MergeInFile {

   private int numberOfFiles;

    public MergeInFile(int numberOfFiles , ProgressBar progressBar) throws IOException {
        this.numberOfFiles = numberOfFiles;
        try {
            PrintWriter out = new PrintWriter("C:\\Users\\Mohamed Amr\\Downloads\\questions\\wholeDocuments.txt");
            for(int i=0 ; i<this.numberOfFiles ; i++){
                File file = new File("C:\\Users\\Mohamed Amr\\Downloads\\questions\\questions\\"+i+".txt");
                BufferedReader reader = new BufferedReader(new FileReader(file));
                out.println(reader.readLine());
                //System.out.println(i+": "+reader.readLine());
                progressBar.setProgress((float)i/100_000);
            }
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public int getNumberOfFiles() {
        return numberOfFiles;
    }
}
