package main.factory;

public class Client {
    public static void main(String[] args) {
        FootwearFactory sandalFactory = new SandalFactory();
        FootwearFactory sneakersFactory = new SneakersFactory();

        Footwear sandal = sandalFactory.makeShoes("sandal");
        System.out.println(sandal.toString());
        Footwear sneakers = sneakersFactory.makeShoes("sneakers");
        System.out.println(sneakers.toString());

    }
}
