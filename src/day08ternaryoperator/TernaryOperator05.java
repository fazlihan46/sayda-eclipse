package day08ternaryoperator;

import java.util.Scanner;

public class TernaryOperator05 {

	public static void main(String[] args) {
//Kullanicidan bir 	character girmesini isteyiniz.
		//Character harf ise kucuk harf olup olmadigini kontrol ediniz.
		//kucuk harf ise ekrana"Kucuk Harf" yazdirini
		//Buyuk harf ise ekrana"Buyuk Harf" yazdirin
		//harf degilse ekrana"Harf Degildir" yazdiriniz.
Scanner scan=new Scanner(System.in);
System.out.println("Lutfen bir character giriniz");
char ch=scan.next().charAt(0);
//ASCII table a bakacagiz,
String result=((ch<=122 && ch>=97)||(ch>=65&& ch<=90))?((ch<=122 && ch>=97)?"Kucuk Harf":"Buyuk Harf"): "Harf Degil";
		System.out.println(result);
//Rakamlar yerine harfleri de kullanabiliriz
		//ch<='z' && ch>='a'	ch>='A' && ch<='Z'
		
		
		scan.close();
		
		

	}

}
