import java.util.Scanner;
import java.util.Random;
public class SortArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Ievadiet masīva izmēru robežās no 20 līdz 40 : ");
		int size = sc.nextInt();
		sc.close();
		Random rnd = new Random();
		int[] Array = new int[size] ;
		System.out.println("Ar random ģenerētais masīvs:");
		for(int i=0; i <Array.length;i++) {
			int randomNum = rnd.nextInt(90)+10;
			Array[i] = randomNum;
			System.out.print(Array[i]+", ");			
		}
		for(int i =0; i<Array.length;i++) {
			for(int j=0; j<Array.length;j++) {
				if(Array[i]<Array[j]) {
				int temp = Array[i];
				Array[i] = Array[j];
				Array[j] = temp;
				}
			}
		}
		System.out.println(" ");
		System.out.println("Sakārtotais masīvs augošā secībā:");
		for(int i=0; i <Array.length;i++) {
			System.out.print(Array[i]+", ");			
		}

	}

}
