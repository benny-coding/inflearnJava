package inflearnJava.chap17;

public class Student {

    private String name;
    private int score;

    public Student(String n, int s){
        this.name = n;
        this.score = s;
    }

    public void getInfo() {
        System.out.println(" -- getInfo() --");
        System.out.println(" name : " + name);
        System.out.println(" score : " + score);
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getScore(){
        return score;
    }

    public void setScore(int score){
        if(score < 50){
            System.out.println("50보다 작잖아여");
        } else {
            this.score = score;
        }
    }

}
