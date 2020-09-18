package day11stringmethods;

public class ForLoop03 {

	public static void main(String[] args) {
//	ilk 4 sayma sayisinin carpimini veren for loop olusturun	
		
int product=1;
for(int i=1;i<5;i++) {product=product*i;
}
System.out.println(product);	//24	
		
		System.out.println();
//ilk 6 cift sayisinin carpmini veren for loop olusturun		
		
int product1=1;
for(int i=2;i<13;i=i+2) {product1=product1*i;}

System.out.println(product1);
System.out.println();

//Matematik te 1 er 1 er geri sayim yapip carpmayafaktoryel denir
//6!=6*5*4*4*3*2*1
//interview lerde sorarlar

//9!  li hesaplayan programi for loop kullanarak yaziniz.

int product2=1;
for(int i=9;i>0;i--) {product2=product2*i;
}System.out.println(product2);//362880







		
	}

}
