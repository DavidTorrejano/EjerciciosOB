package mediator;

public class ConcreteUser2 extends User {

    private String userName;

    public ConcreteUser2(String userName) {
        this.userName = userName;
    }

    @Override
    public void sendMessage(String message) {
        System.out.println(userName + ": " + message);
        mediator.sendMessage(this, message);
    }

    @Override
    public void receiveMessage(String message) {
        System.out.println("Received by " + this.getUserName() + ": " + message);
    }

    public String getUserName() {
        return userName;
    }
}