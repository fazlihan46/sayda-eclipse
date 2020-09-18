package day10Stringmethods;

import java.util.Scanner;

public class OdevSorusuSwitchStatement {

	public static void main(String[] args) {
//	Kullanicidan ay ismi alin.Eger ay ismi 31 ceken aylardan biri ise ekrana"Bu ay 31 gundur"
//Eger ay ismi 30 ceken aylardan biri ise ekrana "Bu ay 30 gundur" yazdirin
//Eger ay ismi 28 veya 29 ceken aylardan biri ise ekrana "Bu ay Subat ayidir" yazdirin
//Bu isimlerin disindaki isimler icin "Gecersiz ay ismi"yazdirin.
		
		
Scanner scan=new Scanner(System.in);
System.out.println("Lutfen bir ay ismi giriniz.");
String ay=scan.next();

ay=ay.toLowerCase();

switch(ay) {
case"ocak":
	System.out.println("Bu ay 31 gundur");
	break;
case"subat":
	System.out.println("Bu ay 28 veya 29 gundur");
	break;
case"mart":
	System.out.println("Bu ay 31 gundur");
	break;
case"nisan":
	System.out.println("Bu ay 30 gundur");
	break;
case"mayis":
	System.out.println("Bu ay 31 gundur");
	break;
case"haziran":
	System.out.println("Bu ay 30 gundur");
	break;
case"temmuz":
	System.out.println("Bu ay 31 gundur");
	break;
case"agustos":
	System.out.println("Bu ay 31 gundur");
	break;
case"eylul":
	System.out.println("Bu ay 30 gundur");
	break;
case"ekim":
	System.out.println("Bu ay 30 gundur");
	break;
case"kasim":
	System.out.println("Bu ay 31 gundur");
	break;
case"aralik":
	System.out.println("Bu ay 31 gundur");
	break;
	default:System.out.println("Gecersiz ay ismi.");	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
}











		
		
	}

}
