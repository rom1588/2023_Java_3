public class B5_3{
	public static void main(String[] args){
		Cup cup = new Cup();
		Dice dice0 = new Dice();
		Dice dice1 = new Dice();
		cup.add(dice0);
		cup.add(dice1);
		cup.cast();
		int sum = cup.getSum();
		System.out.println("�T�C�R���̖ڂ̍��v�F" + sum);
	}
}