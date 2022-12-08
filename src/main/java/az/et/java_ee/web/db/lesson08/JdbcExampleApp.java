package az.et.java_ee.web.db.lesson08;

import java.sql.*;

public class JdbcExampleApp {
    public static void main(String[] args) {
        // 1. add Driver to project(pom.xml)
        //2. Create Connection
        //3.statement
        //4. ResultSet

        try {
            StringBuilder stringBuilder = new StringBuilder();

            Connection connection = DriverManager.getConnection(
                    "jdbc:postgresql://localhost:5432/postgres",
                    "postgres",
                    "123456");
            String insertCountry = "INSERT INTO countries(name) values('PLN')";
            PreparedStatement insertStatement = connection.prepareStatement(insertCountry);
            int i = insertStatement.executeUpdate();
            System.out.println("Rows added:" + i);

            String gelAllCountriesSql = "SELECT * FROM countries";
            PreparedStatement statement = connection.prepareStatement(gelAllCountriesSql);
            ResultSet rs1 = statement.executeQuery();
            while (rs1.next()) {
                int id = rs1.getInt("id");
                String name = rs1.getString("name");
                Countries countries = new Countries(id, name);
                stringBuilder.append(countries);
                stringBuilder.append("\n");
            }
            System.out.println(stringBuilder.toString());

            System.out.println("-----------------------");

            String deleteCountryById = "DELETE from countries where id = ?";
            PreparedStatement del = connection.prepareStatement(deleteCountryById);
            del.setInt(1, 2);
            int delCount = del.executeUpdate();
            System.out.println("Rows added:" + delCount);


            String getAllCountriesSql2 = "SELECT * FROM countries;";
            PreparedStatement ps2 = connection.prepareStatement(getAllCountriesSql2);
            ResultSet rs2 = ps2.executeQuery();

            while (rs2.next()) {
                int countryId = rs2.getInt("id");
                String countryName = rs2.getString("name");
                System.out.println("countryId:" + countryId + ", countryName:" + countryName);
            }
//            rs1.close();
//            statement.close();
            connection.close();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
