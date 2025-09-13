public class BreakfastMain{
	public static void main(String[] args){
		Breakfast lunchSet = new Breakfast();
		lunchSet.setCoffee(new Coffee("ブラジル", 350));
		lunchSet.addBread(new Roll("レーズンバター", 120));
		lunchSet.addBread(new Toast("ベーコンエッグ", 200));
		lunchSet.print();
		System.out.println("合計" + lunchSet.getTotalPrice() + "円");
	}
}