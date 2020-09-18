package day11stringmethods;

public class ForLoop02 {

	public static void main(String[] args) {
		
//100 den kucuk 3 un kati olan sayma sayilarini yan yana yazdiran bir loop olusturun	
		
for(int i=3;i<100;i=i+3) {System.out.print(i+" ");}		
		
//Ilk bes sayma sayisinin toplamini veren programi for loop da yaziniz.		
//	1,2,3	
//int sum=0 0+1=1==>1+2=3==>3+3=6		
		System.out.println();
	int sum=0;	
	for(int i=1;i<4; i++) {
		sum=sum+i;
	}
		System.out.print("Toplam: "+sum);
		// sadece en son adimi ekranda gormek isterseniz
		//yazdirma islemini for loopun disina yaptiriniz.
		System.out.println();
//10 dan buyuk ilk uc sayma sayisinin toplamini veren for loop u yaziniz
		int sum1=0;
		for(int i=11;i<14;i++) {
			sum1=sum1+i;
		}
		System.out.print("Toplam: "+sum1);
		
		System.out.println();
//20 den buyuk ilk 5 sayma sayisinin toplamini veren for loop olusturun
		
int sum3=0;
for(int i=21;i<26;i++) {sum3=sum3+i;
}
System.out.println(sum3);//115
		System.out.println();
		
//ilk 50 sayma sayisinin toplamini veren for loop olusturunuz
int sum4=0;
for(int i=1;i<51;i++) {sum4=sum4+i;
}
System.out.println(sum4);	//1274	
		
		
//5 ile bolunebilen 100 den kucuk sayma sayilarinin toplamini veren for loop olusturun	

int sum5=0;
for(int i=5;i<100;i=i+5) {sum5=sum5+i;
}
System.out.println(sum5);//950
		

	}

}
