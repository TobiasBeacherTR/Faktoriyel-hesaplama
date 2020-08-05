package faktöriyel;
import java.util.Scanner;
public class faktöriyel {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.print("Faktöriyeli alýnacak sayýyý giriniz : ");
		int x=scanner.nextInt();
		
		int fak=1;
		
		for (int i=1 ; i<=x ; i++) {
			fak=fak*i;
		}
		System.out.println("Sonuç : " + fak);
	}

}
