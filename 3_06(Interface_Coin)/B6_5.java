public class B6_5{
	public static void main(String[] args){
		CoinBox coinBox = new CoinBox();
		coinBox.add(new Coin100());
		coinBox.add(new Coin100());
		coinBox.add(new Coin50());
		coinBox.add(new Check(250));
		System.out.print("���v" + coinBox.getSum());
		System.out.println("�ł��B");
		//print�ɂ��\��
		coinBox.print();
		//�T�C�Y�̕\��
		System.out.println("�T�C�Y" + coinBox.size());
		//coinBox����Coin50�I�u�W�F�N�g�����o���B
		Value coin50 = coinBox.remove(50);
		System.out.println(coin50.getValue());
		//print�ɂ��\��
		coinBox.print();
		
		//coinBox����Coin100�I�u�W�F�N�g��1���o���B
		//���o�����I�u�W�F�N�g�̉��l��\������B
		Value coin100 = coinBox.remove(100);
		System.out.println(coin100.getValue());
	}
}