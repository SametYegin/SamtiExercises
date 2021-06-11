import java.util.Scanner;

public class Ucgen {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("ilk kenarýn uzunluðu:");
		double a = scan.nextDouble();
		System.out.println("ikinci kenarýn uzunluðu:");
		double b = scan.nextDouble();
		System.out.println("üçüncü kenarýn uzunluðu:");
		double c = scan.nextDouble();
		
		double u = (a+b+c)/2;
		
		double alan = Math.sqrt( u * (u - a)* (u - b) * (u - c));
		System.out.println("Ucgenin alaný :" +alan);		
		
	}

}
