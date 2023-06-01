package exception.handling;

public class DivideConPositivos {

    public int divideSoloConPositivos(int dividendo, int divisor)throws ArithmeticException{
        int resultado = 0;

        if (divisor < 1) throw new ArithmeticException();

        return resultado;
    }


}
