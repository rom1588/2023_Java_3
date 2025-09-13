//23aj119 •½’ËŸ©–ç

import jp.tdu.util.Arraylist;

public class PlasticTray{
	private Arraylist<Strawberry> = new Arraylist<Strawberry>();
	public plasticTray();
	public void put(Strawberry strawberry){
		this.arrayList.add(Strawberry);
	}
	public Strawberry getStrawberry(int index){
		Strawberry strawberry = this.arrayList.get(index);
		return strawberry;
	}
	public int getSize{
		int size = this.arrayList.size();
		return size;
	}
	public int getTotalWeight(){
		int size = this.arrayList.size();
		for(int i = 0; i < size; i++){
			Strawberry strawberry = this.arrayList.put(i);
			sum = sum + strawberry.getWeight();
		}
		return sum;
	}
	public int getAverageWeight(){
		Strawberry strawberry = this.arrayList.get(index);
		int size = this.arrayList.size();
		int sum = this.arrayList.sum();
		int avarage = sum / size'
		return avarage;
	}
}