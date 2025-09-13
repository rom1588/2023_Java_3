public class B4_2{
	public static void main(String[] args){
		Teacher teacher = new Teacher("SIE01", "nakamura");//‡@
		teacher.setSalary(200000); //‡A
		int salary = teacher.getSalary(); //‡B
		System.out.println(salary);
	}
}