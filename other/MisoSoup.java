public class MisoSoup implements SideDish {
    private String food;
    private int price;
    public MisoSoup(String food,int price){
        this.price = price;
        this.food = food;
    }
    public String getFood(){
        return this.food;
    }
    public int getPrice(){
        return this.price;
    }
    public String getName(){
        return this.food + "Ç›Çªè`";
    }
    public void print(){
        System.out.println(getName() + this.price + "â~");
    }

}
