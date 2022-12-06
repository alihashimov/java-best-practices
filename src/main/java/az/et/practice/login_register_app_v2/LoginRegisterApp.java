package az.et.practice.login_register_app_v2;

import az.et.practice.login_register_app_v2.config.DataSourceConfig;
import az.et.practice.login_register_app_v2.config.PostgresDataSourceConfig;
import az.et.practice.login_register_app_v2.controller.RegisterController;
import az.et.practice.login_register_app_v2.dao.RegisterDao;
import az.et.practice.login_register_app_v2.dao.impl.RegisterDaoPostgresImpl;
import az.et.practice.login_register_app_v2.exception.UserAlreadyException;
import az.et.practice.login_register_app_v2.model.dto.CommonResponseDto;
import az.et.practice.login_register_app_v2.model.dto.RegisterDto;
import az.et.practice.login_register_app_v2.model.request.RegisterRequest;
import az.et.practice.login_register_app_v2.service.RegisterService;

import java.sql.Connection;

public class LoginRegisterApp {

    public static void main(String[] args) {
        LoginRegisterApp.run();
    }

    private static void run() {
        final DataSourceConfig postgresDataSourceConfig =
                new PostgresDataSourceConfig();
        Connection connection = postgresDataSourceConfig.getConnection();
        final RegisterDao registerDao = new RegisterDaoPostgresImpl(connection);


        final RegisterService registerService = new RegisterService(registerDao);
        final RegisterController registerController = new RegisterController(registerService);

        try {
            //todo add request
            CommonResponseDto<RegisterDto> result = registerController.register(
                    new RegisterRequest(24, "", "e@a.com", "123", "123"));
            System.out.println(result);
        } catch (UserAlreadyException e) {
            System.out.println(e.getMessage());
        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
        }
    }

}

