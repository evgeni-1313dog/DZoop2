
public class Main {
    public static void main(String[] args) {
        Water water = new Water();
        water.setRadio(new Radio());

        water.addList(new Cixlida("Cichlid"))
                .addList(new Turtle("Turtle"))
                .addList(new Triton("Triton"))
                .addList(new Shark("Bebi"));

        for(var item: water.getSayables()){
            System.out.println(item);
        }
        System.out.println("--------------------");
        for (var item: water.getListAquarium()){
            System.out.println(item.color());
        }
        System.out.println("--------------------");
        for(var item: water.swimmingSpeed()){
            //System.out.println(item.toString());
            System.out.printf("%s - %d\n", item.toString(), item.speedWater());
        }
        System.out.println("--------------------");
        for(var item: water.runningSpeeds()){
            //System.out.println(item.toString());
            System.out.printf("%s - %d\n", item.toString(), item.speedMovement());
        }
        System.out.println("--------------------");
        for(var item: water.immersionDepths()){
            //System.out.println(item.toString());
            System.out.printf("%s - %d\n", item.toString(), item.Diving());
        }
        System.out.println("--------------------");
        System.out.println("Winner" + water.winnerdWater());
        System.out.println("--------------------");
        System.out.println("Winner" + water.winnerMovement());
        System.out.println("--------------------");
        System.out.println("Winner" + water.winnerDiving());
    }
}