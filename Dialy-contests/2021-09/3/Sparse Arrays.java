
// SparseArrays
import java.util.Scanner;

class SparseArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String[] array = new String[n];
        for (int i = 0; i < n; i++)
            array[i] = sc.nextLine();
        int m = sc.nextInt();
        sc.nextLine();
        String[] queries = new String[m];
        for (int i = 0; i < m; i++)
            queries[i] = sc.nextLine();

        for (int i = 0; i < m; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (queries[i].equals(array[j]))
                    count++;
            }
            System.out.println(count);
        }
        sc.close();
    }
}