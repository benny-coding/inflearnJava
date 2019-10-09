package inflearnJava.chap25;
import java.util.ArrayList;

public class ListMain {
    public static void main(String[] args) {

        // ArrayList 객체 생성
        ArrayList<String> list = new ArrayList<String>();

        System.out.println("list.size : " + list.size());

        // 데이터 추가
        list.add("Hello");
        list.add("Java");
        list.add("World");
        System.out.println("list.size : " + list.size());
        System.out.println("list : " + list);

        // 추가
        list.add(2,"Programiong");
        System.out.println("list" + list);

        // 변경
        list.set(1, "C");
        System.out.println("list" + list);

        // 데이터 추출
        String str = list.get(2);
        System.out.println("list.get(2) : " + str);
        System.out.println("list" + list);

        // 데이터 제거
        str = list.remove(2);
        System.out.println("list.remove(2) : " + str);
        System.out.println("list" + list);

        // 데이터 전체 제거
        list.clear();
        System.out.println("list" + list);
    }
}
