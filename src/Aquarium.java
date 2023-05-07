public abstract class Aquarium implements Sayable{
    private String name;

    public Aquarium(String name) {
        this.name = name;
    }

   // public abstract String color();

    public abstract String feed();

    @Override
    public String toString() {
        return String.format("Name %s", "color %s", "feed %s", name, color(), feed());
    }
}

