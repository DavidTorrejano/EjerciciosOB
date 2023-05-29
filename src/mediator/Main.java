package mediator;

public class Main {
    public static void main(String[] args) {

        Mediator mediator = new ConcreteMediator();

        ConcreteUser1 user1 = new ConcreteUser1("Martín");
        ConcreteUser2 user2 = new ConcreteUser2("Julieta");
        ConcreteUser3 user3 = new ConcreteUser3("Felipe");

        mediator.addNew(user1);
        mediator.addNew(user2);
        mediator.addNew(user3);


        user1.sendMessage("Hola mis amigos");
        user2.sendMessage("Hola Martín, ¿cómo vas?");
        user3.sendMessage("Ey Martí, tiempo sin saber de ti.");
        /*
        * Escogí este patrón porque en principio me pareció el más difícil de todos, y por otro lado
        * debido a todas las formas en las que se podría implementar dicho patrón*/

    }
}
