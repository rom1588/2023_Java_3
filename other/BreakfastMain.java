public class BreakfastMain{
	public static void main(String[] args){
		Breakfast lunchSet = new Breakfast();
		lunchSet.setCoffee(new Coffee("�u���W��", 350));
		lunchSet.addBread(new Roll("���[�Y���o�^�[", 120));
		lunchSet.addBread(new Toast("�x�[�R���G�b�O", 200));
		lunchSet.print();
		System.out.println("���v" + lunchSet.getTotalPrice() + "�~");
	}
}