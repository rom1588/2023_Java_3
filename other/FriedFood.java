public class FriedFood implements SideDish {
    private String food;
    private int price;
    public FriedFood(String food,int price){
        this.food = food;
        this.price = price;
    }
    public String getFood(){
        return this.food;
    }
    public int getPrice(){
        return this.price;
    }
    public String getName(){
        return this.food + "�t���C";
    }
    public void print(){
        System.out.println(getName() + this.price + "�~");
    }
}