package az.et.practice.login_register_app_v2.exception;

public class UserAlreadyException extends RuntimeException {


    public UserAlreadyException(String message) {
        super(message);
    }
}
