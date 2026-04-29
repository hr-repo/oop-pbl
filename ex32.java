import java.util.*;

class ex32 {
    static <T> boolean searchElement(LinkedList<T> l, T e) {
        return l.contains(e);
    }

    public static void main(String[] args) {
        LinkedList<Integer> a = new LinkedList<>();
        a.add(1);
        a.add(2);

        LinkedList<String> b = new LinkedList<>();
        b.add("A");
        b.add("B");

        System.out.println(searchElement(a, 2));
        System.out.println(searchElement(b, "C"));
    }
}