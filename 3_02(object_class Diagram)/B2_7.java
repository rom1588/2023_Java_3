public class B2_7{
	public static void main(String[] args){
		Teacher teacher1 = new Teacher("t02","è¨ír");
		Teacher teacher2 = new Teacher("t02","çÇìc");
		teacher1.setSalary(200000);
		//1
		String id1 = teacher1.getId();
		String name1 = teacher1.getName();
		int salary1 = teacher1.getSalary();
		String id2 = teacher2.getId();
		String name2 = teacher2.getName();
		int salary2 = teacher2.getSalary();
		System.out.println(id1 + " " + name1 + " " + salary1);
		System.out.println(id2 + " " + name2 + " " + salary2);
	}
}