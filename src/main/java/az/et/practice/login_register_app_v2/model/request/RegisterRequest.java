package az.et.practice.login_register_app_v2.model.request;

import java.util.Objects;

public class RegisterRequest {
    private Integer age;
    private String name;
    private String email;
    private String password;
    private String confirmPassword;

    public RegisterRequest(Integer age, String name, String email) {
        this.age = age;
        this.name = name;
        this.email = email;
    }

    public RegisterRequest(Integer age, String name, String email, String password, String confirmPassword) {
        this.age = age;
        this.name = name;
        this.email = email;
        this.password = password;
        this.confirmPassword = confirmPassword;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RegisterRequest that = (RegisterRequest) o;
        return Objects.equals(this.age, that.age)
                && Objects.equals(this.name, that.name)
                && Objects.equals(this.email, that.email)
                && Objects.equals(this.password, that.password)
                && Objects.equals(this.confirmPassword, that.confirmPassword);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, name, email, password, confirmPassword);
    }

    @Override
    public String toString() {
        return String.format("RegisterDto{age=%d, name='%s', email='%s', password='%s', confirmPassword='%s'}", age, name, email, password, confirmPassword);
    }
}
