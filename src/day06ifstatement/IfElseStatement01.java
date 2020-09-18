package day06ifstatement;

import java.util.Scanner;

public class IfElseStatement01 {

	private static final int Java2020 = 0;

	public static void main(String[] args) {
	//Kullanicidan pasword girmesini isteyin
	//Pasword dogru ise ekrana "Password dogru"
	//Password yanlis ise ekrana"Password yanlis,tekrar deneyin" yazdirin
	//Dogru password=Java2020

Scanner scan=new Scanner(System.in);
System.out.println("Lutfen,Password giriniz");
String pass=scan.next();
if(pass.equals("Java2020")){System.out.println("Password dogru");}else
 {System.out.println("Password yanlis,tekrar deneyin");}

//benString olusturdugumda java heap memoride container olusturdu adini password yapti.onun 
//adresi or:123.cadde diye adres verdi
//ben cift tirnak icinde java 2020 yazinca heap memoride container olusturdu.
//onun da adresi stack memoride or:456.cadde,
//Ben iki esittir koyunca java iki degere bakardegerleri ayni mi adresleri aynimi diye
//bakti degerler ayni ama adresler ayni degil.Bu durumda:
//Javanin adreslere bakmasini engelleyecegiz.== sembolu yerine nokta koy equalsi sec.
//Stringlerin esitligini kontrol ederken asla== isaretini kullanmayin.Onun yerine equals metodu kullan

		
		
		
		
	}

}
