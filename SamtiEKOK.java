package SamtiEx;
import java.util.Scanner;
public class SamtiEKOK {

	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
        System.out.print("K���k Say�y� giriniz: ");
        int kucuksayi = inp.nextInt();
        
        Scanner inq = new Scanner(System.in);
        System.out.print("B�y�k Say�y� giriniz: ");
        int buyuksayi = inq.nextInt();
        int kat = 1;
        	if (kucuksayi <= buyuksayi) {
        		System.out.println("hesapl�yorum....");
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
            System.out.println("Say�lar�n b�y�kl��� yanl�� girildi");
        }
        
        	
        
       
       
        
     
        }
        	
	}

        
	


