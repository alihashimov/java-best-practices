package az.et.java_ee.web.ee.lesson10;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class StaticServlet extends HttpServlet {
    public static final String BASE_PATH="src/main/java/az/et/java_ee/web/ee/lesson10/resource";
    private final String subPath;

    public StaticServlet(String subPath) {
        this.subPath = subPath;
    }
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        final String filename = req.getPathInfo();

        Path path = Paths.get(BASE_PATH, subPath, filename);
        try(OutputStream os = resp.getOutputStream()) {
            Files.copy(path, os);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
