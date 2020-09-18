package day11stringmethods;

public class StringMethod03 {

	public static void main(String[] args) {
//concat() method concatenation yapmanin, yani iki stringi birlestirmenin diger yontemidir.		
		
String str1="Ali";
String str2="Veli";
		
	System.out.println(str1+str2);	// AliVeli
	//2.yol
	
	System.out.println(str1.concat(str2));//AliVeli 
		
System.out.println(str1.concat(str2).concat(str1));//	AliVeliAli	concat() i istediginiz kdar
//pespese kullanabilirsiniz
		
System.out.println(str1.concat("==>").concat(str2));	//Ali==>Veli	
	//replace() methodu,var olan bir characterin yerine baska character yazmaya yarar.
//replace() 1.versiyon
String str3="ata";
System.out.println(str3.replace("t","n"));//ana

System.out.println(str3.replace("a","o"));//oto
System.out.println(str3.replace("x","y"));//ata yazdirir.Bu characterler olmadigi icin degisim yapmiyor
System.out.println(str3.replace("","y"));//yaytyay
System.out.println(str3.replace("","/"));//     /a/t/a/	yazdirir
System.out.println(str3.replace("t",""));//aa olur yani t yi siler.Biz bu yontemi bir characteri 
//Stringden silmek icin kullaniriz.
System.out.println(str3.replace("a",""));//t butun a characterlerini siler.
System.out.println(str3.replace("at","Mustaf"));//Mustafa
System.out.println(str3.replace("at","y"));//ya
System.out.println(str3.replace("","/"));


//replaceFirst() methodu degistirmek istedigimiz characterin sadece ilk gorunumunu degistirir.
String str4="karakartal";
System.out.println(str4.replaceFirst("k", "K"));//Karakartal
System.out.println(str4.replaceFirst("a", "e"));//kerakartal
System.out.println(str4.replaceFirst("ka", "A"));//Arakartal
System.out.println(str4.replaceFirst("kar", ""));//akartal
System.out.println(str4.replaceFirst("kara", "A"));//Akartal
System.out.println(str4.replaceFirst("karakartal", "cimbombom"));//cimbombom


//Soru
String text="Ali okula gitti.Ali otobuse bindi.Ali eve geldi.Ali yemek yedi.Ali uyudu.";

System.out.println(text.replace("Ali", "Veli"));

//replaceAll() ve replace() methodlari tamamiyla ayni seyi yapar.tek farki;replaceAll() methodu
//sadece cift tirnak icinde,replace() methodu tek tirnak ve cift tirnak icinde de calisir
//TEk tirnak tek harfde kullanabilirim
	}

}
