public class TraditionalHelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        System.out.println("What is your name? ");
        String name = System.console().readLine();
        System.out.println("Hello, " + name);
    }
}