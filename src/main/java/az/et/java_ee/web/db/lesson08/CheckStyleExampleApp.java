package az.et.java_ee.web.db.lesson08;

public class CheckStyleExampleApp {

    public static void main(String[] args) {
        // CHECKSTYLE OFF
        if (5 == 5) throw new IllegalArgumentException("Test!");
        // CHECKSTYLE ON
        //build ,check style ,unit testing ,sonarqube-kodun kefiyyeti
    }

}
