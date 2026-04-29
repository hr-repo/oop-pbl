import java.util.*;

class ex30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] w = s.split(" ");
        HashMap<String, Integer> m = new HashMap<>();

        for (String x : w) m.put(x, m.getOrDefault(x, 0) + 1);

        for (String k : m.keySet()) System.out.println(k + " -> " + m.get(k));
    }
}