package inflearnJava.chap18;

public class MainClass {
    public static void main(String[] args) {
        ChildClass childClass = new ChildClass();
        childClass.childFun();
        childClass.parentFun();

        // childClass.privateFun(); Parent의 메서드는 private이므로 불러오지 못합니다.
    }


}
