import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        
        System.out.println(A.length()+B.length());
        if(A.length()>B.length()){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
        char C = A.toUpperCase().charAt(0);
        char D = B.toUpperCase().charAt(0);
        System.out.println(C + A.substring(1) + " " + D + B.substring(1) );
        
    }
}

