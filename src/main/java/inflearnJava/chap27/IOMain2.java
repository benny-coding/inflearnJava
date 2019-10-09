package inflearnJava.chap27;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.InputStream;

public class IOMain2 {
    public static void main(String[] args) {



/*
        // read
        InputStream inputStream = null;
        try {

            inputStream = new FileInputStream("/Users/odongjin/Documents/Hello.txt");
            int data = 0;

            while(true) {

                try {
                    data = inputStream.read();
                } catch (IOException e){
                    e.printStackTrace();
                }
                if(data == -1) break;
                System.out.println("data : " + data);
            }
        } catch (FileNotFoundException e){
            e.printStackTrace();
        } finally {
            try {
                if(inputStream != null) inputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
*/
/*
        // read(byte[]
        InputStream inputStream = null;
        try {

            inputStream = new FileInputStream("/Users/odongjin/Documents/Hello.txt");
            int data = 0;
            byte[] bs = new byte[3];

            while(true) {

                try {
                    data = inputStream.read(bs);
                } catch (IOException e){
                    e.printStackTrace();
                }
                if(data == -1) break;
                System.out.println("data : " + data);
                for (int i = 0; i < bs.length; i++) {
                    System.out.println("bs[" + i + "] : " + bs[i]);
                }
            }
        } catch (FileNotFoundException e){
            e.printStackTrace();
        } finally {
            try {
                if(inputStream != null) inputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
*/
/*
        //write
        OutputStream outputStream = null;
        try {
            outputStream = new FileOutputStream("/Users/odongjin/Documents/Hello.txt");
            String data = "Hello java world!!asdasdasdbnasjdbasdhuasgvdhasf123123123123123";
            byte[] arr = data.getBytes();

            try {
                outputStream.write(arr);
            } catch (IOException e){
                e.printStackTrace();
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                if(outputStream != null) outputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
*/
        // write2()
        InputStream inputStream = null;
        OutputStream outputStream = null;

        try {
            inputStream = new FileInputStream("/Users/odongjin/Documents/Hello.txt");
            outputStream = new FileOutputStream("/Users/odongjin/Documents/Hello3.txt");

            byte[] arr = new byte[3];

            while(true) {
                int len = inputStream.read(arr);
                if(len == -1) break;
                outputStream.write(arr, 0, len);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if(inputStream != null){
                try {
                    inputStream.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

            if(outputStream != null){
                try {
                    outputStream.close();
                } catch (Exception e) { e.printStackTrace(); }
            }
        }
    }
}
