package fakt�riyel;
import java.util.Scanner;
public class fakt�riyel {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.print("Fakt�riyeli al�nacak say�y� giriniz : ");
		int x=scanner.nextInt();
		
		int fak=1;
		
		for (int i=1 ; i<=x ; i++) {
			fak=fak*i;
		}
		System.out.println("Sonu� : " + fak);
	}

}
