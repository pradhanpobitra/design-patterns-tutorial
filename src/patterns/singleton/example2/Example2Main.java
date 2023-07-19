package patterns.singleton.example2;

public class Example2Main {

    public static void main(String[] args) {
        SIngletonExample2 sIngletonExample21 = SIngletonExample2.getInstance();
        SIngletonExample2 sIngletonExample22 = SIngletonExample2.getInstance();

        System.out.println(sIngletonExample21);
        System.out.println(sIngletonExample22);
    }
}
