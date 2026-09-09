public class Main {
    public static void main(String[] args) {

        User user1 = new User();
        User user2 = new User();
        User user3 = new User();

        user1.setName("Вася");
        user2.setName("Петя");

        Message mes1 = new Message();
        Message mes2 = new Message();

        mes2.setInfo("ВАААААУ");

        mes1.setInfo("Хахахахахаха");

        System.out.println(user1.getName() + " написал сообщение: " + mes1.getInfo());
        System.out.println(user2.getName() + " написал сообщение: " + mes2.getInfo());

    }
}
