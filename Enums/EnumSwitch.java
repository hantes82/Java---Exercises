package pkg2;

/**
 * Created by itml on 26.03.2017.
 */
public class EnumSwitch {


    public static void main(String[] args) {

        EnumSwitch.checkDay(DayOfWeek.SATURDAY);

    }


    public static void checkDay(DayOfWeek dow) {

        switch(dow) {
            case MONDAY:
                System.out.println("Jestem poniedziałkiem");
                break;
            case TUESDAY:
                System.out.println("Wtorkiem");
                break;
            case FRIDAY:
                System.out.println("Upragniony piątek");
                break;
            default:
                System.out.println("Nie obsługiwany typ");
        }


    }

}
