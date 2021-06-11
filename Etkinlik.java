import java.util.Scanner;

public class Etkinlik {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int sicaklik = scan.nextInt();
		
		if(sicaklik < 5) {
			System.out.println("Kayak yapýn");
		}else if(sicaklik>= 5 && sicaklik < 15) {
			System.out.println("Sinemaya gidin");
			
			if(sicaklik>10 && sicaklik<15) {
				System.out.println("Piknik de yapabilirsiniz");
			}
			
		}else if(sicaklik>=15 && sicaklik<25) {
			System.out.println("Piknik yapýn");
		}
		
		
		else {
			System.out.println("Yüzmeye gidin");
		}

	}

}
