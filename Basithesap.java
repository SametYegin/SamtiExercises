import java.util.Scanner;

public class Basithesap {

	public static void main(String[] args) {


		Scanner scan = new Scanner(System.in);
		
		int n1 = scan.nextInt();
		int n2 = scan .nextInt();
		int select;
		
		System.out.println("1-Toplama\n2-Çýkarma\n3-Çarpma\n4-Bölme");
		System.out.println("Seçiminiz ?");
		select = scan.nextInt();
		
		switch(select) {
		
		case 1: {
			System.out.println(n1+n2);
			break;
		}
		
		case 2: {
			System.out.println(n1-n2);
			break;
		}
		
		case 3: {
			System.out.println(n1*n2);
			break;
		}
		
		case 4: {
			System.out.println(n1/n2);
			break;
		}
		
		default : {
			System.out.println("Ýþlem dýþý girdi");
		}
			
		
		}
				

	}

}
