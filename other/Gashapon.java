import java.util.ArrayList;
import java.util.Random;

public class Gashapon{
	private Random random = new Random();
	private ArrayList<Capsule> arrayList = new ArrayList<Capsule>();
	public Gashapon(){
		this.arrayList.add(new Capsule(new Eraser("�L�����}��")));
		this.arrayList.add(new Capsule(new Eraser("�h���S���{�[��")));
		this.arrayList.add(new Capsule(new KeyHolder("�n���[�L�e�B")));
	}
	public Capsule gasha(){
		int size = this.arrayList.size();
		int number = this.random.nextInt(size);
		return this.arrayList.remove(number);
	}
}