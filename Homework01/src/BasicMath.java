import java.util.Scanner;
public class BasicMath {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Ievadiet veselu skaitli A: ");
		int a = scanner.nextInt();
		System.out.print("Ievadiet decimālskaitli B: ");
		double b = scanner.nextDouble();
	
		scanner.close();
		double sum = a + b;
		System.out.println("Skaitļu A un B summa ir: " + sum);
		double sub = a - b;
		System.out.println("Skaitļu A un B starpība ir: " + sub);
		double mul = a * b;
		System.out.println("Skaitļu A un B reizinājums ir: " + mul);
		double div = a / b;
		System.out.println("Skaitļu A un B dalījums ir: " + div);
		double square = sum * sum;
		System.out.println("Skaitļu A un B summas kvadrāts ir: " + square);

	}

}
