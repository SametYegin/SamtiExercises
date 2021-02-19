package SamtiEx;
import java.util.Scanner;

public class HarfSayýsý {

	public static void main(String[] args) {
		Scanner strinp = new Scanner(System.in);
        System.out.print("Kelimeyi giriniz ");
        String kelime = strinp.nextLine();
        
       char harf = 'a';
        int a = 0;
        for(int i = 0; i<kelime.length() ;i++) {
        	
        	if(kelime.charAt(i) == harf) {
        		a++;
        	}
        	}
        	
        System.out.println("harf "+ a + " kadar tekrar etmiþtir");
        	
        }
        
        
		

	}


