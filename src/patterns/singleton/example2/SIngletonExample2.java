package patterns.singleton.example2;

public class SIngletonExample2 {

    // static initialization of singleton instance to ensure the only thread that loads this class is responsible for creation of the instance
    private static SIngletonExample2 sIngletonExample2;

    private SIngletonExample2() {}

    static {
        sIngletonExample2 = new SIngletonExample2();
    }

    public static SIngletonExample2 getInstance() {
        return sIngletonExample2;
    }
}
