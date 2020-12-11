import java.util.Scanner;

public class GreetingsInteractive {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Ievadiet savu vārds: ");
		String name = scanner.nextLine();
		System.out.print("Ievadiet savu vecumu: ");
		int age = scanner.nextInt();
		
		scanner.close();
		
		System.out.print("Sveiki, mani sauc " + name + " esmu " + age + " gadus jauns/jauna!");
	}

}
