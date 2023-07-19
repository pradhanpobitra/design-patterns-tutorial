package patterns.singleton.example1;

public class Main {

    public static void main(String[] args) {

        SingletonExample1 singleton1 = SingletonExample1.getInstance();
        SingletonExample1 singleton2 = SingletonExample1.getInstance();
        SingletonExample1 singleton3 = SingletonExample1.getInstance();

        System.out.println(singleton1);
        System.out.println(singleton2);
        System.out.println(singleton3);
    }
}
