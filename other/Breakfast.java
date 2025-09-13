//23AJ119 •½’ËŸ©–ç

import java.util.ArrayList;

public class Breakfast{
	private Coffee coffee;
	private ArrayList<Bread> list = new ArrayList<Bread>();
	public Breakfast(){
	}
	public void setCoffee(Coffee coffee){
		this.coffee = coffee;
	}
	public void addBread(Bread bread){
		this.list.add(bread);
	}
	public int getTotalPrice(){
		int sum = 0;
		Coffee coffee = this.coffee;
		int price1 = coffee.getPrice();
		sum = sum + price1;
		for(int i = 0; i < this.list.size(); i++){
			Bread bread = this.list.get(i);
			int price2 = bread.getPrice();
			sum = sum + price2;
		}
		return sum;
	}
	public void print(){
		Coffee coffee = this.coffee;
		coffee.print();
		for(int i = 0; i < this.list.size(); i++){
			Bread bread = this.list.get(i);
			bread.print();
		}
	}
}