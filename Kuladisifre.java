import java.util.Scanner;

public class Kuladisifre {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Kullan�c� ad�n�z : ");
		String ID = scan.nextLine();
		System.out.print("Sifrenizi girin :");
		String sifre = scan.nextLine();
		
		if(ID.equals("Samet") && sifre.equals("Yegin")) {
			
			System.out.println("Giris yaptiniz");
		}else {
			System.out.println("Yanl�s bilgi");
			System.out.println("Sifrenizi s�f�rlamak ister misiniz ? Yeni sifrenizi olusturun.");
			String yenisifre = scan.nextLine();
			if(yenisifre.equals("Yegin")) {
				System.out.println("Sifreniz ayni olamaz");
			}else {
				System.out.println("Sifre olusturuldu.");
			}
		}

	}

}
