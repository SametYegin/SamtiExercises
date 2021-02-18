package SamtiEx;
import java.util.Scanner;

public class SamtiAsalCarpan {

	public static void main(String[] args) {
		
		 Scanner inp = new Scanner(System.in);
	        System.out.print("Sayýyý giriniz: ");
	        int sayi = inp.nextInt();

	        int bolen = 2; 
	        int bolunen = sayi;

	        System.out.print("Asal çarpanlar : ");
	        while(bolen<sayi){ 
	            if(bolunen % bolen == 0){ 
	                System.out.print(bolen+" ");
	                bolunen /= bolen;

	            }else{ 
	                bolen++;
	            }

	        }
	        System.out.print(sayi == bolunen ? "Asal sayý Girdiniz":"");
		

	}

}
