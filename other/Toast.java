//23AJ119 ���˟���

public class Toast implements Bread{
	private String ingredient;
	private int price;
	public Toast(String ingredient, int price){
		this.ingredient = ingredient;
		this.price = price;
	}
	public String getIngredient(){
		return this.ingredient;
	}
	public int getPrice(){
		return this.price;
	}
	public String getName(){
		return this.ingredient + "�g�[�X�g";
	}
	public void print(){
		System.out.println(getName() + this.price + "�~");
	}
}