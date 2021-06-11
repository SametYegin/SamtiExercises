import java.util.Scanner;

public class KdvHesap {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Ucret tutarýný giriniz");
		double tutar = scan.nextDouble();
		double kdvOran = 0.18;
		double kdvOran2 = 0.8;
		boolean sorgu = tutar < 1000.0;
		double toplamtutar = (sorgu) ? tutar*kdvOran : tutar*kdvOran2;
		System.out.println(toplamtutar);
		
		

	}

}
