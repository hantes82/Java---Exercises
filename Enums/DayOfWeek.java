package pkg2;

/**
 * Created by itml on 26.03.2017.
 */
public enum DayOfWeek {
    MONDAY(1),
    TUESDAY(2),
    WEDNSDAY(3),
    THURSDAY(4),
    FRIDAY(5),
    SATURDAY(6, false),
    SUNDAY(7, false);

    DayOfWeek(int numberInWeek, boolean isWorkingDay) {
        this.isWorkingDay = isWorkingDay;
        this.numberInWeek = numberInWeek;
    }

    DayOfWeek(int numberInWeek) {
        this.isWorkingDay = true;
        this.numberInWeek = numberInWeek;
    }

    private boolean isWorkingDay;

    public int getNumberInWeek() {
        return numberInWeek;
    }

    public void setNumberInWeek(int numberInWeek) {
        this.numberInWeek = numberInWeek;
    }

    private int numberInWeek;

    public boolean isWorkingDay() {
        return isWorkingDay;
    }

    public void setWorkingDay(boolean workingDay) {
        isWorkingDay = workingDay;
    }
}
