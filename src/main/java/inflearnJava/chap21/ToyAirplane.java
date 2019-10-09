package inflearnJava.chap21;

public class ToyAirplane implements Toy {

    @Override
    public void walk() {
        System.out.println("The airpane can not walk.");
    }

    @Override
    public void run() {
        System.out.println("The airpane can not run.");
    }

    @Override
    public void alarm() {
        System.out.println("The airpane has alarm function.");
    }

    @Override
    public void light() {
        System.out.println("The airpane has no light function.");
    }
}
