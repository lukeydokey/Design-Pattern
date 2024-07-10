package main.builder;

public class Hamburger {
    private String bun;
    private Boolean lettuce;
    private String sauce;
    private Boolean tomato;
    private String patty;
    private Boolean cheese;

    private Hamburger(Builder builder) {
        this.bun = builder.bun;
        this.lettuce = builder.lettuce;
        this.sauce = builder.sauce;
        this.tomato = builder.tomato;
        this.patty = builder.patty;
        this.cheese = builder.cheese;
    }

    @Override
    public String toString(){
        return "Hamburger Ingredients" +
                "\n bun : " + bun +
                "\n Lettuce : " + lettuce +
                "\n sauce : " + sauce +
                "\n tomato : " + tomato +
                "\n patty : " + patty +
                "\n cheese : " + cheese;
    }

    public static class Builder {
        private String bun = "No";
        private Boolean lettuce = false;
        private String sauce = "No";
        private Boolean tomato = false;
        private String patty = "No";
        private Boolean cheese = false;

        public Builder bun(String bun) {
            this.bun = bun;
            return this;
        }
        public Builder lettuce(Boolean lettuce) {
            this.lettuce = lettuce;
            return this;
        }
        public Builder sauce(String sauce) {
            this.sauce = sauce;
            return this;
        }
        public Builder tomato(Boolean tomato) {
            this.tomato = tomato;
            return this;
        }
        public Builder patty(String patty) {
            this.patty = patty;
            return this;
        }
        public Builder cheese(Boolean cheese) {
            this.cheese = cheese;
            return this;
        }
        public Hamburger build() {
            return new Hamburger(this);
        }

    }

}
