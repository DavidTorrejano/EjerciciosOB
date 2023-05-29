package mediator;

import java.util.ArrayList;

public class ConcreteMediator extends Mediator {

    private ArrayList<User> users = new ArrayList<>();

    @Override
    void addNew(User user) {
        if(!users.contains(user)) {
            users.add(user);
            user.setMediator(this);
        }
    }

    @Override
    void sendMessage(User user, String message) {
        for (User current: users){
            if (!current.equals(user)){
                current.receiveMessage(message);
            }
        }
    }
}
