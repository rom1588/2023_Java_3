//23AJ119 •½’ËŸ©–ç

import java.util.ArrayList;

public class Coinroll_100 implements Value{
	private ArrayList<Coin100> arrayList = new ArrayList<Coin100>();
	public Coinroll_100(){
		for(int i = 0; i < 50; i++){
			Coin100 coin100 = new Coin100();
			arrayList.add(coin100);
		}
	}
	public int getValue(){
		int sum = 0;
		int size = this.arrayList.size();
		for(int i = 0; i < size; i++){
			Coin100 value = arrayList.get(i);
			sum = sum + value.getValue();
		}
		return sum;
	}
}