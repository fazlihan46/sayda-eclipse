package day02wrapperclasses;

import java.util.Scanner;

public class Scanner05 {

	public static void main(String[] args) {
		/* Yaricapi kullanicidan alinan bir dairenin cevresini ve alanini hesaplayin
		 * (float kullaniniz)
		 * not1: pi sayisi:3.14159
		 * not2:Alan:3.14159*yaricap*yaricap
		 * not3:Cevre:2*3.14159*yaricap
		 */
Scanner scan=new Scanner(System.in);
System.out.println("Lutfen, yaricapi giriniz");
double yaricap = scan.nextDouble();//data tipi int ise next int kullanilir
//Data tipi double ise next double kullanilir vs.
System.out.println(3.14159*yaricap*yaricap);
System.out.println(2*3.14159*yaricap);

	}

}
