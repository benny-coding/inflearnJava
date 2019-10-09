package inflearnJava.chap27;

import java.io.*;

public class IOMain3 {
    public static void main(String[] args) {

    String str = "Hello Java World!!";
    OutputStream outputStream = null;
    InputStream inputStream = null;
    DataOutputStream dataOutputStream = null;

    try {
        outputStream = new FileOutputStream("/Users/odongjin/Documents/Hello3.txt");
        dataOutputStream = new DataOutputStream(outputStream);

        dataOutputStream.writeUTF(str);

    } catch(Exception e){
        e.printStackTrace();
    } finally {
        try {
            if(dataOutputStream != null) dataOutputStream.close();
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    try {
        if(outputStream != null) outputStream.close();
    } catch (Exception e) {
        e.printStackTrace();
    }

    }
}
