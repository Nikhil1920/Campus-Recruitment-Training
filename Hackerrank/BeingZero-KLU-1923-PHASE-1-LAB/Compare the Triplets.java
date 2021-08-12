import java.util.Scanner;

class CompareTheTriplets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[3];
        int[] b = new int[3];
        int a_points = 0;
        int b_points = 0;
        for (int i = 0; i < 3; i++)
            a[i] = sc.nextInt();

        for (int i = 0; i < 3; i++)
            b[i] = sc.nextInt();

        for (int i = 0; i < 3; i++) {
            if (a[i] < b[i])
                b_points++;
            else if (a[i] > b[i])
                a_points++;
        }
        System.out.println(a_points + " " + b_points);
        sc.close();
    }
}