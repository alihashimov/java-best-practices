package az.et.java_se.login_register_app_v2.dao;


import az.et.java_se.login_register_app_v2.dao.entity.UserEntity;

public interface LoginDao {
    UserEntity findUserByEmail(String email);
}
