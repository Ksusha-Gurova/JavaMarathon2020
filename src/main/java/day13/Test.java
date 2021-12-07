package day13;

public class Test {
    public static void main(String[] args) {
        User user1 = new User("Аркаша");
        User user2 = new User("Акакий");
        User user3 = new User("Маруся");

        user2.sendMessage(user1, "Hello");
        user1.sendMessage(user2, "Helloo");
        user2.sendMessage(user1, "Hellooo");
        user1.sendMessage(user2, "Helloooo");
        user2.sendMessage(user1, "Hellooooo");

        user3.sendMessage(user1, "Privet");
        user1.sendMessage(user3, "Privett");
        user3.sendMessage(user1, "Privettt");
        user1.sendMessage(user3, "Privetttt");
        user3.sendMessage(user1, "Privettttt");
        user1.sendMessage(user3, "Privetttttt");

        user3.sendMessage(user2, "hi");

        MessageDatabase.showDialog(user1, user3);

//        закомментирована проверка остальных методов программы

//        user1.subscribe(user2);
//        System.out.println(user1.getSubscriptions());
//
//        System.out.println(user1.isSubscribed(user2));
//        System.out.println(user1.isSubscribed(user3));

//        user2.subscribe(user1);
//        System.out.println(user1.isFriend(user2));
//        System.out.println(user1.isFriend(user3));
//
//        System.out.println(user1.toString());

//        Message message3 = MessageDatabase.getMessages().get(3);
//        System.out.println(message3);
    }
}
