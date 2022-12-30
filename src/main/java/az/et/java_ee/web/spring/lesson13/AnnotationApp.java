package az.et.java_ee.web.spring.lesson13;

public class AnnotationApp {
    public static void main(String[] args) {

    }

    static class Human {
        private int age;

        public void go() throws RuntimeException{
            System.out.println("Human going");
        }
    }

    static class Teacher extends Human {
        private int age;

        @Override
        public void go() throws ArrayIndexOutOfBoundsException{
            System.out.println("Teacher going");

        }
    }
}
