import java.util.ArrayList;

public class B3_6{
	public static void main(String[] args){
		int n = 5;
		ArrayList<Dice> diceBox = new ArrayList<Dice>();
		for(int i = 0; i < n; i++){
			diceBox.add(new Dice());
		}
		//�T�C�R��(Dice)�̐���\������
		System.out.print("�T�C�R���̐��F");
		int size = diceBox.size();
		System.out.println(size);
		
		//���ׂẴT�C�R����U��
		for(int i = 0; i < 5; i ++){
			Dice dice = diceBox.get(i);
			dice.cast();
		}
	
		//���ׂẴT�C�R���̖ڂ�\������
		for(int i = 0; i < 5; i++){
			Dice dice = diceBox.get(i);
			int value = dice.getValue();
			System.out.println(value);
		
		}
	}
}