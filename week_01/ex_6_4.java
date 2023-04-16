import java.util.Scanner;

public class ex_6_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int month, year;
        do {
            System.out.print("Enter a month (1-12): ");
            month = input.nextInt();
        } while (month < 1 || month > 12);
        do {
            System.out.print("Enter a year: ");
            year = input.nextInt();
        } while (year < 0);
        int days;
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
        System.out.println("The number of days in month " + month + " of year " + year + " is " + days);
    }
}