import java.util.ArrayList;
import java.util.HashMap;

public class StorageFacility {

    HashMap<String, ArrayList<String>> storage = new HashMap<>();

    public void add(String unit, String item) {
        ArrayList<String> items = storage.getOrDefault(unit, new ArrayList<>());
        items.add(item);
        storage.put(unit, items);

    }

    public ArrayList<String> contents(String storageUnit) {
        return new ArrayList<>(storage.getOrDefault(storageUnit, new ArrayList<>()));

    }

    public void remove(String storageUnit, String item) {
        ArrayList<String> items = storage.get(storageUnit);
        if (items != null) {
            items.remove(item);
        }
    }

    public ArrayList<String> storageUnits() {
        ArrayList<String> namesOfStorageUnits = new ArrayList<>();
        for (String unit : storage.keySet()) {
            if (unit != null && !unit.isEmpty()) {
                namesOfStorageUnits.add(unit);
            }
        }
        return namesOfStorageUnits;
    }
}

