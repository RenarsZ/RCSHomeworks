import java.util.Scanner;

public class HelloUser {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Ievadiet vārdu un uzvārdu : ");
		String input = sc.nextLine();
		String nameArray[] = new String[10];
		int counter = 0;
		do {
			nameArray = new String[10];
			counter = 0;
			int startIndex = 0;
			for (int i = 0; i <= input.length() - 1; i++) {
				if (i == input.length() - 1 && input.charAt(i) != ' ') { // Pārbauda vai aiz pēdējā uzvārda ir atstarpe
					nameArray[counter] = input.substring(startIndex);
				}
				if (i != input.length() - 1) { // Nepieciešama pārbaude lai nebūtu error message par out of range indeksu
					if (input.charAt(i) == ' ' && input.charAt(i + 1) != ' ') { // Atrod pēdējo atstarpi pirms vārda/uzvārda sākuma													 
						startIndex = input.indexOf(" ", i) + 1;
					}
					if (input.charAt(i) != ' ' && input.charAt(i + 1) == ' ') { // Atrod pirmo atstarpi pēc  vārda/uzvārda beigām													
						int endIndex = input.indexOf(" ", i);
						nameArray[counter] = input.substring(startIndex, endIndex);
						counter++;
					}
				}
			}
			if (nameArray[1] == null) {
				System.out.print("Kļūda ievadot vārdu un uzvārdu!! Mēģiniet vēlreiz: ");
				input = sc.nextLine();
			}
		} while (nameArray[1] == null);
		sc.close();
		System.out.println("'" + nameArray[0].substring(0, 1).toUpperCase() + nameArray[0].substring(1) + "'");
		for (int i = 1; i <= nameArray.length; i++) {
			if (nameArray[i] != null) {
				System.out.println("'" + nameArray[i].toUpperCase() + "'");
			} else {
				break;
			}

		}

	}

}
