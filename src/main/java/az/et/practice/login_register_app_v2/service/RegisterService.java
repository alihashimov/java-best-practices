package az.et.practice.login_register_app_v2.service;


import az.et.practice.login_register_app_v2.dao.RegisterDao;
import az.et.practice.login_register_app_v2.dao.entity.UserEntity;
import az.et.practice.login_register_app_v2.exception.UserAlreadyException;
import az.et.practice.login_register_app_v2.model.RegisterDto;

import java.util.Optional;

public class RegisterService {
    private final RegisterDao registerDao;

    public RegisterService(RegisterDao registerDao) {
        this.registerDao = registerDao;
    }

    public RegisterDto register(RegisterDto registerDto) {
        final String email = registerDto.getEmail();
        Optional<UserEntity> userByEmail = registerDao.findByEmail(email);
        if (userByEmail.isPresent()) throw new UserAlreadyException("user with email" + email + " already exists.");
        //dto ->entity
        UserEntity newUserEntity = new UserEntity(registerDto.getAge()
                , registerDto.getName()
                , registerDto.getEmail()
                , registerDto.getPassword());
        UserEntity addedUser = registerDao.addUser(newUserEntity);
        return new RegisterDto(addedUser.getAge(), addedUser.getName(), addedUser.getEmail());

    }
}
