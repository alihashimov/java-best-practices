package az.et.practice.login_register_app_v2.exception;

public class PasswordAndConfirmPasswordNotEqualsException extends RuntimeException {

    public PasswordAndConfirmPasswordNotEqualsException(String mes) {
        super(mes);
    }
}
