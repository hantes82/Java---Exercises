package pkg2;

/**
 * Created by itml on 26.03.2017.
 */
public class Main {

    public static void main(String[] args) {


        DayOfWeek monday = DayOfWeek.MONDAY;

        System.out.println(monday);

        // Method invocation on enum
        System.out.println(monday.isWorkingDay());

        // Conversion of enum to string
        String nameOfMonday = monday.name();
        System.out.println(nameOfMonday);

        // Conversion of string to enum
        String s = "MONDAY";
        DayOfWeek enumeratedObject = DayOfWeek.valueOf(s);

        System.out.println(enumeratedObject);

        // Comparing enums by double equal sign
        if (monday == DayOfWeek.MONDAY) {

        }

        displayDayOfWeek(DayOfWeek.THURSDAY);

        System.out.println(Languages.RU);
        // Iteration of enum values()
        Languages[] arr = Languages.values();

        for (Languages l : arr) {
            System.out.println(l);
        }


        System.out.println(DayOfWeek.THURSDAY.getNumberInWeek());

        DayOfWeek.THURSDAY.setNumberInWeek(10);


        System.out.println(DayOfWeek.THURSDAY.getNumberInWeek());



    }

    public static void displayDayOfWeek(DayOfWeek dayOfWeek) {
        System.out.println(dayOfWeek.name());
    }
}
