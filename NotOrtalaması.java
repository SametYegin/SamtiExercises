package org.samti;

import java.util.Scanner;

public class NotOrtalamas� {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Mat notunu gir");
		int mat = scan.nextInt();
		System.out.println("Fizik notunu gir");
		int fizik = scan.nextInt();
		System.out.println("Kimya notunu gir");
		int kimya = scan.nextInt();
		System.out.println("Tarih notunu gir");
		int tarih = scan.nextInt();
		System.out.println("T�rk�e notunu gir");
		int turkce = scan.nextInt();
		System.out.println("M�zik notunu gir");
		int muzik = scan.nextInt();
		
		int ortalama = (mat+fizik+kimya+tarih+turkce+muzik);
		double sonuc = ortalama/6.0 ;
		
		boolean kosul = (sonuc < 60);
		
		String str = (kosul) ? "S�n�fta kald�" : "S�n�f� ge�ti";
		
		System.out.println(str);
		
		
	}

}
