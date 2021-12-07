package day13;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String name;
    private List<User> subscriptions;

    public User(String name){
        this.name = name;
        subscriptions = new ArrayList<>();
    }

    public String getName() {
        return name;
    }
    public List<User> getSubscriptions() {
        return subscriptions;
    }

    public void subscribe(User user){
        subscriptions.add(user);
    }
    public boolean isSubscribed (User user){
        for (User subscription:subscriptions){
            if (subscription.getName().equals(user.getName())){
                return true;
            }
        }
        return false;
    }

    public boolean isFriend(User user){
        boolean a = true;
        boolean b = true;
        for (User subscription:subscriptions){

            if (subscription.getName().equals(user.getName())){
                a = true;
            }
            else a = false;
        }
        for (User subscription: user.getSubscriptions()){

            if (subscription.getName().equals(this.getName())){
                b = true;
            }
            else b = false;
        }
        if (a && b == true){
            return true;
        }
        else return false;
    }

    public void sendMessage(User user, String text){
        MessageDatabase.sendMessage(this, user, text);
    }

    @Override
    public String toString() {
        return name;
    }
}
