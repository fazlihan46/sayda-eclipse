package day01variables;

public class Variable01 {
public static void main (String[] args) {
	

	int maas = 3000;
	
	char harf ='S' ;// char'lara deger atamasi yaparken mutlaka tek tirnak kullan
	System.out.println(maas); // 3000
	System.out.println(harf); //S
	
	int sayi=123;
	System.out.println(sayi);// 123 
	
	boolean isOld = true; // booleanlar icin sadece true yada false degerlerini kullanabilirsiniz.
	System.out.println(isOld);// true
	
	boolean isNew = false;
	System.out.println(isNew);// false
	 
	byte derinlik= -123;
	System.out.println(derinlik);// -123
	 
	short sirnakNufus=28000;
	System.out.println(sirnakNufus); //28000
	
	long hucreSayisi=1234567891122344489l;// integer sinirini asan long variable larda 
	      //en sona l(BUYUK KUCUK FARKETMEZ) kullanmaliyiz.
	System.out.println(hucreSayisi); //1234567
	
	 double pi=3.145666666666666;
	System.out.println(pi);// java butun ondalik kesirleri otamatik olarak 
	//double kabul eder.
	//eger karsisina deger yazmazsam default value=0.0
	 
	float para= 5.25f;//default value=0.0f
	System.out.println(para);
	
	String ogrenciIsmi= "Ali Can";
	System.out.println(ogrenciIsmi); //Ali Can
	
	
	
}
}
