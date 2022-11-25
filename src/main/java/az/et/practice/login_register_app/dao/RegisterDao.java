package az.et.practice.login_register_app.dao;


import az.et.practice.login_register_app.dao.entity.UserEntity;

import java.util.Optional;

public interface RegisterDao {


    Optional<UserEntity> findByEmail(final String email);

    UserEntity addUser(UserEntity newUserEntity);
}
