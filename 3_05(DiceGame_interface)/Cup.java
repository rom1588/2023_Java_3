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
		//Cup�I�u�W�F�N�g�ɓ����Ă��邷�ׂẴT�C�R����U��
		//�J��Ԃ��������g���B�J��Ԃ��̒���Dice�I�u�W�F�N�g�����o����
		//����L���X�g����i�U��j
		int size = this.arrayList.size();
		for(int i = 0; i < size; i++){
			Dice dice = this.arrayList.get(i);
			dice.cast();
		}
	}
	public int getSum(){
		//Cup�I�u�W�F�N�g����Dice�I�u�W�F�N�g��1�����o���A
		//���̖ڂ�ǂށB(dice.getValue())
		//�ǂ񂾂��ׂĂ̖ڂ̍��v��ϐ�Sum�ɉ�����B
		//���ׂẴT�C�R���̖ڂ̍��v�l��Sum�ɓ�������ԋp����B
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