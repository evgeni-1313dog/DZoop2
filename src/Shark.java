public class Shark extends Predator implements SwimmingSpeed, ImmersionDepth{
    public Shark(String name) {
        super(name);
    }

    @Override
    public String color() {
        return "orange";
    }

    @Override
    public int speedWater() {
        return 65;
    }

    @Override
    public int Diving() {
        return 500;
    }
}
