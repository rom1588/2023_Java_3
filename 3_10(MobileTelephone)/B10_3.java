public class B10_3{
	public static void main(String[] args){
		MobileTelephone phone = new MobileTelephone();
		phone.addApplication(new Clock());
		phone.addApplication(new CurrentTimeClock());
		phone.addApplication(new Clock24(13, 40, 18));
		phone.execute(0);
		System.out.println();
		phone.execute(1);
		System.out.println();
		phone.execute(2);
	}
}