import java.util.Scanner;

public class ArtikYil {

	public static void main(String[] args) {

      int year;
      
      Scanner scan = new Scanner(System.in);
      
      year = scan.nextInt();
      
      if(year%4==0) {
    	  
    	  System.out.println("Girdiðin yýl artýk yýldýr");
      }else if(year%100 == 0 && year%400==0) {
    	  System.out.println("Girdiðin yýl artýk yýldýr");
      }else {
    	  System.out.println("Girdiðiniz yýl artýk deðildir");
      }

	}

}
