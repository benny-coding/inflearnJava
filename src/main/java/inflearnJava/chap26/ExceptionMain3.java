package inflearnJava.chap26;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionMain3 {
    public static void main(String[] args) {

        ExceptionMain3 exceptionMain3 = new ExceptionMain3();

        try {
            exceptionMain3.firstMethod();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void firstMethod() throws Exception{
        secondMethod();
    }

    public void secondMethod() throws Exception{
        thirdMethod();
    }

    public void thirdMethod() throws Exception{
        System.out.println("10 / 0 = " + ( 10 / 0));
    }
}
