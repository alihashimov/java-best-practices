package az.et.practice.login_register_app.dao;


import az.et.practice.login_register_app.dao.entity.UserEntity;

public interface LoginDao {
    UserEntity findUserByEmail(String email);
}
