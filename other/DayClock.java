public class DayClock implements Application{
	private int day;
	private String week;
	private int hour;
	private int minute;
	private int second;
	public DayClock(int day, String week, int hour, int minute, int second){
		this.day = day;
		this.week = week;
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}
	public void execute(){
		System.out.println("DayClock");
		System.out.print(this.day + ":");
		System.out.print(this.week + ":");
		System.out.print(this.hour + ":");
		System.out.print(this.minute + ":");
		System.out.println(this.second);
	}
}