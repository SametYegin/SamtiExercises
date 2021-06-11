import java.util.Scanner;

public class TaksiUcret {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double km = scan.nextDouble();
		double KmBasina = 2.20;
		double BaslangicUcreti = 10.0;
		double total = BaslangicUcreti + (km * KmBasina);
		total = (total < 20) ? 20 : total ;
		System.out.println(total);
	}

}
