package paquete;

import java.util.Scanner;
import java.math.BigInteger;

public class Operaciones {

    Scanner s;
    BigInteger num1;

    Operaciones() {
        System.out.println("constructor de operaciones");
        s = new Scanner(System.in);
    }

    BigInteger pedir() {
        System.out.println("ingrese un numero");
        num1 = s.nextBigInteger();
        return num1;
    }

    void suma(BigInteger num2, BigInteger num1) {
        System.out.println("la suma es: " + num2.add(num1));
    }

    void resta(BigInteger num1, BigInteger num2) {
        System.out.println("la resta es: " + num1.subtract(num2));
    }

    void multiplicacion(BigInteger num1, BigInteger num2) {
        System.out.println("la multiplicacion es: " + num1.multiply(num2));
    }

    void divicion(BigInteger num1, BigInteger num2) {
        System.out.println("la divicion es: " + num1.divide(num2));
    }

    void modulo(BigInteger num1, BigInteger num2) {
        System.out.println("el modulo es: " + num1.remainder(num2));
    }
}
