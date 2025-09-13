public class B7_2{
	public static void main(String[] args){
		Educatee educatee1 = new Educatee("00ID00", "nakamura");
		Educatee educatee2 = educatee1;
		educatee1.setPassword("00");
		System.out.println(educatee1.getPassword());
		System.out.println(educatee2.getPassword());
	}
}