package $9_Automated_Testing_TDD.BaiTap.TinhNgayTiepTheo;

public class NextDayCalculator{
    public static String findNexDay(int day, int month, int year) {
        if (day == 31 && month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10) {
            return 1 + "/" + (month + 1) + "/" + year;
        } else if (day == 30 && month == 4 || month == 6 || month == 9 || month == 11) {
            return 1 + "/" + (month + 1) + "/" + year;
        } else if (month == 2 && day == 28 && !isDivisionYear(year)) {
            return 1 + "/" + (month + 1) + "/" + year;
        } else if (month == 2 && day == 29 && isDivisionYear(year)) {
            return 1 + "/" + (month + 1) + "/" + year;
        } else if (day == 31 && month == 12) {
            return 1 + "/" + 1 + "/" + (year + 1);
        }

        return 1 + "/" + month + "/" + year;

    }

    public static boolean isDivisionYear(int year) {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                return year % 400 == 0;
            } else {
                return true;
            }
        }
        return false;
    }


}