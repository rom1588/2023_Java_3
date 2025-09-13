import java.util.ArrayList;
public class MobileTelephone{
	private ArrayList<Application> list = new ArrayList<Application>();
	public MobileTelephone(){
	}
	public void addApplication(Application application){
		//list��application��ǉ�
		this.list.add(application);
	}
	public void execute(int number){
		//�G���[�`�F�b�N
		if(number < this.list.size()){
			//list����number�Ԗڂ�application�����o���B
			Application application = this.list.get(number);
			//���o����application�����s����B
			application.execute();
		}
	}
}