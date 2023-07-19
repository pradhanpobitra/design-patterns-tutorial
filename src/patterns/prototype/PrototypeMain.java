package patterns.prototype;

public class PrototypeMain {

    public static void main(String[] args) {
        IF16Prototype prototype = new F16();

        IF16Prototype prototype1 = prototype.clone();
        prototype1.setF16Engine(F16Engine._3_STROKE);

        IF16Prototype prototype2 = prototype.clone();
        prototype2.setF16Engine(F16Engine._4_STROKE);
    }
}
