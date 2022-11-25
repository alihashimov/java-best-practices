package az.et.practice.login_register_app.controller;


import az.et.practice.login_register_app.model.LoginDto;
import az.et.practice.login_register_app.service.LoginService;

public class LoginController {
    private final LoginService loginService;

    public LoginController(LoginService loginService) {
        this.loginService = loginService;
    }

    public String login(LoginDto loginDto) {
        return loginService.login(loginDto);

    }
}
