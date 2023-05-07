public class Turtle extends Predator implements SwimmingSpeed, RunningSpeed, ImmersionDepth{
    public Turtle(String name) {
        super(name);
    }

    @Override
    public String color() {
        return "black";
    }

    @Override
    public String toString() {
        return String.format("Turtle, %s", super.toString());
    }

    @Override
    public int speedMovement() {
        return 20;
    }

    @Override
    public int speedWater() {
        return 30;
    }

    @Override
    public int Diving() {
        return 300;
    }
}
