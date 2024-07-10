package main.factory;

public interface FootwearFactory {
    default Footwear makeShoes(String category){
        notifyPreparing(category);
        Footwear footwear = produceShoes(category);
        notifyComplete(category);
        return footwear;
    }

    private void notifyPreparing(String category) {
        System.out.println(category + "을 제작 하겠습니다!!");
    }

    Footwear produceShoes(String category);

    private void notifyComplete(String category) {
        System.out.println(category + "을 완성 했습니다");
    }
}
