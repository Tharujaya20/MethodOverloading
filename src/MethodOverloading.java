class MethodOverloading {
    private static void display(int a){
        System.out.println("Got Integer");
    }

    private static void display(String a) {
        System.out.println("Got String Object");
    }
    public static void main(String[] args) {
        display(1);
        display("Hello");

    }
}
