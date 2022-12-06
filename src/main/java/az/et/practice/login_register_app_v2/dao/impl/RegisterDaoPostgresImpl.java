package az.et.practice.login_register_app_v2.dao.impl;

import az.et.practice.login_register_app_v2.dao.RegisterDao;
import az.et.practice.login_register_app_v2.dao.entity.UserEntity;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.Optional;

public class RegisterDaoPostgresImpl implements RegisterDao {
    private static final String FIND_BY_EMAIL_SQL = "SELECT * FROM users where email=?";
    private static final String ADD_USER_SQL = "INSERT INTO users(age,name,email,password) VALUES (?, ?, ?, ?)";
    private final Connection conn;

    public RegisterDaoPostgresImpl(Connection conn) {
        this.conn = conn;
    }

    @Override
    public Optional<UserEntity> findByEmail(String email) {
        UserEntity userEntity = null;
        try {
            PreparedStatement ps = conn.prepareStatement(FIND_BY_EMAIL_SQL);
            ps.setString(1, email);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                long id = rs.getLong("id");
                int age = rs.getInt("age");
                String name = rs.getString("name");
                String password = rs.getString("password");
                LocalDateTime createDate = rs.getDate("create_date").toLocalDate().atStartOfDay();
                LocalDateTime updateDate = rs.getDate("update_date").toLocalDate().atStartOfDay();
                userEntity = new UserEntity(id, age, name, email, password, createDate, updateDate);
                System.out.println(userEntity);

            }
            rs.close();
            ps.close();
            return Optional.ofNullable(userEntity);
        } catch (SQLException e) {
            e.printStackTrace();
            return Optional.empty();

        }
    }

    @Override
    public UserEntity addUser(UserEntity newUserEntity) {
        try {
            PreparedStatement ps = conn.prepareStatement(ADD_USER_SQL);
            ps.setInt(1, newUserEntity.getAge());
            ps.setString(2, newUserEntity.getName());
            ps.setString(3, newUserEntity.getEmail());
            ps.setString(4, newUserEntity.getPassword());
            ps.executeUpdate();
            return newUserEntity;
        } catch (SQLException e) {
            throw new RuntimeException();
        }
    }
}
