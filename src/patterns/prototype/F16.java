package patterns.prototype;

public class F16 implements IF16Prototype{

    private F16Engine f16Engine;
    private String cockPit;
    private String wings;

    public F16() {
        this.cockPit = "strong build";
        this.wings = "flexible build";
    }

    @Override
    public void setF16Engine(F16Engine f16Engine) {
        this.f16Engine = f16Engine;
    }

    @Override
    public IF16Prototype clone() {
        return new F16();
    }
}
