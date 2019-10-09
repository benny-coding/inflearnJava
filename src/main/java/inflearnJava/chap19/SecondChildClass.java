package inflearnJava.chap19;

public class SecondChildClass extends ParentClass {

    public SecondChildClass(){
        System.out.println("SecondChildClass Constructor");
    }

    public void childFun(){
        System.out.println("ChildFun()");
    }

    @Override
    public void makeJJajang(){
        System.out.println("-- SecondChild's ClassmoremakeJJajang() -- ");
    }
}
