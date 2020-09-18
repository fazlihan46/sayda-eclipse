package day03operators;

public class TypeCasting01 {

	public static void main(String[] args) {
		
		byte by=101;
		int sayi=by;// kucuk data tipini buyuk data tipine cevirmek icin 
		//ekstra kod yazmaya gerek yok.Java bunu otomatik olarak yapabilir.
		
		System.out.println(sayi);

		int sayi2=53;
	 byte by2=(byte) sayi2;// buyuk data tipini kucuk datatipine cevirmek java 
		//tarafindan yapilmaz.Ornekteki gibi cevirmek istedigimiz java tipini
		//parentez icinde yazmaliyiz.
		System.out.println(by2);
		double sayi3=23.9;
		int by3=(int)sayi3;
		System.out.println(by3);//23
		
	float sayi4=-23.9f;
	short by4=(short)sayi4;
	System.out.println(by4);// -23
		
		double sayi5=4.8;
		double sayi6=1.4;
		double sonuc=sayi5/sayi6;
		System.out.println(sonuc);//3.428571428571429
		
int sonuc2=(int)(sayi5/sayi6);
System.out.println(sonuc2); //3

int sayi7=5;
int sayi8=3;
int sonuc3=sayi7/sayi8;

   System.out.println(sonuc3);//Normalde 5/3=1.66666...ama data type int yaparsaniz
//sadece tam kismi gorursunuz.

int sayi9=255;
byte by5=(byte)(sayi9);
System.out.println(by5);//255 byte in sinirlari icinde degil.normalde byte da 256 tane
//sayi var.(-128.....127 e kadar).biz 255 yazinca bi tane eksik bu yuzden -1 ekrana
//yazilir.








	}

}
