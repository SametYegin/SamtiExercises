import java.util.Scanner;

public class ArtikYil {

	public static void main(String[] args) {

      int year;
      
      Scanner scan = new Scanner(System.in);
      
      year = scan.nextInt();
      
      if(year%4==0) {
    	  
    	  System.out.println("Girdi�in y�l art�k y�ld�r");
      }else if(year%100 == 0 && year%400==0) {
    	  System.out.println("Girdi�in y�l art�k y�ld�r");
      }else {
    	  System.out.println("Girdi�iniz y�l art�k de�ildir");
      }

	}

}
