package az.et.java_ee.web.ee.lesson10;


import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;

public class JettyServerApp {

    public static void main(String[] args) throws Exception {
        Server server = new Server(8080);
        ServletContextHandler handler = new ServletContextHandler();
        handler.addServlet(new ServletHolder(new InfoServlet()), "/"); //->http://localhost:8080/
        handler.addServlet(new ServletHolder(new LoginServlet()), "/login"); //->http://localhost:8080/login
        handler.addServlet(new ServletHolder(new StaticServlet("image")), "/image/*");
        handler.addServlet(new ServletHolder(new StaticServlet("js")), "/js/*");
        handler.addServlet(new ServletHolder(new StaticServlet("css")), "/css/*");
        server.setHandler(handler);
        server.start();
        server.join();
    }
}
