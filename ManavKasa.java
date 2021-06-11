import java.util.Scanner;

public class ManavKasa {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Armut kac kilo ?");
		double Armutkg = scan.nextDouble();
		System.out.println("Elma kac kilo ?");
		double Elmakg = scan.nextDouble();
		System.out.println("Domates kac kilo ?");
		double Domateskg = scan.nextDouble();
		System.out.println("Muz kac kilo ?");
		double Muzkg = scan.nextDouble();
		System.out.println("Patlican kac kilo ?");
		double Patlicankg = scan.nextDouble();
		
		double toplamtutar = (Armutkg*2.14) + (Elmakg*3.67) + 
				(Domateskg*1.11) + (Muzkg*0.95) + (Patlicankg*5.0);
		
		System.out.println("Toplam tutar : " + toplamtutar);

	}

}
