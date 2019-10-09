package inflearnJava.chap24;

public class StringMain {

    public static void main(String[] args) {

        // String str = "jAVA";
        String str = new String("JAVA");
        System.out.println(" str : " + str);

        str = str + "_8";

        System.out.println(" str : " + str);

        // StringBuffer
        StringBuffer sf = new StringBuffer("JAVA");
        System.out.println("sf : " + sf);

        sf.append("_8");

        System.out.println("sf : " + sf);
        System.out.println("sf.length() : " + sf.length());

        sf.insert(0,"HELLO ");
        System.out.println("sf insert : " + sf);

        sf.delete(0,7);
        System.out.println("sf delete : " + sf);

        // StringBuilder
        StringBuilder sb = new StringBuilder("String");
        System.out.println("sb : " + sb);

        sb.append(" Builder");
        System.out.println("sb.append : " + sb);

        sb.insert(sb.length(),"~!");
        System.out.println("sb.insert : " + sb);

        sb.delete(0,5);
        System.out.println("sb.delete : " + sb);
    }
}
