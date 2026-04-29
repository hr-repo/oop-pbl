import java.util.*;

class ex29 {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        a.add(70);
        a.add(80);
        a.add(90);
        a.add(60);
        a.add(85);

        System.out.println(a);
        System.out.println(Collections.max(a));
        System.out.println(Collections.min(a));
    }
}