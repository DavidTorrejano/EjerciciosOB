package aplicando.sol.de.solid;

public class CocheModerno{

    public void andarAlFrente() {
        System.out.println("El coche se mueve hacia el frente");
    }
    public void retroceder() {
        System.out.println("El coche se mueve hacia atrás");
    }

    public void girarADerecha() {
        System.out.println("El coche gira sus ruedas delanteras a la derecha");
    }
    public void girarAIzquierda() {
        System.out.println("El coche gira sus ruedas delanteras a la izquierda");
    }
    public void parquear() {
        System.out.println("Se acomoda el carro de adelante para atrás hasta que quede en el lugar deseado");
    }

    public void meterCambio(){
        System.out.println("Se aumenta la marcha");
    }

    public void sacarCambio(){
        System.out.println("Se disminuye la marcha");
    }
}

class CocheFuturista extends CocheModerno{
    @Override
    public void andarAlFrente() {
        System.out.println("El coche vuela hacia adelante");
    }

    @Override
    public void retroceder() {
        System.out.println("El coche retrocede");
    }

    @Override
    public void girarADerecha() {
        System.out.println("El coche gira hacia la derecha en sus ruedas, o puede hacerlo sobre su propio eje");
    }

    @Override
    public void girarAIzquierda() {
        System.out.println("El coche vuela hacia adelante");
    }

    @Override
    public void parquear() {
        System.out.println("Se mueve en paralelo y se parquea sólo");
    }
}
