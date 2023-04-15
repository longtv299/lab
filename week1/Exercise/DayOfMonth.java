
import java.util.Scanner;
public class DayOfMonth {

    public static boolean checkValidMonth (String month) {
        if (month.equals("January") || month.equals("Jan.") || month.equals("Jan") || month.equals("1")) {
            return true;
        } else if (month.equals("February") || month.equals("Feb.") || month.equals("Feb") || month.equals("2")) {
            return true;
        } else if (month.equals("March") || month.equals("Mar.") || month.equals("Mar") || month.equals("3")) {
            return true;
        } else if (month.equals("April") || month.equals("Apr.") || month.equals("Apr") || month.equals("4")) {
            return true;
        } else if (month.equals("May") || month.equals("5")) {
            return true;
        } else if (month.equals("June") || month.equals("Jun") || month.equals("6")) {
            return true;
        } else if (month.equals("July") || month.equals("Jul") || month.equals("7")) {
            return true;
        } else if (month.equals("August") || month.equals("Aug.") || month.equals("Aug") || month.equals("8")) {
            return true;
        } else if (month.equals("September") || month.equals("Sept.") || month.equals("Sep") || month.equals("9")) {
            return true;
        } else if (month.equals("October") || month.equals("Oct.") || month.equals("Oct") || month.equals("10")) {
            return true;
        } else if (month.equals("November") || month.equals("Nov.") || month.equals("Nov") || month.equals("11")) {
            return true;
        } else if (month.equals("December") || month.equals("Dec.") || month.equals("Dec") || month.equals("12")) {
            return true;
        } 
        return false;
    }

    public static boolean checkValidYear(String strYear) {
        if (strYear.matches("\\d+")) {
            int year = Integer.parseInt(strYear);
            if (year >= 0) {
                return  true;
            } else {
                return false;
            }
        } 
        return false;
    }

    public static boolean isLeapYear(int year) {
        if (year % 100 == 0) {
            if (year % 400 == 0) {
                return true;
            }
            return false;
        } 
        if (year % 4 == 0) {
            return true;
        }
        return false;
    
    }

    public static int takeMonthInNum(String month) {
        if (month.equals("January") || month.equals("Jan.") || month.equals("Jan") || month.equals("1")) {
            return 1;
        } else if (month.equals("February") || month.equals("Feb.") || month.equals("Feb") || month.equals("2")) {
            return 2;
        } else if (month.equals("March") || month.equals("Mar.") || month.equals("Mar") || month.equals("3")) {
            return 3;
        } else if (month.equals("April") || month.equals("Apr.") || month.equals("Apr") || month.equals("4")) {
            return 4;
        } else if (month.equals("May") || month.equals("5")) {
            return 5;
        } else if (month.equals("June") || month.equals("Jun") || month.equals("6")) {
            return 6;
        } else if (month.equals("July") || month.equals("Jul") || month.equals("7")) {
            return 7;
        } else if (month.equals("August") || month.equals("Aug.") || month.equals("Aug") || month.equals("8")) {
            return 8;
        } else if (month.equals("September") || month.equals("Sept.") || month.equals("Sep") || month.equals("9")) {
            return 9;
        } else if (month.equals("October") || month.equals("Oct.") || month.equals("Oct") || month.equals("10")) {
            return 10;
        } else if (month.equals("November") || month.equals("Nov.") || month.equals("Nov") || month.equals("11")) {
            return 11;
        } else {
            return 12;
        }
    }

    public static int takeYearInNum(String strYear) {
        int year = Integer.parseInt(strYear);
        return year;
    }
    public static void main(String[] agrs) {
        Scanner sc = new Scanner(System.in);
        String strMonth, strYear;
        do {
            System.out.print("Enter month: ");
            strMonth = sc.nextLine();
            if (!checkValidMonth(strMonth)) {
                System.out.println("Wrong month syntax!\nRight syntax, for example:January, Jan, Jan., 1");
            }
        } while (!checkValidMonth(strMonth));
        do {
            System.out.print("Enter year: ");
            strYear = sc.nextLine();
            if (!checkValidYear(strYear)) {
                System.out.println("Wrong year syntax!\nNot accept a non-negative year!");
            }
        } while (!checkValidYear(strYear));
        int month = takeMonthInNum(strMonth);
        int year = takeYearInNum(strYear);
        if (isLeapYear(year)) {
            if (month == 2) {
                System.out.println("Number of days: " + 29);
            } else if (month == 4 || month == 6 || month == 9 || month == 11) {
                System.out.println("Number of days: " + 30);
            } else {
                System.out.println("Number of days: " + 31);
            }
        } else {
            if (month == 2) {
                System.out.println("Number of days: " + 28);
            } else if (month == 4 || month == 6 || month == 9 || month == 11) {
                System.out.println("Number of days: " + 30);
            } else {
                System.out.println("Number of days: " + 31);
            }
        }

        sc.close();
    }
}
