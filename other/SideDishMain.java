public class SideDishMain {
    public static void main(String[] args){
        SideDish sideDish1 = new FriedFood("����", 200);
        SideDish sideDish2 = new MisoSoup("���", 100);
        System.out.println(sideDish1.getFood());
        System.out.println(sideDish1.getPrice());
        System.out.println(sideDish1.getName());
        sideDish1.print();
        sideDish2.print();
    }
}
