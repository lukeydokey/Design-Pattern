package main.builder;

public class Cook {
    public static void main(String[] args) {
        Hamburger hamburger = new Hamburger.Builder()
                .bun("Sesame")
                .lettuce(true)
                .tomato(true)
                .patty("beef")
                .cheese(true)
                .sauce("bulgogi")
                .build();

        System.out.println(hamburger.toString());
    }
}
