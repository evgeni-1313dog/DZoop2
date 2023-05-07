import java.util.List;
import java.util.ArrayList;
public class Water {
    private List<Aquarium> listAquarium = new ArrayList<>();

    public List<Aquarium> getListAquarium() {
        return listAquarium;
    }

    public Water addList(Aquarium aquarium) {
        listAquarium.add(aquarium);
        return this;
    }

    private Radio radio;

    public void setRadio(Radio radio) {
        this.radio = radio;
    }

    public List<Sayable> getSayables() {
        List<Sayable> sayables = new ArrayList<>();
        for (var item : listAquarium) {
            sayables.add(item);
        }
        sayables.add(radio);
        return sayables;
    }

    public List<SwimmingSpeed> swimmingSpeed() {
        List<SwimmingSpeed> swimmingSpeed = new ArrayList<>();
        for (var item : listAquarium) {
            if (item instanceof SwimmingSpeed)
                swimmingSpeed.add((SwimmingSpeed) item);
        }
        return swimmingSpeed;
    }

    public List<RunningSpeed> runningSpeeds() {
        List<RunningSpeed> runningSpeeds = new ArrayList<>();
        for (var item : listAquarium) {
            if (item instanceof RunningSpeed)
                runningSpeeds.add((RunningSpeed) item);
        }
        return runningSpeeds;
    }

    public List<ImmersionDepth> immersionDepths() {
        List<ImmersionDepth> immersionDepths = new ArrayList<>();
        for (var item : listAquarium) {
            if (item instanceof ImmersionDepth)
                immersionDepths.add((ImmersionDepth) item);
        }
        return immersionDepths;
    }

    public SwimmingSpeed winnerdWater() {
        int index = 0;
        for (int i = 0; i < swimmingSpeed().size(); i++) {
            if (swimmingSpeed().get(i).speedWater() > swimmingSpeed().get(index).speedWater())
                index = i;
        }
        return swimmingSpeed().get(index);
    }

    public RunningSpeed winnerMovement() {
        int index = 0;
        for (int i = 0; i < runningSpeeds().size(); i++) {
            if (runningSpeeds().get(i).speedMovement() > runningSpeeds().get(index).speedMovement()) ;
            index = i;
        }
        return runningSpeeds().get(index);
    }

    public ImmersionDepth winnerDiving() {
        int index = 0;
        for (int i = 0; i < immersionDepths().size(); i++) {
            if (immersionDepths().get(i).Diving() > immersionDepths().get(index).Diving()) ;
            index = i;
        }
        return immersionDepths().get(index);
    }
}