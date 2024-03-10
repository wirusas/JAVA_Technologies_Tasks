import java.util.ArrayList;
import java.util.Collections;

public class Suitcase {

    private int maximumWeight;
    private ArrayList<Item> items;

    public Suitcase(int maximumWeight) {
        this.items = new ArrayList<>();
        this.maximumWeight = maximumWeight;
    }

    public void addItem(Item item) {
        if (totalWeight() + item.getWeight() <= maximumWeight) {
            items.add(item);
        }
    }

    public int totalWeight() {
        int sum = 0;
        for (Item item : items) {
            sum += item.getWeight();
        }
        return sum;
    }

    public void printItems() {
        for (Item item : items) {
            System.out.println(item);
        }
    }

    public Item heaviestItem() {
        if (items.isEmpty()) {
            return null;
        }
        return Collections.max(items, (item1, item2) -> item1.getWeight() - item2.getWeight());
    }

    @Override
    public String toString() {
        return items.size() + (items.size() == 1 ? " item (" : " items (") + totalWeight() + " kg)";
    }
}
