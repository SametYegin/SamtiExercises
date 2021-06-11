import java.util.Scanner;

public class VucutKitleEndeks {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Boyunuzu girin");
		double boy = scan.nextDouble();
		System.out.println("Kilonuzu girin");
		double kilo = scan.nextDouble();
		
		double KitleEndeks = kilo / (boy * boy);
		System.out.println("Vucut endeksiniz : " + KitleEndeks);

	}

}
