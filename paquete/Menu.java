package paquete;

import java.math.BigInteger;
import static java.math.BigInteger.ONE;
import java.util.Scanner;

public class Menu {

    Scanner s;
    Operaciones operaciones;
    BigInteger opcion;
    BigInteger dos;
    BigInteger tres;
    BigInteger cuatro;
    BigInteger cinco;

    Menu() {
        System.out.println("constructor de menu");
        s = new Scanner(System.in);
        operaciones = new Operaciones();
        dos = new BigInteger("2");
        tres = new BigInteger("3");
        cuatro = new BigInteger("4");
        cinco = new BigInteger("5");

    }

    void menu() {

        System.out.println("Escoja:\n 1|suma\n 2|resta\n 3|multiplicaion\n 4|divicion\n 5|modulo o residuo");
        opcion = s.nextBigInteger();

        if (opcion.compareTo(ONE) == 0) {
            operaciones.suma(operaciones.pedir(), operaciones.pedir());
        } else if (opcion.compareTo(dos) == 0) {
            operaciones.resta(operaciones.pedir(), operaciones.pedir());
        } else if (opcion.compareTo(tres) == 0) {
            operaciones.multiplicacion(operaciones.pedir(), operaciones.pedir());
        } else if (opcion.compareTo(cuatro) == 0) {
            operaciones.divicion(operaciones.pedir(), operaciones.pedir());
        } else if (opcion.compareTo(cinco) == 0) {
            operaciones.modulo(operaciones.pedir(), operaciones.pedir());
        }

    }

}
