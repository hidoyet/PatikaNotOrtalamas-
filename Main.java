package notOrtalamasi;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner not=new Scanner(System.in);
		int fizik,kimya,turkce,tarih,toplam;
		double ortalama;
		System.out.println("Fizik notunuzu giriniz: ");
		fizik=not.nextInt();
		System.out.println("Kimya notunuzu giriniz: ");
		kimya=not.nextInt();
		System.out.println("Tarih notunuzu giriniz: ");
		tarih=not.nextInt();
		System.out.println("Türkçe notunuzu giriniz: ");
		turkce=not.nextInt();
		
		toplam=fizik+kimya+tarih+turkce;
		ortalama=toplam/4;
		
		String basariDurumu=(ortalama>60)?"Sýnýfý geçtiniz":"Sýnýfta kaldýnýz";
		System.out.println(basariDurumu);
	}

}
