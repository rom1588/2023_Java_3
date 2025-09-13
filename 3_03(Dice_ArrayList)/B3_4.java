public class B3_4{
	public static void main(String[] args){
		Dice dice1 = new Dice();
		Dice dice2 = new Dice();
		dice1.cast();
		dice2.cast();
		int value1 = dice1.getValue();
		int value2 = dice2.getValue();
		System.out.println(value1);
		System.out.println(value2);
	}
}