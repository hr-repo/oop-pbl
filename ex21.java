class ex21 {
    static void checkEligibility(int age) {
        if (age < 18) throw new IllegalArgumentException("Age must be 18 or above to vote");
        else System.out.println("Eligible");
    }

    public static void main(String[] args) {
        int[] a = {15, 20};
        for (int i : a) {
            try {
                checkEligibility(i);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            } finally {
                System.out.println("Validation process completed");
            }
        }
    }
}