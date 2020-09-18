package day09switchoperater;

import java.util.Scanner;

public class Switch02 {

	public static void main(String[] args) {
//Kullanici  haftanin gun numarasini girsin	
		//Programiniz gunun ismini yazsin
		//switch kullanarak yapiniz
	//yanlis gun girerse "Gecerli gun sayisi giriniz"	
Scanner scan=new Scanner (System.in);
System.out.println("Gun numarasini giriniz");
int gunNum=scan.nextInt();

switch (gunNum) {
case 1:System.out.println("Pazartesi");
break;
case 2:System.out.println("Sali");
break;
case 3:System.out.println("Carsamba");
break;
case 4:System.out.println("Persembe");
break;
case 5:System.out.println("Cuma");
break;
case 6:System.out.println("Cumartesi");
break;
case 7:System.out.println("Pazar");
break;
default:System.out.println("Gecerli gun sayisi giriniz");
}
		
		
		
		
		
		

	}

}
