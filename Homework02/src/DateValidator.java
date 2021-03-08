import java.util.Scanner;

public class DateValidator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Ievadiet datumu : ");
		int date = sc.nextInt();
		System.out.print("Ievadiet mēnesi : ");
		int month = sc.nextInt();
		System.out.print("Ievadiet gadu : ");
		int year = sc.nextInt();
		sc.close();
		boolean isLeapYear;
		String[] monthArr = { "Janvāris", "Februāris", "Marts", "Aprīlis", "Maijs", "Jūnijs", "Jūlijs", "Augusts",
				"Septembris", "Oktobris", "Novembris", "Decembris" };
		if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
			isLeapYear = true;
		} else {
			isLeapYear = false;
		}
		for (int i = 0; i <= 12; i++) {
			if (date < 32 && date > 0 && month <= 12 && month > 0) { // Pārbauda datuma [1...31] un mēneša [1...12] robežas
				if (i == month) {
					if ((date == 31 && month == 4) || (date == 31 && month == 6) || (date == 31 && month == 9)
							|| (date == 31 && month == 11)) { // Izņēmuma gadījumi kad mēnesī ir 30 dienas
						System.out.print("Datuma un mēneša kombinācija nav derīga, jo ievadītajā mēnesī ir 30 dienas!");
						break;
					}
					if (isLeapYear && date >= 30 && month == 2) { 
						System.out.print("Kļūda, datuma un mēneša kombinācija nav derīga, jo " + year
								+ ". gadā Februārī ir 29 dienas!");
						break;
					}
					if (!isLeapYear && date >= 29 && month == 2) { 
						System.out.print("Kļūda, datuma un mēneša kombinācija nav derīga, jo " + year
								+ ". gadā Februārī ir 28 dienas!");
						break;
					}
					System.out.println(date + "." + monthArr[i - 1] + " " + year + ".gads");
				}
			} else {
				System.out.print("Kļūda! Ievadīts nederīgs datums vai mēnesis!");
				break;
			}
		}
	}
}
