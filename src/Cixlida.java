public class Cixlida extends Predator implements SwimmingSpeed, ImmersionDepth{
    public Cixlida(String name) {
        super(name);
    }

    @Override
    public String color() {
        return "yellow";
    }

    @Override
    public String toString() {
        return String.format("Cixlida, %s", super.toString());
    }

    @Override
    public int speedWater() {
        return 40;
    }

    @Override
    public int Diving() {
        return 30;
    }
}

