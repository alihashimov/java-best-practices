package az.et.practice.login_register_app_v1.controller;


import az.et.practice.login_register_app_v1.model.LoginDto;
import az.et.practice.login_register_app_v1.service.LoginService;

public class LoginController {
    private final LoginService loginService;

    public LoginController(LoginService loginService) {
        this.loginService = loginService;
    }

    public String login(LoginDto loginDto) {
        return loginService.login(loginDto);

    }
}
