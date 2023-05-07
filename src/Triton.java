public class Triton extends Herbivors implements SwimmingSpeed, RunningSpeed, ImmersionDepth{
    public Triton(String name) {
        super(name);
    }

    @Override
    public String color() {
        return "red";
    }

    @Override
    public int speedWater() {
        return 100;
    }


    @Override
    public int speedMovement() {
        return 5;
    }

    @Override
    public int Diving() {
        return 4;
    }
}
