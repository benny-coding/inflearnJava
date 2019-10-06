package inflearnJava.chap14;

public class ObjectClass {

    public static void main(String[] args) {
        ObjectClass obj1 = new ObjectClass();
        ObjectClass obj2 = new ObjectClass();
        ObjectClass obj3 = new ObjectClass();

        // 하나의 클래스로 인스턴스화 했지만 서로 다른 주소를 가리키고 있다
        System.out.println("obj1 : " + obj1);
        System.out.println("obj2 : " + obj2);
        System.out.println("obj3 : " + obj3);

        System.out.println();

        // 서로 다른 객체임을 if문을 통해 증명한다.
        if(obj1 == obj2){
            System.out.println("obj1 == obj2");
        } else {
            System.out.println("obj1 != obj2");
        }

        if(obj1 == obj3){
            System.out.println("obj1 == obj3");
        } else {
            System.out.println("obj1 != obj3");
        }

        if(obj2 == obj3){
            System.out.println("obj2 == obj3");
        } else {
            System.out.println("obj2 != obj3");
        }

        // null 값을 넣어주면 Gabage Collector에 의해 원래 주소가 있던 메모리가 정리가 된다.
        obj1 = null;
    }
}
