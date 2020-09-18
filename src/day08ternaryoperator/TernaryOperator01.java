package day08ternaryoperator;

import java.util.Scanner;

public class TernaryOperator01 {

	public static void main(String[] args) {
//Kullanicidan bir sayi aliniz.
//Eger sayi pozitif veya 0 ise ekrana "Pozitif"
//sayi negatif ise "Negatif" yaziniz.
		
Scanner scan=new Scanner(System.in);
System.out.println("Lutfen bir sayi giriniz");
double num=scan.nextDouble();

//if(num>=0) {System.out.println("Pozitif veya 0");
//}else{System.out.println("Negatif");}

//TERNARY OPERATOR(IF ELSE)
//       condition , soru isareti, Condition dogru ise ,Iki nokta ust uste ,Condition yanlis ise
		
String sonuc= num>0 	?	"Pozitif veya 0"                :                  "Negatif";
System.out.println(sonuc);		
	
scan.close();

		
	}

}
