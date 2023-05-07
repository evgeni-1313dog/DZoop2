public abstract class Herbivors extends Aquarium {
    public Herbivors(String name) {
        super(name);
    }
    public String feed(){
        return "grass";
    }
}