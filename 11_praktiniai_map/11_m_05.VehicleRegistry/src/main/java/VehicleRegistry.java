import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class VehicleRegistry {
    private HashMap<LicensePlate, String> registry = new HashMap<>();

    public boolean add(LicensePlate licensePlate, String owner) {
        if (!registry.containsKey(licensePlate)) {
            registry.put(licensePlate, owner);
            return true;
        }
        return false;
    }

    public String get(LicensePlate licensePlate) {
        if (registry.containsKey(licensePlate)) {
            return registry.get(licensePlate);
        } else {
            return null;
        }

    }

    public boolean remove(LicensePlate licensePlate) {
        if (registry.containsKey(licensePlate)) {
            registry.remove(licensePlate);
            return true;

        }
        return false;
    }

    public void printLicensePlates() {
        for (HashMap.Entry plates : registry.entrySet()) {
            System.out.println(plates.getKey());
        }
    }


    public void printOwners() {
        Set<String> uniqueOwners = new HashSet<>();
        for (Map.Entry<LicensePlate, String> entry : registry.entrySet()) {
            String owner = entry.getValue();
            if (!uniqueOwners.contains(owner)) {
                System.out.println(owner);
                uniqueOwners.add(owner);
            }
        }
    }

}
