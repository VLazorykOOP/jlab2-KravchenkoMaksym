class CustomCalendar {
    private static final String[] DAYS_OF_WEEK = {"Неділя", "Понеділок", "Вівторок", "Середа", "Четвер", "П'ятниця", "Субота"};
    private static final String[] MONTHS = {"січня", "лютого", "березня", "квітня", "травня", "червня", "липня", "серпня", "вересня", "жовтня", "листопада", "грудня"};

    public String findDayOfMonthAndWeek(int day, int month, int year) {
        if (day < 1 || day > 31) {
            return "Неправильне число місяця";
        }

        if (month < 1 || month > 12) {
            return "Неправильний місяць";
        }

        if (year < 1) {
            return "Неправильний рік";
        }

        // Решта коду залишається незмінною
        int dayOfWeek = calculateDayOfWeek(day, month, year);
        String dayOfWeekName = DAYS_OF_WEEK[dayOfWeek];

        String monthName = MONTHS[month - 1];

        return String.format("%d %s, %d - %s", day, monthName, year, dayOfWeekName);
    }


    private static int calculateDayOfWeek(int day, int month, int year) {
        if (month < 3) {
            month += 12;
            year--;
        }

        int k = year % 100;
        int j = year / 100;

        int dayOfWeek = (day + 13 * (month + 1) / 5 + k + k / 4 + j / 4 - 2 * j) % 7;

        if (dayOfWeek < 0) {
            dayOfWeek += 7;
        }

        return dayOfWeek;
    }

    private static int calculateMonth(int day, int year) {
        for (int month = 1; month <= 12; month++) {
            if (day <= getDaysInMonth(month, year)) {
                return month;
            } else {
                day -= getDaysInMonth(month, year);
            }
        }
        return -1; // This should not happen
    }

    private static int getDaysInMonth(int month, int year) {
        switch (month) {
            case 2:
                return isLeapYear(year) ? 29 : 28;
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            default:
                return 31;
        }
    }

    private static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}
