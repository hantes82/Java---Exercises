package pkg3;

import java.util.Scanner;

/**
 * Created by kondz on 26.03.2017.
 */
//Napisz program, który najpierw pobiera od użytkownika liczbę mówiącą o tym ile liczb użytkownik chce wprowadzić. Następnie pobierz od niego tyle liczb ile zadeklarował, zsumuj je
// i wyświetl na ekranie. W programie wykorzystaj co najwyżej dwie zmienne liczbowe (wliczając w to również potencjalne zmienne liczników pętli) i nie używaj tablic.Wykorzystaj dowolny typ liczbowy.
public class ElementsSum {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.println("Podaj liczbę składniów sumy: ");
        int a = scr.nextInt();
        int result = 0;
        for (int i=0; i<a;i++) {
            System.out.println("Podaj kolejną liczbę do zsumowania: ");
            result = result+scr.nextInt();
        }
        System.out.println("Wynik dodawania "+a+" liczb to: "+result);
    }

}
