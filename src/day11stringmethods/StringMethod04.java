package day11stringmethods;

public class StringMethod04 {

	public static void main(String[] args) {
//valueOf methodu rakamlarla olusturulan stringleri sayiya donusturur boylece rakamlarla olusturulan
		//Stringlerle matematiksel islemler yapabilmemizi saglar
//valueOf() hem Integer wrapper class sinin icinde hem de Stringin icinde var.
//Integer wrapper classinin icinde olan	valuOf() methodu Stringi integera cevirir.	
String paraErkek="1900";
String paraKadin="2000";
		
//Bu ailenin toplam gelirini bulunuz

	System.out.println(Integer.valueOf(paraErkek)+Integer.valueOf(paraKadin));	//3900
int maasErkek=1900;
int maasKadin=2000;
		
//maasErkek ve maasKadin sayilarini Stringe donusturun ve concatenation yapin.		
System.out.println(String.valueOf(maasErkek)+String.valueOf(maasKadin));//19002000		
		
	}

}
