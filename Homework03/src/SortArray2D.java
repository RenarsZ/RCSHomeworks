import java.util.Scanner;
import java.util.Random;

public class SortArray2D {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Ievadiet masīvu skaitu(10-20): ");
		int numberOfArr = sc.nextInt();
		sc.close();
		Random rnd = new Random();
		int[][] Array = new int[numberOfArr][];
		float sum = 0;
		float[] avgArray = new float[numberOfArr];
		for (int i = 0; i < numberOfArr; i++) { // ģenerē katra individuālā masīva garumu
			int size = rnd.nextInt(41) + 10;
			Array[i] = new int[size];
		}
		System.out.println(" ");
		System.out.println("Sākotnējais 2D masīvs: ");
		for (int i = 0; i < Array.length; i++) { // aizpilda 2d masīvu (izvadi var aizkomentēt)
			for (int j = 0; j < Array[i].length; j++) {
				Array[i][j] = rnd.nextInt(900) + 100;
				System.out.print(Array[i][j] + ", ");
			}
			System.out.println(" ");
		}
		for (int i = 0; i < Array.length; i++) { // Sakārto katru individuālo masīvu dilstošā secībā
			for (int j = 0; j < Array[i].length; j++) {
				for (int y = 0; y < Array[i].length - j - 1; y++) {
					if (Array[i][y] < Array[i][y + 1]) {
						int temp = Array[i][y];
						Array[i][y] = Array[i][y + 1];
						Array[i][y + 1] = temp;
					}
				}
			}
		}
		System.out.println(" ");
		System.out.println("Katrs individuālais masīvs dilstošā secībā: ");
		for (int i = 0; i < Array.length; i++) { // izvada sakārtoto 2d masīvu, tikai priekš pārbaudes, var aizkomentēt šo ciklu
			for (int j = 0; j < Array[i].length; j++) {
				System.out.print(Array[i][j] + ", ");
			}
			System.out.println(" ");
		}
		System.out.println(" ");
		System.out.println("Vidējās vērtības katram individuālajam masīvam: ");
		for (int i = 0; i < Array.length; i++) { // Aprēķina un izvada katra individuālā masīva vidējo vērtību(izvadi var aizkomentēt)
			for (int j = 0; j < Array[i].length; j++) {
				sum = sum + Array[i][j];
			}
			float avg = sum / Array[i].length;
			avgArray[i] = avg;
			sum = 0;
			System.out.println(avgArray[i]);
		}
		float temp;
		for (int i = 0; i <avgArray.length; i++) {// Sakārto masīvus augošā secībā pēc vidējās vērtības
			for (int j = i+1; j < avgArray.length; j++) {
				if (avgArray[i] > avgArray[j]) {
					temp = avgArray[j];
					avgArray[j]=avgArray[i];
					avgArray[i]=temp;
					int[] tempArray = Array[j];
					Array[j] = Array[i];
					Array[i] = tempArray;
				}
			}
		}
		System.out.println(" ");
		System.out.println("Sakārtotais 2D masīvs augošā secībā(pēc vidējām vērtībām): ");
		for (int i = 0; i < Array.length; i++) { // izvada sakārtoto 2D masīvu, tikai priekš pārbaudes, var aizkomentēt šo ciklu
			for (int j = 0; j < Array[i].length; j++) {
				System.out.print(Array[i][j] + ", ");
			}
			System.out.println(" ");
		}
		System.out.println(" ");
		System.out.println("Saturs no masīva ar vislielāko vidējo vērtību: ");
		for (int j = 0; j < Array[numberOfArr - 1].length; j++) {// izvada masīvu ar lielāko vidējo vērtību(vienmēr būs pēdējais masīvs)
			System.out.print(Array[numberOfArr - 1][j] + ", ");

		}

	}
}
