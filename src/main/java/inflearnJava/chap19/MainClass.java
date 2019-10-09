package inflearnJava.chap19;

public class MainClass {
    public static void main(String[] args) {

        ParentClass[] parentArr = new ParentClass[2];


        ParentClass firstChildClass = new FirstChildClass();
        ParentClass secondChildClass = new SecondChildClass();

        parentArr[0] = firstChildClass;
        parentArr[1] = secondChildClass;


        firstChildClass.makeJJajang();



        // firstChildClass.privateFun(); Parent의 메서드는 private이므로 불러오지 못합니다.
    }


}
