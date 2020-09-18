package day01variables;

public class variable02 {

	public static void main(String[] args) {
		
		char harf1 ='a';// a nin degeri 97
char harf2= 'b';//b nin degeri 98
System.out.println(harf1+harf2);//syso=> ctrl+space=>System.out.println();// ab mi? 97+98 mi?
//cevap:97+98=195
System.out.println(harf1);// a
System.out.println(harf2);//b

//ab yazdirmak icin asagidaki yontem kullanilabilir
System.out.print(harf1);
System.out.println(harf2);
// bir char in sayi degeri ASCII tablosu kullanmadan nasil bulunur?


// data typ i int olan bir variable olustur ve char i bu variable a ata.
int aCharDeger='a';
System.out.println(aCharDeger);

//'!' , '%', '*' sembollerinin ASCII degerlerini bulunuz.
int unlemCharDeger = '!';
System.out.println(unlemCharDeger);//33
int yuzdeCharDeger='%';
System.out.println(yuzdeCharDeger);//37
int asteriksCharDeger='*';
System.out.println(asteriksCharDeger);//42


	}

}
