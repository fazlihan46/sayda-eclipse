package day08ternaryoperator;

import java.util.Scanner;

public class TernaryOperator04 {

	public static void main(String[] args) {
	//TERNARY OPERATOR(IF ELSE IF)(NESTED TERNARY)
		
//Kullanicidan bir sayi aliniz
//sayi sifirdan buyuk ve  esit ise,10 dan kucuk olup olmadigini kontrol ediniz.
//10 dan kucuk ise ekrana "Rakam" yazdirin degilse "Pozitif sayi"yazdirin
//sayi 0 dan kucuk ise ekrana "Negatif sayi" yazdirin.
		
Scanner scan= new Scanner(System.in);
System.out.println("Lutfen bir sayi giriniz");
double num=scan.nextDouble();
 
String result=num>=0 ?(num<10? "Rakam":"Pozitif Sayi"): "Negatif sayi";
	System.out.println(num+" "+result+ "dir");	
	scan.close();	
		
	}

}
