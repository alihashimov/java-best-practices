package az.et.practice.login_register_app_v2;

import az.et.practice.login_register_app_v2.controller.RegisterController;
import az.et.practice.login_register_app_v2.dao.RegisterDao;
import az.et.practice.login_register_app_v2.dao.RegisterDaoListImpl;
import az.et.practice.login_register_app_v2.service.RegisterService;

public class LoginRegisterApp {
    public static void main(String[] args) {
        LoginRegisterApp.run();
    }

    private static void run() {
        final RegisterDao registerDao = new RegisterDaoListImpl();
        final RegisterService registerService = new RegisterService(registerDao);
        final RegisterController registerController = new RegisterController(registerService);
    }
}
