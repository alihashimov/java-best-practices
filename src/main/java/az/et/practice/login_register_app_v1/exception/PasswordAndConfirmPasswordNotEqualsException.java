package az.et.practice.login_register_app_v1.exception;

public class PasswordAndConfirmPasswordNotEqualsException extends RuntimeException {

    public PasswordAndConfirmPasswordNotEqualsException(String message) {
        super(message);
    }
}
