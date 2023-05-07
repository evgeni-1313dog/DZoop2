public abstract class Predator extends Aquarium {
    public Predator(String name) {
        super(name);
    }
    public String feed(){
        return "meat";
    }
}
