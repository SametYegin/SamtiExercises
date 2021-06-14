import java.util.Arrays;
import java.util.Scanner;

public class Array4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Dizi kaç elemanlý ?");
		int n = scan.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i<n; i++) {
			System.out.println(i+1 + ". elemaný giriniz : ");
			int c = scan.nextInt();
			arr[i] = c ;
		}
		
		Arrays.sort(arr);
		
		System.out.println(Arrays.toString(arr));
		

	}

}
