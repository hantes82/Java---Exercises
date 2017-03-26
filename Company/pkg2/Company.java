package pkg2;

/**
 * Created by kondz on 26.03.2017.
 */
public class Company {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Jan", "Kowalski", 1982, 15);
        Employee emp2 = new Employee("Barbara", "Motyka", 1979, 20);
        Employee emp3 = new Employee("Szymon", "Nowak", 1990, 10);

        System.out.println(emp1.toString());
        System.out.println(emp2.toString());
        System.out.println(emp3.toString());

    }
}
