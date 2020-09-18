package day06ifstatement;

import java.util.Scanner;

public class IfElseStatement03 {

	public static void main(String[] args) {
//Kullanicidan alacagi urun miktarini ve fiyatini alalim
//Eger kullanici 1000 den fazla urun alirsa %20 indirim yapin ve
//Eger kullanici 1000 den az veya 1000 urun alirsa indirim yapmayin	
		//kullanicinin odeyecegi toplam fiyati ekrana yazdirin
//60TL ye%20 indirim==>60*80/100
		
Scanner scan=new Scanner(System.in);
System.out.println("Lutfen urun miktarini giriniz");
int miktar=scan.nextInt();
System.out.println("Lutfen birim fiyati giriniz");
double fiyat=scan.nextDouble();
if(miktar>1000) {System.out.println(miktar*(fiyat*80)/100);}else{System.out.println(fiyat*miktar);}
	
		
		
		
	}

}
