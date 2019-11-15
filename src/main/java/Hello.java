public class Hello {
    public static void main(String[] args) {
        String greeting = getGreeting("Bob");
        System.out.println(greeting);
    }

    protected static String getGreeting(String name) {
        return "Hello " + name;
    }
}

