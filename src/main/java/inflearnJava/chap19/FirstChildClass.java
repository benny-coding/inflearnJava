package inflearnJava.chap19;

public class FirstChildClass extends ParentClass {

    public FirstChildClass(){
        System.out.println("FirstChildClass Constructor");
    }

    public void childFun(){
        System.out.println("ChildFun()");
    }

    @Override
    public void makeJJajang(){
        System.out.println("-- FirstChildClass's moremakeJJajang() -- ");
    }
}
