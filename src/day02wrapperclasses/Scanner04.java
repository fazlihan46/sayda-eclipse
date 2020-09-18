package day02wrapperclasses;

import java.util.Scanner;

public class Scanner04 {

	public static void main(String[] args) {
		//Kullanicidan dikdortgenin boyutlarini alan sonra dikdortgenin alan ve cevresini 
		//hesaplayip ekrana yazdiran bir program yaziniz.
		//Not:Alan=boy*en
		//cevre =2*(boy+en)

		Scanner scan= new Scanner(System.in);
		System.out.println("Lutfen,dikdortgenin en ve boyunu giriniz");
		int en=scan.nextInt();
		int boy=scan.nextInt();
		
		System.out.println(en*boy);
		System.out.println(2*(en+boy));
		
		
				
		
		
	}

}
