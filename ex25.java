class ex25 {
    synchronized void print(int n) {
        for (int i = 1; i <= 10; i++) System.out.println(n * i);
    }

    public static void main(String[] args) {
        ex25 o = new ex25();
        new Thread(() -> o.print(5)).start();
        new Thread(() -> o.print(7)).start();
    }
}