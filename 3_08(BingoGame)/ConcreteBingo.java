import jp.tdu.util.KeyboardReader;

public class ConcreteBingo implements Bingo{
	private Box box = new ConcreteBox();
	public ConcreteBingo(){
		for(int i = 0; i < 75; i++){
			this.box.add(new ConcreteBall(i + 1));
		}
	}
	public void play(){
		int size = this.box.size(); //試験で必ず入れること
		for(int i = 0; i < size; i++){//75回Ballオブジェクトを取り出す。
			KeyboardReader.readString();
			//Ballオブジェクトをboxから一つ取り出す（変数Ballに代入）
			Ball ball = this.box.take();
			//取り出したBallオブジェクトの番号を読み取り、
			//読み取った番号を表示する。
			System.out.println("番号：" + ball.getNumber());
		}
	}
}