package day06ifstatement;

import java.util.Scanner;

public class IfElseIfStatement01 {

	public static void main(String[] args) {
//Kullanicidan yasini alin yas 13 den az ise ekrana calisamaz msji	verin
//yas 13 den 65 e kadar ise ekrana calisabilir yazdirin
//yas 65 den buyukse ekrana emekli yazdirin
//Negatif sayi girese"yas negatif olamaz"msji gorsun
	
		
		
Scanner scan=new Scanner(System.in);
System.out.println("Lutfen yasinizi giriniz");
int yas=scan.nextInt();

if(yas<0) {System.out.println("Yas negatif olamaz");}
else if(yas<13) 
{System.out.println("Calisamaz");
}else if(yas<=65) {System.out.println("Calisabilir");}
else {System.out.println("Emekli");
}
//Bu kodu test etmek icin min 5 sayi ile test etmem gerekiyor.oncesinde,sinirda,sonrasinda,arasinda		
		
		
		
	}

}
