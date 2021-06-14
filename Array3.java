import java.util.Scanner;

public class Array3 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		
		
		
		int[] list = {15,12,788,1,-1,-778,2,0};
		
		int enYakinBuyuk = list[0];
		int enYakinKucuk = list[0];
		
		int rangemin = Math.abs(list[0] - n);
		int rangemax = Math.abs(list[0] - n);
		
		
		for(int i : list) {
			if(i < n && Math.abs(i-n) < rangemin) {
				rangemin = Math.abs(i-n);
				enYakinKucuk = i;
			}
			
			if(i > n && Math.abs(i-n) < rangemax) {
				rangemax = Math.abs(i-n);
				enYakinBuyuk = i;
			}
			
			
		}
		
		System.out.println(enYakinKucuk);
		System.out.println(enYakinBuyuk);
		
		

	}

}
