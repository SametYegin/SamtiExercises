import java.util.Scanner;

public class Notort2 {

	public static void main(String[] args) {
		int mat,fizik,turkce,kimya,muzik;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Matematik notunuz :");
		mat = scan.nextInt();
		System.out.println("Fizik notunuz :");
		fizik = scan.nextInt();
		System.out.println("Türkçe notunuz :");
		turkce = scan.nextInt();
		System.out.println("Kimya notunuz :");
		kimya = scan.nextInt();
		System.out.println("Müzik notunuz :");
		muzik = scan.nextInt();
		
		double avarage;
		
		if(mat < 0 || mat > 100) {
			mat = 0;
		}else if(fizik < 0 || fizik > 100) {
			 fizik = 0;
		}else if(turkce < 0 || turkce > 100) {
			 turkce = 0;
		}else if(kimya < 0 || kimya > 100) {
			 kimya = 0;
		}else if(muzik < 0 || muzik > 100) {
			 muzik = 0;
		}
		
		avarage = (mat + fizik + turkce + kimya + muzik)/5;
		
		if(avarage<55) {
			System.out.println("Sýnýfta kaldýnýz");
		}else {
			System.out.println("Sýnýfý gectiniz");
		}
		System.out.println("Ortalamanýz : " + avarage);

	}

}
