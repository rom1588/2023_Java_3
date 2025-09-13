import jp.tdu.util.KeyboardReader;

public class DiceGame{
	private Cup cup = new Cup();
	private int playerHand;
	public DiceGame(Dice dice0, Dice dice1){
		this.cup.add(dice0);
		this.cup.add(dice1);
	}
	public void play(){
		this.cup.cast();
	}
	public void bet(){
		System.out.print("��(����)��0�A��(�)��1����͂��Ă��������F");
		this.playerHand = KeyboardReader.readInt();
	}
	public void judge(){
		Dice dice0 = this.cup.get(0);
		Dice dice1 = this.cup.get(1);
		int value0 = dice0.getValue();
		int value1 = dice1.getValue();
		int sum = this.cup.getSum();
		System.out.println(value0 + "" + value1 + "�ō��v��" + sum + "�ł��B");
		int result = sum % 2;
		if(this.playerHand == result){
			System.out.println("�v���[���[�̏���");
		}else{
			System.out.println("�R���s���[�^�̏���");
		}
	}
}