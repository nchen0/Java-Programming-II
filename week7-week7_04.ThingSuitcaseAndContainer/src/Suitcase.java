import java.util.ArrayList;

public class Suitcase {
    private ArrayList<Thing> things;
    private int maxWeight;

    public Suitcase(int maxWeight) {
        this.maxWeight = maxWeight;
        this.things = new ArrayList<Thing>();
    }

    public void addThing(Thing thing) {
        int sum = 0;
        for (Thing item : things) {
            sum += item.getWeight();
        }
        if (thing.getWeight() + sum <= maxWeight) {
            things.add(thing);
        }
    }

    public String toString() {
        int sum = 0;
        String verbiage;
        for (Thing item : things) {
            sum += item.getWeight();
        }
        if (things.size() == 0) {
            verbiage = "empty";
            return verbiage + " (" + sum + " kg)";
        } else if (things.size() == 1) {
            verbiage = "thing";
        } else {
            verbiage = "things";
        }
        return things.size() + " " + verbiage + " (" + sum + " kg)";
    }

    public void printThings() {
        for (Thing item : things) {
            System.out.println(item);
        }
    }

    public int totalWeight() {
        int sum = 0;
        for (Thing item : things) {
            sum += item.getWeight();
        }
        return sum;
    }

    public Thing heaviestThing() {
        if (things.size() == 0) {
            return null;
        }
        Thing heaviest = things.get(0);
        for (Thing item : things) {
            if (item.getWeight() > heaviest.getWeight()) {
                heaviest = item;
            }
        }
        return heaviest;
    }
}
