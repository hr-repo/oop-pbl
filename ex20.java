class ex20 {
    public static void main(String[] args) {
        try {
            int num = Integer.parseInt(args[0]);
            int den = Integer.parseInt(args[1]);
            System.out.println(num / den);
        } catch (ArithmeticException e) {
            System.out.println("Division by zero not allowed");
        } catch (NumberFormatException e) {
            System.out.println("Invalid input");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Provide two arguments");
        }
    }
}