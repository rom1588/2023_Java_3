public class B4_1{
	public static void main(String[] args){
		Cup cup = new Cup();
		cup.add(new Dice());
		cup.add(new Dice());
		cup.cast();
		int sum = cup.getSum();
		System.out.println ("サイコロの目の合計：" + sum);
		
		//サイコロの数を表示
		int size = cup.size();
		System.out.println("サイコロの数：" + size);
		
		//サイコロを１つCupから取り出して、その値を読み表示する
		Dice dice0 = cup.get(0);
		int value0 = dice0.getValue();
		System.out.println(value0);
		
		//サイコロの１つの目を読み、表示する
		//getValue()の確認
		int value1 = cup.getValue(1);
		System.out.println(value1);
	}
}