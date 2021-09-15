import java.util.Scanner;

class POSSPEW {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num_of_cases = sc.nextInt();
        while (num_of_cases-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++)
                arr[i] = sc.nextInt();
            while (k-- > 0) {
                int[] new_arr = arr.clone();
                for (int i = 0; i < n; i++) {
                    int pre = i - 1;
                    int post = i + 1;
                    if (pre < 0)
                        pre = n - 1;
                    if (post == n)
                        post = 0;

                    if (new_arr[i] > 0) {
                        arr[pre]++;
                        arr[post]++;
                    }
                }
            }
            int sum = 0;
            for (int i = 0; i < n; i++)
                sum += arr[i];
            System.out.println(sum);
        }
        sc.close();
    }
}