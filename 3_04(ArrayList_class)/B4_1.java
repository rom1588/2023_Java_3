public class B4_1{
	public static void main(String[] args){
		Cup cup = new Cup();
		cup.add(new Dice());
		cup.add(new Dice());
		cup.cast();
		int sum = cup.getSum();
		System.out.println ("�T�C�R���̖ڂ̍��v�F" + sum);
		
		//�T�C�R���̐���\��
		int size = cup.size();
		System.out.println("�T�C�R���̐��F" + size);
		
		//�T�C�R�����P��Cup������o���āA���̒l��ǂݕ\������
		Dice dice0 = cup.get(0);
		int value0 = dice0.getValue();
		System.out.println(value0);
		
		//�T�C�R���̂P�̖ڂ�ǂ݁A�\������
		//getValue()�̊m�F
		int value1 = cup.getValue(1);
		System.out.println(value1);
	}
}