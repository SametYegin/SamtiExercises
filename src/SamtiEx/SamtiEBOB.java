package SamtiEx;
import java.util.Scanner;

public class SamtiEBOB {

	public static void main(String[] args) {
		 Scanner inp = new Scanner(System.in);
	        System.out.print("Ýlk sayýyý giriniz: ");
	        int sayi1 = inp.nextInt();
	        System.out.print("Ýkinci sayýyý giriniz: ");
	        int sayi2 = inp.nextInt();

	        int kucukSayi = Math.min(sayi1,sayi2);
	        int ebob = 0;
	        for(int i = kucukSayi;i>0;i--){
	            if(sayi1%i==0 && sayi2%i==0){ //her iki sayýyýda bölüyorsa
	                ebob = i;
	                break; 

	            }

	        }

	        System.out.println("EBOB :"+ebob);
		

	}

}
