package az.et.practice.login_register_app_v2.dao;

import az.et.practice.login_register_app_v2.dao.entity.UserEntity;

import java.util.Optional;

public class RegisterDaoPostgresImpl implements RegisterDao{
    @Override
    public Optional<UserEntity> findByEmail(String email) {
        return Optional.empty();
    }

    @Override
    public UserEntity addUser(UserEntity newUserEntity) {
        return null;
    }
}
