package az.et.java_ee.web.ee.lesson10;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import static az.et.java_ee.web.ee.lesson10.StaticServlet.BASE_PATH;

public class LoginServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) {
        try (OutputStream os = resp.getOutputStream()) {
            Path path = Paths.get(BASE_PATH, "templates", "login.html");
            Files.copy(path, os);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) {
        String email = req.getParameter("email");
        String pass = req.getParameter("pass");

        String result;

        if (email.equalsIgnoreCase("test@gmail.com")
                && pass.equals("123")) result = "Logged in successfully";
        else result = "Email or password is incorrect!";

        try (OutputStream os = resp.getOutputStream()) {
            os.write(result.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}