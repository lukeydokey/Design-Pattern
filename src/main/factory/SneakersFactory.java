package main.factory;

public class SneakersFactory implements FootwearFactory{
    @Override
    public Footwear produceShoes(String category){
        return new Sneakers(category);
    }
}
