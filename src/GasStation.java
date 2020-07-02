/**
 * Created on 2020/7/2 8:49 AM
 *
 * @author zzkyeee
 */
public class GasStation {

    public int canCompleteCircuit(int[] gas, int[] cost) {
        int total = 0, currentTotal = 0, startIndex = 0;
        for (int i = 0; i < gas.length; i++) {
            int temp = gas[i] - cost[i];
            total += temp;
            currentTotal += temp;

            if (currentTotal < 0) {
                startIndex = i + 1;
                currentTotal = 0;
            }
        }

        return total >= 0 ? startIndex : -1;
    }

    public static void main(String[] args) {
        GasStation gasStation = new GasStation();
        System.out.println(gasStation.canCompleteCircuit(new int[]{1, 2, 3, 4, 5}, new int[]{3, 4, 5, 1, 2}));
    }

}
