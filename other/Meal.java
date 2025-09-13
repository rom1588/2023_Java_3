import java.util.ArrayList;

public class Meal {
    private ArrayList<SideDish> list = new ArrayList<SideDish>();
    public Meal(){
    }
    public void addSideDish(SideDish sideDish){
        this.list.add(sideDish);
    }
    public int getTotalPrice(){
        int sum = 0;
    	for(int i = 0; i < this.list.size(); i++){
    		SideDish sideDish = this.list.get(i);
    		int price = sideDish.getPrice();
    		sum = sum + price;
    	}
    	return sum;
    }
    public void print(){
    	for(int i = 0; i < this.list.size(); i++){
    		SideDish sideDish = this.list.get(i);
    		sideDish.print();
    	}
    }
}
