
public class Whileloop01 {

	public static void main(String[] args) {
		
//while iken demektir.while I go to scholl==>Ben okula giderken
		
		
int num=0;
//num 4 den kucuk iken 
while(num<4) {//Parantez icindeki condition true oldugu surece while loop calisir
	System.out.println("Ali");
num++;//Bu satiri unutursaniz while loop sonsuz donguye girer.Unutmayiniz

}
		
// while loop kullanarak 1 den 10 a kadar tam sayilari ekrana yazdiriniz.
int num1=1;
while(num1<11) {System.out.println(num1+" ");
		num1++;
				
}	
//While loop kullanarak 1 den 20 ye kadar cift sayilari ekrana yazdiriniz
int num2=1;
while(num2<21) {if(num2%2==0)
	System.out.print(num2+" ");
	num2++;
}
System.out.println();
//while loop kullanark 5 den 120 ye kadar 3 ile bolunebilen tamsayilari yazdiriniz
	int num3=5;
	while(num3<121) {if(num3%3==0)
		System.out.print(num3+" ");
num3++;	
	}
	}
	
	

	
}
