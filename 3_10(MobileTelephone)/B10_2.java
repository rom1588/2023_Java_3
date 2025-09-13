public class B10_2{
	public static void main(String[] args){
		MobileTelephone phone = new MobileTelephone();
		phone.addApplication(new Clock());
		phone.addApplication(new CurrentTimeClock());
		phone.execute(0);
		System.out.println();
		phone.execute(1);
		
	}
}