
import java.util.Scanner;
public class PrimeGenerator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Cik secīgus pirmsskaitļus vēlaties ģenerēt(0-100)? : ");		
		int size = sc.nextInt();
		sc.close();		
		int temp=0;
		for(int i =1; temp<size;i++) {		
			boolean primeNum =true;		
			for (int j=2; j<i;j++) {			
				if(i % j==0) {
					primeNum = false;
				}
			}
			if(primeNum) {		
				temp++;
				System.out.print(i+", ");
			}
			
		}
		
	}

}
