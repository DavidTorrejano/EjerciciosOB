package exception.handling;

public class ImpresorArraysDeNombres {

    public void impresorArrayNombres(String [] nombres, int numeroNombres) throws IndexOutOfBoundsException{

        if (numeroNombres> nombres.length){
            throw new IndexOutOfBoundsException();
        }

        for (String nombre: nombres){
            System.out.println(nombre);
        }
    }
}
