import java.util.ArrayList;

public class Box implements ToBeStored {
    private double maxWeight;
    private ArrayList<ToBeStored> things = new ArrayList<ToBeStored>();

    public Box(double maxWeight) {
        this.maxWeight = maxWeight;
    }

    public void add(ToBeStored thing) {
        double total = 0;
        for (ToBeStored i : things) {
            total += i.weight();
        }
        if (thing.weight() + total <= maxWeight) {
            things.add(thing);
        }
    }

    public double weight() {
        double weight = 0;
        for (ToBeStored i : things) {
            weight += i.weight();
        }
        return weight;
    }

    @Override
    public String toString() {
        int count = 0;
        double total = 0;
        for (ToBeStored i : things) {
            total += i.weight();
            count ++;
        }
        return "Box: " + count + " things, total weight " + total + " kg";
    }
}
