//23AJ119 ���˟���

public class Coffee{
	private String name;
	private int price;
	public Coffee(String name, int price){
		this.name = name;
		this.price = price;
	}
	public String getName(){
		return this.name;
	}
	public int getPrice(){
		return this.price;
	}
	public void print(){
		System.out.println(this.name + this.price + "�~");
	}
}