public class HelloWorld {

    public static void main(String[] args) {
        if (args.length != 1) {
            System.err.println("Usage: <name>");
            System.exit(1);
        }

        String name = args[0];
        System.out.println("Hello, " + name + "!");
    }
}
