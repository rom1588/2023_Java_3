//23AJ119 •½’ËŸ©–ç

import java.util.ArrayList;

public class Wad_10000 implements Value{
	private ArrayList<Bill_10000> arrayList = new ArrayList<Bill_10000>();
	public Wad_10000(){
		for(int i = 0; i < 100; i++){
			Bill_10000 bill_10000 = new Bill_10000();
			arrayList.add(bill_10000);
		}
	}
	public int getValue(){
		int sum = 0;
		int size = arrayList.size();
		for(int i = 0; i < size; i++){
			Bill_10000 value = arrayList.get(i);
			sum = sum + value.getValue();
		}
		return sum;
	}
}