import java.util.Scanner;
public class ConditionalMath {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Ievadiet savu vārdu: ");
		String name = scanner.nextLine();
		System.out.print("Ievadiet veselu skaitli A: ");
		int a = scanner.nextInt();
		System.out.print("Ievadiet veselu skaitli B: ");
		int b = scanner.nextInt();
		int sum = a + b;
		int length = name.length();
		scanner.close();
		
		
		if (a>b) {
			System.out.println("Skaitlis A ir lielāks par skaitli B!");
		}else if (a==b){
			System.out.println("Skaitlis A un B ir vienādi!");
		}else {
			System.out.println("Skaitlis B ir lielāks par skaitli A!");		
		}
		if(sum>length) {
			System.out.println("Skaitļu A un B summa ir " + sum + ", kas ir vairāk nekā burtu Tavā vārdā!");
			
		}else if (sum<length) {
			System.out.println("Skaitļu A un B summa ir " + sum + ", kas ir mazāk nekā burtu Tavā vārdā!");
		}else {
			System.out.println("Skaitļu A un B summa ir " + sum + ", kas ir tikpat cik burtu Tavā vārdā!");
		}
	}
}
