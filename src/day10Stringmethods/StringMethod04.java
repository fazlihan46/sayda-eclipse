package day10Stringmethods;

public class StringMethod04 {

	public static void main(String[] args) {
		
//contains() methodu bir Stringin icinde bir karakterin olup olmadigini kontrol eder.		
//Eger o character String in icinde varsa	true yoksa false return eder.
		
String str1="karakartal";
System.out.println(str1.contains("m"));//false cunku karakartal in icinde "m" yok
		
//contains() methodunun icine her zaman String koyun		


System.out.println(str1.contains("kar"));

//trim methodu bir Stringin bas ve sonundaki bosluklari siler,ortdaki bosluklari silmez

String str2=" Ali Can     "	;
System.out.println("trim() kullanmadan once :" +str2);

System.out.println("trim() kullandiktan sonra :" +str2.trim());

//isEmpty() methodu bir Stringin icinde character olup olmadigina bakar
//character yoksa true, varsa false yazar


String str3="Ali";
System.out.println(str3.isEmpty());//false cunku string bos degil

String str4=" ";
System.out.println(str3.isEmpty());//false cunku space Java icin bir characterdir.

String str5="";
System.out.println(str5.isEmpty());//true verir.cunku bir character yoktur

//Note:is empty true cikarsa length 0 demektir.. 

	}

}
