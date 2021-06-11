import java.util.Scanner;

public class UcakBileti {

	public static void main(String[] args) {
		int select,age,km;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Yolculuk tipinizi seçin\n1-Tek yön\n2-Gidiş-Dönüş");
		select = scan.nextInt();
		
		System.out.print("Yaşınız ?");
		age = scan.nextInt();
		
		System.out.println("Mesafe :");
		km = scan.nextInt();
		
		if(km > 0 && age > 0 && select == 1 ) {
			
			
		
		
	
		
		
			
			double perKm = 0.10;
			double tutar = km * perKm;
			
			if(age < 12) {
				tutar -= tutar*0.5;
			}else if(age>= 12 && age<24) {
				tutar -= tutar*0.1;
			}else if(age > 65) {
				tutar -= tutar*0.3;
			}
			
			System.out.println("Toplam tutar : " + tutar);
			
			
		  
		}else if(km > 0 && age > 0 && select == 2){
			
			
			double perKm = 0.10;
			double tutar = 2 * km * perKm;
			tutar -= tutar*0.2;
			if(age < 12) {
				tutar -= tutar*0.5;
			}else if(age>= 12 && age<24) {
				tutar -= tutar*0.1;
			}else if(age > 65) {
				tutar -= tutar*0.3;
			}else if(select == 2) {
				tutar -= tutar*0.2;
			}
			
			System.out.println("Toplam tutar : " + tutar);
			
			
		}else {
			System.out.println("Hatalı giris yaptınız");
		}
		
		
		
		
		

	}

}
