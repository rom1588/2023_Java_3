import jp.tdu.util.KeyboardReader;

public class ConcreteBingo implements Bingo{
	private Box box = new ConcreteBox();
	public ConcreteBingo(){
		for(int i = 0; i < 75; i++){
			this.box.add(new ConcreteBall(i + 1));
		}
	}
	public void play(){
		int size = this.box.size(); //�����ŕK������邱��
		for(int i = 0; i < size; i++){//75��Ball�I�u�W�F�N�g�����o���B
			KeyboardReader.readString();
			//Ball�I�u�W�F�N�g��box�������o���i�ϐ�Ball�ɑ���j
			Ball ball = this.box.take();
			//���o����Ball�I�u�W�F�N�g�̔ԍ���ǂݎ��A
			//�ǂݎ�����ԍ���\������B
			System.out.println("�ԍ��F" + ball.getNumber());
		}
	}
}