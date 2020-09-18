package day09switchoperater;

import java.util.Scanner;

public class Switch04 {

	public static void main(String[] args) {
//Kullanicidan notunu alin ve asagidaki kurallara gore ekrana A,B,C veya D
		//1)0 dahil ile 50 arasi "D"
		//2)50 dahil ile 60 arasi "C"
		//3)60 dahil ile 80 arasi"B"
		//4)80 dahil ustu "A"
//switch kullanin
	//switch()de long,double,boolean,float kullanilmaz	
	//switch de int,byte,short,char,String kullanilir	
		
		
Scanner scan=new Scanner (System.in);
System.out.println("Lutfen notunuzu giriniz.");
int not=scan.nextInt();
//switch de case ifadesinden sonra sadece bir deger yazabilirsiniz
//herhangi bir islem yapamazsiniz
if(not>=0&& not<50) {
	not=0;
	}else if (not>=50 && not<60) { 
		not=50;
	}
	else if (not>=60 && not<80) {
		not=60;
	}
	else if (not>=80 && not<=100) { 
		not=80;
	
}




 switch(not) {
	case 0:System.out.println("D");
	break;
	case 50:System.out.println("C");
	break;
	case 60:System.out.println("B");
	break;
	case 80:System.out.println("A");
	break;
	default:System.out.println("Gecerli not giriniz.");
	
}

		
		
		
		
		
		
		
	}

}
