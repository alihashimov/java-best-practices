package az.et.java_ee.web.ee.lesson10;


import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;

public class JettyServerApp {

    public static void main(String[] args) throws Exception {
        Server server = new Server(8080);
        ServletContextHandler handler = new ServletContextHandler();
        handler.addServlet(new ServletHolder(new InfoServlet()), "/"); //->http://localhost:8080/
        server.setHandler(handler);
        server.start();
        server.join();
    }
}
