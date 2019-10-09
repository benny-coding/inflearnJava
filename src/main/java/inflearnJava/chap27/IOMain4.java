package inflearnJava.chap27;

import java.io.*;

public class IOMain4 {
    public static void main(String[] args) {

        String fileName = "/Users/odongjin/Documents/Hello4.txt";

        BufferedReader br = null;
        FileReader fr = null;

        try {

            fr = new FileReader(fileName);
            br = new BufferedReader(fr);

            String strLine;

            while ((strLine = br.readLine()) != null) {
                System.out.println(strLine);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {

            try {
                if(br != null) br.close();
                if(fr != null) fr.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }

    }
}
