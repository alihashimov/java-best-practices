package az.et.java_ee.web.spring.lesson14;

public final class ClassSingleton {

    private static ClassSingleton INSTANCE;

    private ClassSingleton() {

    }

    public static ClassSingleton getInstance() {
        if(INSTANCE == null) {
            INSTANCE = new ClassSingleton();
        }

        return INSTANCE;
    }


}
