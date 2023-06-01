package exception.handling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        DivideConPositivos divide = new DivideConPositivos();

        try {
            int res = divide.divideSoloConPositivos(4, 0);
            System.out.println(res);
        }catch (ArithmeticException e){
            System.out.println("Sólo se puede dividir sobre números mayores que cero.");
        }

//________________________________________________________________________________________________________________________________

        String [] nombres = {"María", "Felipe", "Romina", "Alejandro", "Petunia", "Damian"};

        ImpresorArraysDeNombres impresor = new ImpresorArraysDeNombres();

        try {
            impresor.impresorArrayNombres(nombres, 9);
        }catch (IndexOutOfBoundsException e){
            System.out.println("El número de nombres indicado es mayor al almacenado.");
        }


//________________________________________________________________________________________________________________________________

        try {
            FileInputStream escibe = new FileInputStream("/usuario/noExis.txt");
            escibe.close();
        }catch (FileNotFoundException e){
            System.out.println("La ruta no ha sido encontrada");
        }catch (IOException e){
            System.out.println("No se pudo cerrar.");
        }
    }

}
