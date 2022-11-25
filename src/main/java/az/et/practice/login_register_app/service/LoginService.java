package az.et.practice.login_register_app.service;


import az.et.practice.login_register_app.dao.LoginDao;
import az.et.practice.login_register_app.dao.entity.UserEntity;
import az.et.practice.login_register_app.exception.IncorrectPasswordException;
import az.et.practice.login_register_app.exception.UserNotFoundException;
import az.et.practice.login_register_app.model.LoginDto;

public class LoginService {

    private final LoginDao loginDao;

    public LoginService(LoginDao loginDao) {
        this.loginDao = loginDao;
    }

    public String login(LoginDto loginDto) {
        UserEntity user = loginDao.findUserByEmail(loginDto.getEmail());
        System.out.println("user="+user);
        if (user == null)
            throw new UserNotFoundException(String.format("User with email: '%s' does not exits!", loginDto.getEmail()));
        if (!loginDto.getPassword().equals(user.getPassword()))
            throw new IncorrectPasswordException(
                    String.format("Entered  password: '%s' is incorrect!", loginDto.getPassword()));

        return "Login is successfully";

    }
}
