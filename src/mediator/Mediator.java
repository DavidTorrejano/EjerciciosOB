package mediator;

abstract public class Mediator {
    abstract void addNew(User user);
    abstract void sendMessage(User user, String message);
}
