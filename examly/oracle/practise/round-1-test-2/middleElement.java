import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        int mid = n / 2;
        if (n % 2 == 0) {
            System.out.println(arr[mid - 1] + " " + arr[mid]);
        } else {
            System.out.println(arr[mid]);
        }

        sc.close();
    }
}