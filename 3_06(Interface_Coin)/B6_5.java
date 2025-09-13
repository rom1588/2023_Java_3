public class B6_5{
	public static void main(String[] args){
		CoinBox coinBox = new CoinBox();
		coinBox.add(new Coin100());
		coinBox.add(new Coin100());
		coinBox.add(new Coin50());
		coinBox.add(new Check(250));
		System.out.print("合計" + coinBox.getSum());
		System.out.println("です。");
		//printによる表示
		coinBox.print();
		//サイズの表示
		System.out.println("サイズ" + coinBox.size());
		//coinBoxからCoin50オブジェクトを取り出す。
		Value coin50 = coinBox.remove(50);
		System.out.println(coin50.getValue());
		//printによる表示
		coinBox.print();
		
		//coinBoxからCoin100オブジェクトを1つ取り出す。
		//取り出したオブジェクトの価値を表示する。
		Value coin100 = coinBox.remove(100);
		System.out.println(coin100.getValue());
	}
}