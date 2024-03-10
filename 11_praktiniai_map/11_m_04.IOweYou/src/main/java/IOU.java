import java.util.HashMap;
import java.util.Map;

public class IOU {
    private HashMap<String, Double> loan = new HashMap<>();

    public IOU() {
    }

    public void setSum(String toWhom, double amount) {
        loan.put(toWhom, amount);
    }

    public double howMuchDoIOweTo(String toWhom) {
        for (Map.Entry<String, Double> owner : loan.entrySet()) {
            if (owner.getKey().contains(toWhom)) {
return owner.getValue();
            }
        }
return 0;
    }
}
