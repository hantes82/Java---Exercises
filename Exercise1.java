package pkg1;

import java.util.Random;

/**
 * Created by kondz on 26.03.2017.
 */
//Napisz program, w którym zadeklarujesz dwie zmienne typu int o nazwach x oraz y. Przypisz do nich losowe, różne wartości, a następnie za pomocą operatorów logicznych i matematycznych wyświetl wynik następujących zdań logicznych:
//
//        Czy x jest większe od y?
//        Czy x pomnożone przez 2 jest większe od y?
//        Czy y jest mniejsze od sumy x+3 i jednocześnie większe od x pomniejszonego o 2?
//        Czy iloczyn liczb x i y jest parzysty? (Wykorzystaj do sprawdzenia operację modulo)
//
//        Wynik każdego zdania logicznego przypisuj przed wypisaniem do zmiennej typu boolean o nazwie result.

public class Exercise1 {
    public static void main(String[] args) {

        Random rand = new Random();
        int x = rand.nextInt();
        int y = rand.nextInt();
        System.out.println(x);
        System.out.println(y);
        boolean result;
        result = x>y;
        System.out.println(result);
        result = x*2>y;
        System.out.println(result);
        result = x+2<y && y<x+3;
        System.out.println(result);
        result = x*y%2==0;
        System.out.println(result);

    }

}
