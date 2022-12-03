package az.et.practice.login_register_app_v1.dao;


import az.et.practice.login_register_app_v1.dao.entity.UserEntity;

import java.util.Optional;

public interface RegisterDao {


    Optional<UserEntity> findByEmail(final String email);

    UserEntity addUser(UserEntity newUserEntity);
}
