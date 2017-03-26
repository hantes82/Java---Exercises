package pkg2;

/**
 * Created by kondz on 26.03.2017.
 */
//Napisz program, w którym utworzysz dwie klasy:
//
//        Employee - klasa, która będzie przedstawiała pracownika dowolnej firmy. Podstawowe informacje o pracowniku jakie są potrzebne pracodawcy to imię, nazwisko, rok urodzenia, staż pracy
//        Company - klasa, w której utworzysz 3 obiekty reprezentujące pracowników, a następnie wyświetlisz informację o nich na ekranie

public class Employee {
    private String name, surname;
    private int yearOfBirth;
    private int seniority;
    //Constructors
    public Employee(String name, String surname, int yearOfBirth, int seniority) {
        this.name = name;
        this.surname = surname;
        this.yearOfBirth = yearOfBirth;
        this.seniority = seniority;
    }

    public Employee() {
    }
    //Getters
    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }
    //Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public void setSeniority(int seniority) {
        this.seniority = seniority;
    }

    public int getSeniority() {
        return seniority;
    }

    //Methods
    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", yearOfBirth=" + yearOfBirth +
                ", seniority=" + seniority +
                '}';
    }
}
