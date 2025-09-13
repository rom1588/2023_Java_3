public class B8_1{
	public static void main(String[] args){
		Ball ball1 = new ConcreteBall(1);
		Ball ball2 = new ConcreteBall(2);
		System.out.println(ball1.getNumber());
		System.out.println(ball2.getNumber());
	}
}