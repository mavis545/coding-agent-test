public class Addition {
    public static int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Usage: java Addition <number1> <number2>");
            return;
        }

        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        System.out.println("Sum: " + add(a, b));
    }
}
