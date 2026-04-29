import java.util.*;

class ex31 {
    public static void main(String[] args) {
        LinkedList<String> l = new LinkedList<>();
        l.add("S1");
        l.add("S2");
        l.add("S3");

        System.out.println(l);
        l.removeFirst();
        System.out.println(l);
        l.removeLast();
        System.out.println(l);
    }
}