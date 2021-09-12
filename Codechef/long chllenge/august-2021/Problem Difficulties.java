import java.util.*;

class ProblemDiffficulties {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num_of_cases = sc.nextInt();
        while (num_of_cases > 0) {
            int[] arr = new int[4];
            for (int i = 0; i < 4; i++) {
                arr[i] = sc.nextInt();
            }
            int unique = 1;
            int count = 0;
            for (int i = 1; i < 4; i++) {
                int j = 0;
                for (j = 0; j < i; j++)
                    if (arr[i] == arr[j])
                        break;
                if (i == j)
                    unique++;
            }
            if (unique > 2)
                count = 2;
            else if (unique == 2) {
                int temp = 0;
                for (int k = 1; k < 4; k++) {
                    if (arr[0] == arr[k])
                        temp++;
                }
                if (temp == 1)
                    count = 2;
                else
                    count = 1;
            }

            System.out.println(count);
            num_of_cases--;
        }
        sc.close();
    }
}