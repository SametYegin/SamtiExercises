import java.util.Scanner;

public class CinZodyagi {
	
	public static void main(String[] args) {
		
		int birth;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Dogum y�l�n�z : ");
		birth = scan.nextInt();
		
		int zodyakdeger = birth%12;
		
		switch(zodyakdeger) {
		
		case 0 : System.out.println("Maymun");
		break;
		
		case 1 : System.out.println("Horoz");
		break;
		
		case 2 : System.out.println("K�pek");
		break;
		
		case 3 : System.out.println("Domuz");
		break;
		
		case 4 : System.out.println("Fare");
		break;
		
		case 5 : System.out.println("�k�z");
		break;
		
		case 6 : System.out.println("Kaplan");
		break;
		
		case 7 : System.out.println("Tav�an");
		break;
		
		case 8 : System.out.println("Edjerha");
		break;
		
		case 9 : System.out.println("Y�lan");
		break;
		
		case 10 : System.out.println("At");
		break;
		
		case 11 : System.out.println("Koyun");
		break;
		
		
		}
	}

}
