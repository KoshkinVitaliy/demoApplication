package users;

import java.util.ArrayList;
import java.util.List;

public class DataUsers {

    public static List<User> data = new ArrayList<>();

    static {
        User admin = new User("admin", "0000");
        User user = new User("user", "1111");
        data.add(admin);
        data.add(user);
    }
}
