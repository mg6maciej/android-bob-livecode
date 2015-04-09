package pl.mg6.bob.livecode;

import java.util.ArrayList;
import java.util.List;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
@lombok.experimental.Wither
public class User {

    String fullName;
    boolean admin;

    List<User> friends;

    public static void xx() {

        List<User> myFriends = new ArrayList<>();
        myFriends.add(User.builder().admin(true).build());
        myFriends.add(User.builder().admin(false).build());
        User hiddenAdmin = User.builder().friends(myFriends).admin(true).build();

        List<User> adminFriends = new ArrayList<>();
        for (User user : hiddenAdmin.getFriends()) {
            if (user.isAdmin()) {
                adminFriends.add(user);
            }
        }
    }
}
