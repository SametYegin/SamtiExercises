package org.samti;

import java.util.Scanner;

public class NotOrtalamasý {
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
		System.out.println("Türkçe notunu gir");
		int turkce = scan.nextInt();
		System.out.println("Müzik notunu gir");
		int muzik = scan.nextInt();
		
		int ortalama = (mat+fizik+kimya+tarih+turkce+muzik);
		double sonuc = ortalama/6.0 ;
		
		boolean kosul = (sonuc < 60);
		
		String str = (kosul) ? "Sýnýfta kaldý" : "Sýnýfý geçti";
		
		System.out.println(str);
		
		
	}

}
