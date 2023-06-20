import java.util.Scanner;

public class ex_6_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int month = 0, days;
        String[] months = { "January", "February", "March", "April", "May", "June", "July", "August", "September",
                "October", "November", "December" };

        while (month == 0) {

            System.out.print(
                    "Enter a month (full name, abbreviation, 3 letters or number, for instance: January or Jan or 1): ");
            String monthStr = input.next().toLowerCase();
            switch (monthStr) {
                case "january":
                case "jan":
                case "1":
                    month = 1;
                    break;
                case "february":
                case "feb":
                case "2":
                    month = 2;
                    break;
                case "march":
                case "mar":
                case "3":
                    month = 3;
                    break;
                case "april":
                case "apr":
                case "4":
                    month = 4;
                    break;
                case "may":
                case "5":
                    month = 5;
                    break;
                case "june":
                case "jun":
                case "6":
                    month = 6;
                    break;
                case "july":
                case "jul":
                case "7":
                    month = 7;
                    break;
                case "august":
                case "aug":
                case "8":
                    month = 8;
                    break;
                case "september":
                case "sep":
                case "9":
                    month = 9;
                    break;
                case "october":
                case "oct":
                case "10":
                    month = 10;
                    break;
                case "november":
                case "nov":
                case "11":
                    month = 11;
                    break;
                case "december":
                case "dec":
                case "12":
                    month = 12;
                    break;
            }
            if (month == 0) {
                System.out.println("Invalid input. Please try again.");
            }
        }
        int year = -1;
        while (year < 0) {
            System.out.print("Enter a year: ");
            if (input.hasNextInt()) {
                // .hasNextInt check if input is an integer
                year = input.nextInt();
            } else {
                input.next();
            }
            if (year < 0) {
                System.out.println("Invalid input. Please try again.");
            }
        }

        switch (month) {
            case 2:
                if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
                    days = 29;
                } else {
                    days = 28;
                }
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                days = 30;
                break;
            default:
                days = 31;
        }
        System.out.println("The number of days in " + months[month - 1] + " of " + year + " is " + days);
    }
}