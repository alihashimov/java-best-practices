package az.et.java_se.login_register_app_v2.controller;


import az.et.java_se.login_register_app_v2.model.LoginDto;
import az.et.java_se.login_register_app_v2.service.LoginService;

public class LoginController {
    private final LoginService loginService;

    public LoginController(LoginService loginService) {
        this.loginService = loginService;
    }

    public String login(LoginDto loginDto) {
        return loginService.login(loginDto);

    }
}
