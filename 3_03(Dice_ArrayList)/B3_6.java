import java.util.ArrayList;

public class B3_6{
	public static void main(String[] args){
		int n = 5;
		ArrayList<Dice> diceBox = new ArrayList<Dice>();
		for(int i = 0; i < n; i++){
			diceBox.add(new Dice());
		}
		//サイコロ(Dice)の数を表示する
		System.out.print("サイコロの数：");
		int size = diceBox.size();
		System.out.println(size);
		
		//すべてのサイコロを振る
		for(int i = 0; i < 5; i ++){
			Dice dice = diceBox.get(i);
			dice.cast();
		}
	
		//すべてのサイコロの目を表示する
		for(int i = 0; i < 5; i++){
			Dice dice = diceBox.get(i);
			int value = dice.getValue();
			System.out.println(value);
		
		}
	}
}