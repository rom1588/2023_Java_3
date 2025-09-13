public class B3_3{
	public static void main(String[] args){
		Dice dice = new Dice();//‡@
		dice.cast();//‡A
		int value = dice.getValue();//‡B
		System.out.println(value);
	}
}