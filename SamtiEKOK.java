package SamtiEx;
import java.util.Scanner;
public class SamtiEKOK {

	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
        System.out.print("Küçük Sayýyý giriniz: ");
        int kucuksayi = inp.nextInt();
        
        Scanner inq = new Scanner(System.in);
        System.out.print("Büyük Sayýyý giriniz: ");
        int buyuksayi = inq.nextInt();
        int kat = 1;
        	if (kucuksayi <= buyuksayi) {
        		System.out.println("hesaplýyorum....");
        		   while(kat<=kucuksayi) {
        	        	if((buyuksayi*kat)%kucuksayi==0) {
        	        		System.out.println("Ekok =" +(buyuksayi*kat));
        	        		break;
        	        	}
        	        	
        	        	
        	        	else {
        	        		
        	        	
        	        	kat++;
        	        	}
        	        }
                        	
        }else {
            System.out.println("Sayýlarýn büyüklüðü yanlýþ girildi");
        }
        
        	
        
       
       
        
     
        }
        	
	}

        
	


