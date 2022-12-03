package az.et.practice.login_register_app_v1.dao;


import az.et.practice.login_register_app_v1.dao.entity.UserEntity;

public interface LoginDao {
    UserEntity findUserByEmail(String email);
}
