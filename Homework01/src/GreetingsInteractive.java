import java.util.Scanner;

public class GreetingsInteractive {

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
		
		System.out.print("Ievadiet savu vārds: ");
		String name = sc.nextLine();
		System.out.print("Ievadiet savu vecumu: ");
		int age = sc.nextInt();
		
		sc.close();
		
		System.out.print("Sveiki, mani sauc " + name + " esmu " + age + " gadus jauns/jauna!");
	}

}
