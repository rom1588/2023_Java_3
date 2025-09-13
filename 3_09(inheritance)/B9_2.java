public class B9_2{
	public static void main(String[] args){
		SubEducator educator1 = new SubEducator("ID0123","naka");
		SubEducator educator2 = new SubEducator("IE0002","ooyama");
		System.out.println(educator1.getName());
		System.out.println(educator2.getName());
		
		educator1.setPassword("test");
		System.out.println(educator1.getPassword());
		System.out.println(educator1.getID());
		
		educator2.setPassword("pass");
		System.out.println(educator2.getPassword());
	}
}