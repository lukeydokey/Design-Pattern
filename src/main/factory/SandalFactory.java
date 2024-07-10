package main.factory;

public class SandalFactory implements FootwearFactory{
    @Override
    public Footwear produceShoes(String category){
        return new Sandal(category);
    }
}
