package inflearnJava.chap26;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.ArrayList;

public class ExceptionMain {
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

        } catch (ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
        } catch (Exception e){
            e.printStackTrace();
        }

    }
}
