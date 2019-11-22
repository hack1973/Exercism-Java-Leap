class Leap {

    boolean isLeapYear(int year) {
        boolean leapYear = false;

        if (year % 4 == 0 && year % 100 != 0) {
            leapYear = true;
        } else if (year % 4 == 0 && year % 100 == 0 && year % 400 == 0) {
            leapYear = true;
        } else {
            leapYear = false;
        }
        return leapYear;
    }

}
