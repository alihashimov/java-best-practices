package az.et.java_se.login_register_app_v2.controller;


import az.et.java_se.login_register_app_v2.exception.PasswordAndConfirmPasswordNotEqualsException;
import az.et.java_se.login_register_app_v2.model.CommonResponseDto;
import az.et.java_se.login_register_app_v2.model.RegisterDto;
import az.et.java_se.login_register_app_v2.service.RegisterService;

public class RegisterController {
    private final RegisterService registerService;

    public RegisterController(RegisterService registerService) {
        this.registerService = registerService;
    }

    public CommonResponseDto<RegisterDto> register(RegisterDto registerDto) {
        if (registerDto.getName() == null || registerDto.getName().isBlank())
            throw new IllegalArgumentException("user's name cannot be blank!");

        if (!registerDto.getPassword().equals(registerDto.getConfirmPassword()))
            throw new PasswordAndConfirmPasswordNotEqualsException(
                    String.format("Password: '%s' and confirm password :'%s' are not equals!"
                            , registerDto.getPassword(), registerDto.getConfirmPassword())
            );
        RegisterDto registeredUser = registerService.register(registerDto);
        return new CommonResponseDto<>(registeredUser, 200);

    }
}
