public class CoffeeMain{
	public static void main(String[] args){
		Coffee coffee1 = new Coffee("ƒ‚ƒJ", 300);
		Coffee coffee2 = new Coffee("ƒuƒ‰ƒWƒ‹", 350);
		System.out.println(coffee1.getName());
		System.out.println(coffee1.getPrice());
		coffee1.print();
		coffee2.print();
	}
}