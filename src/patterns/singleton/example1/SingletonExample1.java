package patterns.singleton.example1;

public class SingletonExample1 {
    private static SingletonExample1 singleton;
    private SingletonExample1() {

    }


    // synchronized to make the creation of the singleton thread safe i.e to get around the race condition between two or more threads
    synchronized public static SingletonExample1 getInstance() {
        if(singleton == null) {
            singleton = new SingletonExample1();
        }

        return singleton;
    }
}