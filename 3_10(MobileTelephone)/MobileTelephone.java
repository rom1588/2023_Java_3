import java.util.ArrayList;
public class MobileTelephone{
	private ArrayList<Application> list = new ArrayList<Application>();
	public MobileTelephone(){
	}
	public void addApplication(Application application){
		//listにapplicationを追加
		this.list.add(application);
	}
	public void execute(int number){
		//エラーチェック
		if(number < this.list.size()){
			//listからnumber番目のapplicationを取り出す。
			Application application = this.list.get(number);
			//取り出したapplicationを実行する。
			application.execute();
		}
	}
}