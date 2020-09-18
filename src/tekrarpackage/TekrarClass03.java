package tekrarpackage;

import java.util.Scanner;

public class TekrarClass03 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		 
		System.out.println("lutfen bir saat giriniz");
		long saat=scan.nextLong();
		long saniye=saat*60*60;
		System.out.println(saat+" saat "+saniye+" saniyedir");
}}
