public class CoffeeMain{
	public static void main(String[] args){
		Coffee coffee1 = new Coffee("���J", 300);
		Coffee coffee2 = new Coffee("�u���W��", 350);
		System.out.println(coffee1.getName());
		System.out.println(coffee1.getPrice());
		coffee1.print();
		coffee2.print();
	}
}