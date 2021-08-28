
// MinimumLoss
import java.util.*;

class MinimumLoss {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long arr[] = new long[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLong();
        }
        Map<Long, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], i);
        }
        Arrays.sort(arr);
        long loss = Long.MAX_VALUE;
        for (int i = arr.length - 1; i > 0; i--) {
            if (map.get(arr[i]) < map.get(arr[i - 1])) {
                loss = Math.min(arr[i] - arr[i - 1], loss);
            }
        }
        System.out.println(loss);
        sc.close();
    }
}