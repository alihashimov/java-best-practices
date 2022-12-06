package az.et.practice.login_register_app_v2.service;


import az.et.practice.login_register_app_v2.dao.RegisterDao;
import az.et.practice.login_register_app_v2.dao.entity.UserEntity;
import az.et.practice.login_register_app_v2.exception.UserAlreadyException;
import az.et.practice.login_register_app_v2.model.dto.RegisterDto;
import az.et.practice.login_register_app_v2.model.request.RegisterRequest;

public class RegisterService {
    private final RegisterDao registerDao;

    public RegisterService(RegisterDao registerDao) {
        this.registerDao = registerDao;
    }

    public RegisterDto register(RegisterRequest request) {
        final String email = request.getEmail();

        registerDao.findByEmail(email)
                .ifPresent(user -> {
                    throw new UserAlreadyException("user with email" + email + " already exists.");
                });
        final UserEntity newUserEntity = new UserEntity(request.getAge()
                , request.getName()
                , request.getEmail()
                , request.getPassword());
        UserEntity addedUser = registerDao.addUser(newUserEntity);
        return new RegisterDto(addedUser.getAge(), addedUser.getName(), addedUser.getEmail());

    }
}
