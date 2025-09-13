import java.util.ArrayList;

public class EducateeList{
	private ArrayList<Educatee> arrayList= newArrayList<Educatee>();
	public EducateeList();
	public void add(Educatee educatee){
		this.arrayList.add(Educatee);
	}
	public Educatee get(int number){
		int size = this.arrayList.size();
		for(int i = 0; i < size; i++){
			Educatee educateee = this.arrayList.get(i);
		}
		return this.arrayList.get(i);
	}
	public int getAverageHeight(){
		int sum = 0;
		int size = this.arrayList.size();
		for(int i = 0; i < size; i++){
			Educatee educatee = this.arrayList.get(i);
			sum = sum + Educatee.getEducatee()
		}
		return sum / size;
	}
	public int size(){
		return thi.arraList.size();
	}
}