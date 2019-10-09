package inflearnJava.chap26;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionMain2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int i = 10;
        int j = 0;
        int r = 0;
        ArrayList list = new ArrayList();
        int iArr[] = new int[5];

        System.out.println("Exception BEFORE");

        try{
            r = i / j;
        } catch (Exception e){
            e.printStackTrace();
            String msg = e.getMessage();
            System.out.println("msg : " + msg);
        }

        System.out.println("Exception AFTER");

        try{
            System.out.println("input i : ");
            i = scanner.nextInt();
            System.out.println("input j : ");
            j = scanner.nextInt();
            System.out.println("i / j = " + ( i / j));

            for(int k = 0; k < 6; k++){
                System.out.println("iArr[" + k + "] : " + iArr[k]);
            }

            System.out.println("list.size() : " + list.size());

        } catch (InputMismatchException e) {
            e.printStackTrace();
            System.out.println("문자 입력 오류");
        } catch (ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
        } catch (Exception e){
            e.printStackTrace();
        } finally{
            System.out.println("예외 발생 여부에 상관없이 언제나 실행 됩니다.");
        }

    }
}
