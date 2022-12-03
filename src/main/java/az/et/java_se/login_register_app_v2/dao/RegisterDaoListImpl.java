package az.et.java_se.login_register_app_v2.dao;



import az.et.java_se.login_register_app_v2.dao.entity.UserEntity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;


public class RegisterDaoListImpl implements RegisterDao {

    private static final List<UserEntity> USERS = new ArrayList<>(
            Arrays.asList(
                    new UserEntity(24, "Elvin", "e@e.com", "123"),
                    new UserEntity(20, "Elvin2", "e@e.com", "123")

            )
    );

    @Override
    public Optional<UserEntity> findByEmail(final String email) {
        return USERS.stream().filter(user -> user.getEmail().equalsIgnoreCase(email)).findFirst();
    }

    @Override
    public UserEntity addUser(UserEntity newUserEntity) {
        newUserEntity.setId((long) (Math.random() * 1000));
        newUserEntity.setCreateDate(LocalDateTime.now());
        newUserEntity.setUpdateDate(LocalDateTime.now());
        USERS.add(newUserEntity);
        USERS.forEach(System.err::println);
        return newUserEntity;
    }
}
