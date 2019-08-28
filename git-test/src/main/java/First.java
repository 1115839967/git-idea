import java.util.ArrayList;
import java.util.stream.Collectors;

public class First {
    public static void main(String[] args) {
        User user1 = new User("张三", "男", 22);
        User user2 = new User("李四", "女", 19);
        User user3 = new User("王五", "男", 20);
        User user4 = new User("赵六", "男", 25);
        User user5 = new User("小红", "女", 18);
        User user6 = new User("小明", "男", 21);
        ArrayList<User> userList = new ArrayList<User>(6);
        userList.add(user1);
        userList.add(user2);
        userList.add(user3);
        userList.add(user4);
        userList.add(user5);
        userList.add(user6);
        System.out.println(userList);

        System.out.println(userList.stream().map(User::getName).collect(Collectors.toList()));
        System.out.println(userList.stream().map(User::getAge).collect(Collectors.toList()));
        System.out.println(userList.stream().map(User::getSex).collect(Collectors.toList()));
    }
}
