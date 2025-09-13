import java.util.ArrayList;

public class B3_5{
	public static void main(String[] args){
		ArrayList<Dice> diceBox = new ArrayList<Dice>();
		diceBox.add(new Dice());
		diceBox.add(new Dice());
		diceBox.add(new Dice());
		
		for(int i = 0; i < diceBox.size(); i++){
			Dice dice = diceBox.get(i);
			dice.cast();
			System.out.println(dice.getValue());
		}
	}
}