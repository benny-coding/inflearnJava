package inflearnJava.chap21;
// 인터페이스는 객체를 생성할 수 없으며 작업 명세서와 같다

public class MainClass {

    public static void main(String[] args) {

        InterfaceA ia = new InterfaceClass();
        InterfaceB ib = new InterfaceClass();

        ia.funA();
        ib.funB();

    }

}
