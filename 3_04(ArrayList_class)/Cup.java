import java.util.ArrayList;

public class Cup{
	private ArrayList<Dice> arrayList = new ArrayList<Dice>();
	public Cup(){
	}
	public void add(Dice dice){
		this.arrayList.add(dice);
	}
	public Dice get(int number){
		Dice dice = this.arrayList.get(number);
		return dice;
	}
	public int size(){
		int size = this.arrayList.size();
		return size;
	}
	public void cast(){
		//Cupオブジェクトに入っているすべてのサイコロを振る
		//繰り返し処理を使う。繰り返しの中でDiceオブジェクトを取り出して
		//一個ずつキャストする（振る）
		int size = this.arrayList.size();
		for(int i = 0; i < size; i++){
			Dice dice = this.arrayList.get(i);
			dice.cast();
		}
	}
	public int getSum(){
		//Cupオブジェクト内のDiceオブジェクトを1つずつ取り出し、
		//その目を読む。(dice.getValue())
		//読んだすべての目の合計を変数Sumに加える。
		//すべてのサイコロの目の合計値がSumに入ったら返却する。
		int sum = 0;
		int size = this.arrayList.size();
		for(int i = 0; i < size; i++){
			Dice dice = this.arrayList.get(i);
			sum = sum + dice.getValue();
		}
		return sum;
	}
	public int getValue(int number){
		Dice dice = this.arrayList.get(number);
		int value = dice.getValue();
		return value;
	}
}