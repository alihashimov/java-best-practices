package az.et.practice.login_register_app_v2.controller;


import az.et.practice.login_register_app_v2.exception.PasswordAndConfirmPasswordNotEqualsException;
import az.et.practice.login_register_app_v2.model.dto.CommonResponseDto;
import az.et.practice.login_register_app_v2.model.dto.RegisterDto;
import az.et.practice.login_register_app_v2.model.request.RegisterRequest;
import az.et.practice.login_register_app_v2.service.RegisterService;

public class RegisterController {
    private final RegisterService registerService;

    public RegisterController(RegisterService registerService) {
        this.registerService = registerService;
    }

    public CommonResponseDto<RegisterDto> register(RegisterRequest request) {
        if (request.getName() == null || request.getName().isBlank()) {
            throw new IllegalArgumentException("user's name cannot be blank!!");
        }
        if (!request.getPassword().equals(request.getConfirmPassword())) {
            throw new PasswordAndConfirmPasswordNotEqualsException(
                    String.format("Password: '%s' and confirm password :'%s' are not equals!"
                            , request.getPassword(), request.getConfirmPassword())
            );
        }
        RegisterDto registeredUser = registerService.register(request);
        return new CommonResponseDto<>(registeredUser, 200);

    }
}
