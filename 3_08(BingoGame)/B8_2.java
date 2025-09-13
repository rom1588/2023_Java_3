public class B8_2{
	public static void main(String[] args){
		Box box = new ConcreteBox();
		box.add(new ConcreteBall(1));
		box.add(new ConcreteBall(2));
		box.add(new ConcreteBall(3));
	}
}