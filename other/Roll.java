//23AJ119 •½’ËŸ©–ç

public class Roll implements Bread{
	private String ingredient;
	private int price;
	public Roll(String ingredient, int price){
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
		return this.ingredient + "ƒ[ƒ‹ƒpƒ“";
	}
	public void print(){
		System.out.println(getName() + this.price + "‰~");
	}
}