public class B8_3{
	public static void main(String[] args){
		Box box = new ConcreteBox();
		box.add(new ConcreteBall(1));
		box.add(new ConcreteBall(2));
		box.add(new ConcreteBall(3));
		Ball ball1 = box.take();
		Ball ball2 = box.take();
		Ball ball3 = box.take();
		System.out.println("�{�[���̔ԍ��F" + ball1.getNumber());
		System.out.println("�{�[���̔ԍ��F" + ball2.getNumber());
		System.out.println("�{�[���̔ԍ��F" + ball3.getNumber());
	}
}