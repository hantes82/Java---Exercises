package pkg4;

import java.util.Scanner;

/**
 * Created by kondz on 26.03.2017.
 */
//Napisz program symulujący system do planowania wizyt w szpitalu. Program powinien składać się z trzech klas:
//
//        Patient - klasa przechowująca dane o pacjencie (imię, nazwisko, PESEL) - klasa powinna być zgodna z konwencją JavaBeans
//        Hospital - klasa z logiką aplikacji umożliwiająca dopisanie pacjenta do kolejki oraz wyświetlenie wszystkich zapisanych pacjentów
//        HospitalApp - klasa startowa programu, która posiada trzy opcje: 0 - wyjście z programu, 1 - dopisanie pacjenta, 2 - wyświetlenie listy zapisanych pacjentów
//
//        Ograniczenia:
//
//        Danego dnia może zapisać się co najwyżej 10 pacjentów, przy próbie zapisania kolejnego wyświetlana jest informacja o tym, że dzisiaj limit został już wyczerpany
//        Aplikacja powinna działać do tego momentu, aż użytkownik nie wybierze opcji 0, czyli wyjścia z programu

public class HospitalApp {
    public static final int EXIT = 0;
    public static final int ADD_PATIENT = 1;
    public static final int PRINT_PATIENTS = 2;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int option = -1;

        Hospital hospital = new Hospital();

        while (option != EXIT) {
            System.out.println("Dostępne opcje: ");
            System.out.println("0 - wyjście z programu");
            System.out.println("1 - dodanie pacjenta");
            System.out.println("2 - wyświetlenie listy pacjentów");

            System.out.println("Wybierz opcję: ");
            option = input.nextInt();
            input.nextLine();

            switch (option) {
                case ADD_PATIENT:
                    Patient patient = new Patient();
                    System.out.println("Imię: ");
                    patient.setFirstName(input.nextLine());
                    System.out.println("Nazwisko: ");
                    patient.setLastName(input.nextLine());
                    System.out.println("PESEL: ");
                    patient.setPesel(input.nextLine());
                    hospital.addPatient(patient);
                    break;
                case PRINT_PATIENTS:
                    hospital.printPatients();
                    break;
                case EXIT:
                    System.out.println("Zamykam program!");
                    break;
                default:
                    System.out.println("Nie znaleziono takiej opcji");
            }
        }

        input.close();
    }
}
