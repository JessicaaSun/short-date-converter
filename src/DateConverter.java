import java.util.Scanner;

public class DateConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a short date (YYYY-MM-DD): ");
        String shortDateStr = scanner.nextLine();

        int year = 0;
        int month = 0;
        int day = 0;

        int separatorIndex = shortDateStr.indexOf('-');
        if (separatorIndex != -1) {
            year = Integer.parseInt(shortDateStr.substring(0, separatorIndex));
            int secondSeparatorIndex = shortDateStr.indexOf('-', separatorIndex + 1);
            if (secondSeparatorIndex != -1) {
                month = Integer.parseInt(shortDateStr.substring(separatorIndex + 1, secondSeparatorIndex));
                day = Integer.parseInt(shortDateStr.substring(secondSeparatorIndex + 1));
            }
        }

        String monthName = "";
        switch (month) {
            case 1 -> monthName = "January";
            case 2 -> monthName = "February";
            case 3 -> monthName = "March";
            case 4 -> monthName = "April";
            case 5 -> monthName = "May";
            case 6 -> monthName = "June";
            case 7 -> monthName = "July";
            case 8 -> monthName = "August";
            case 9 -> monthName = "September";
            case 10 -> monthName = "October";
            case 11 -> monthName = "November";
            case 12 -> monthName = "December";
            default -> {
                System.out.println("Invalid month number.");
                System.exit(0);
            }
        }

        String fullDate = monthName + " " + day + ", " + year;
        System.out.println("Full date representation: " + fullDate);
    }
}