import java.util.ArrayList;

public class B6_3{
	public static void main(String[] args){
		ArrayList<Value> arrayList = new ArrayList<Value>();
		arrayList.add(new Coin100());
		arrayList.add(new Coin100());
		arrayList.add(new Coin50());
		arrayList.add(new Check(250));
		int sum = 0;
		int size = arrayList.size();
		for(int i = 0; i < size; i++){
			Value value = arrayList.get(i);
			sum = sum + value.getValue();
		}
		System.out.println("���v" + sum + "�~�ł��B");
	}
}