import java.util.Scanner;

public class DilimDaireAlan {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("yaricap gir");
		double r = scan.nextDouble();
		System.out.print("aci gir");
		double aci = scan.nextDouble();
		double pi = 3.14;
		
		double alan = (pi * r * r *aci)/360;
		System.out.println(alan);

	}

}
