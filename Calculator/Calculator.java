package Calculator;

import java.util.Random;

/**
 * Created by kondz on 26.03.2017.
 */
//Napisz program-kalkulator operujący na liczbach zmiennoprzecinkowych typu double , który będzie składał się z dwóch klas w osobnych plikach:
//
//        Calculator.java - powinna zawierać metody add(), subtract(), multiply(), divide(), czyli kolejno dodawanie, odejmowanie, mnożenie i dzielenie. Zastanów się jakie argumenty
// powinny przyjmować oraz jaki typ powinny zwracać
//        Calculate.java - klasa uruchomieniowa programu z metodą main. Zadeklaruj i zainicjuj w niej co najmniej 2 zmienne typu double, utwórz obiekt klasy Calculator i za jego pomocą
// oblicz wynik różnych działań matematycznych.
//
//        Wszystkie wyniki działań wyświetl na ekranie.

public class Calculator {
    Random rand = new Random();
    private double a = rand.nextDouble();
    private double b = rand.nextDouble();




    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double add() {
        return a+b;
    }

    public double substract() {
        return a-b;
    }

    public double multiply() {
        return a*b;
    }

    public double divide() {
        return a/b;
    }


}
