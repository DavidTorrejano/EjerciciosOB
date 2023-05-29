package mediator;

import mediator.Mediator;

abstract public class User {
    public Mediator mediator;


    public void setMediator(Mediator mediator){
        this.mediator = mediator;
    }

    public abstract void sendMessage(String message);
    public abstract void receiveMessage(String message);
}
