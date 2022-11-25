package az.et.practice.login_register_app.dao;


import az.et.practice.login_register_app.dao.entity.UserEntity;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class LoginDaoListImpl implements LoginDao {

    private static final List<UserEntity> USERS = new ArrayList<>(
            Arrays.asList(
                    new UserEntity(24, "Elvin", "e@e.com", "123"),
                    new UserEntity(20, "Elvin2", "e@e.com", "123")

            )
    );
    @Override
    public UserEntity findUserByEmail(String email) {
        return USERS.stream().filter(user -> user.getEmail().equalsIgnoreCase(email)).findFirst().get();
    }
}
