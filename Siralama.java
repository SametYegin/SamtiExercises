import java.util.Scanner;

public class Siralama {

	public static void main(String[] args) {
		int a,b,c;
		
		Scanner scan = new Scanner(System.in);
		
		a = scan.nextInt();
		b = scan.nextInt();
        c = scan.nextInt();
        
        if(a<c && a<b) {
        	if(c<b) {
        		System.out.println("a<c<b");
        	}else {
        		System.out.println("a<b<c");
        	}
        }else if(b<a && b<c) {
        	if(c<a) {
        		System.out.println("b<c<a");
        	}else {
        		System.out.println("b<a<c");
        	}
        }else if(c<a && c<b) {
        	if(a<b) {
        		System.out.println("c<a<b");
        	}else {
        		System.out.println("c<b<a");
        	}
        }
	}

}
