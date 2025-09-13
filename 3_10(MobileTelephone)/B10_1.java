public class B10_1{
	public static void main(String[] args){
		MobileTelephone phone = new MobileTelephone();
		phone.addApplication(new Clock());
		phone.execute(0);
	}
}