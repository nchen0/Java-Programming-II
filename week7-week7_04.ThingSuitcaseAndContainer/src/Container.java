import java.util.ArrayList;

public class Container {
    private int maxWeight;
    private ArrayList<Suitcase> container;

    public Container(int maxWeight) {
        this.maxWeight = maxWeight;
        this.container = new ArrayList<Suitcase>();
    }

    public void addSuitcase(Suitcase suitcase) {
        int total = 0;
        for (Suitcase s : container) {
            total += s.totalWeight();
        }
        if (suitcase.totalWeight() + total <= maxWeight) {
            container.add(suitcase);
        }
    }

    public String toString() {
        int total = 0;
        for (Suitcase s : container) {
            total += s.totalWeight();
        }
        return container.size() + " suitcases (" + total + " kg)";
    }

    public void printThings() {
        for (Suitcase s : container) {
            s.printThings();
        }
    }


}
