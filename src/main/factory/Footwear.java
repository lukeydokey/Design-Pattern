package main.factory;

public class Footwear {
    private String category;
    Footwear (String category){
        this.category = category;
    }

    @Override
    public String toString() {
        return "Shoes Category : " + this.category;
    }
}
