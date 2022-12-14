package az.et.practice.login_register_app_v1.dao.entity;

import java.time.LocalDateTime;
import java.util.Objects;

public class UserEntity {
    private Long id;
    private Integer age;
    private String name;
    private String email;
    private String password;
    private LocalDateTime createDate;
    private LocalDateTime updateDate;

    public UserEntity(Integer age, String name, String email, String password) {
        this.age = age;
        this.name = name;
        this.email = email;
        this.password = password;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public LocalDateTime getCreateDate() {
        return createDate;
    }

    public void setCreateDate(LocalDateTime createDate) {
        this.createDate = createDate;
    }

    public LocalDateTime getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(LocalDateTime updateDate) {
        this.updateDate = updateDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserEntity that = (UserEntity) o;
        return Objects.equals(this.age, that.age)
                && Objects.equals(this.name, that.name)
                && Objects.equals(this.email, that.email)
                && Objects.equals(this.password, that.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, name, email, password);
    }

    @Override
    public String toString() {
        return String.format("{id=%d, age=%d, name='%s', email='%s', password='%s', createDate=%s, updateDate=%s}", id, age, name, email, password, createDate, updateDate);
    }
}
