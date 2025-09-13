public class BreadMain{
	public static void main(String[] args){
		Bread bread1 = new Roll("レーズン", 100);
		Bread bread2 = new Toast("エッグ", 150);
		System.out.println(bread1.getIngredient());
		System.out.println(bread1.getPrice());
		System.out.println(bread1.getName());
		bread1.print();
		bread2.print();
	}
}