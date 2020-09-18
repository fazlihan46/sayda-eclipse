package day13whiledowhileloops;

public class WhilwLoop01 {

	public static void main(String[] args) {
//while loop kullanark ilk 5 sayma sayisini ekrana yazdiran programi yaziniz.		
		
	int sum=0;
	int num=1;
	while(num<6) {
		
		sum=sum+num;
		num++;
	}
	System.out.println(sum);	//en son toplami gormek icin
	//System.out.println(sum);ifadesini loop icine yaziniz
	//Her adimdaki toplami gormek icin System.out.println(sum) ifadesini loop un icine yazin

	}

}
