import java.util.Scanner;

public class Burc {

	public static void main(String[] args) {
		int month,day;
		
		Scanner scan = new Scanner(System.in);
		
		month = scan.nextInt();
		
		day = scan.nextInt();
		
		if(month == 1 && day < 22) {
			System.out.println("Oglak");
		}else if(month==1 && day >=22) {
			System.out.println("Kova");
		}else if(month==2 && day <20) {
			System.out.println("Kova");
		}else if(month==2 && day >=20) {
			System.out.println("Balýk");
		}else if(month==3 && day <21) {
			System.out.println("Balýk");
		}else if(month==3 && day >=21) {
			System.out.println("Koç");
		}else if(month==4 && day <21) {
			System.out.println("Koç");
		}else if(month==4 && day >=21) {
			System.out.println("Boða");
		}else if(month==5 && day <22) {
			System.out.println("Boða");
		}else if(month==5 && day >=22) {
			System.out.println("Ýkizler");
		}else if(month==6 && day <23) {
			System.out.println("Ýkizler");
		}
				
	}

}
