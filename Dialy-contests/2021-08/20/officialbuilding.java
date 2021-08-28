import java.util.Scanner;

class officialBuilding {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int table[][][] = new int[4][3][10];

        for (int a = 0; a < 4; a++) {
            for (int b = 0; b < 3; b++) {
                for (int c = 0; c < 10; c++)
                    table[a][b][c] = 0;
            }
        }

        int num_of_cases = sc.nextInt();
        while (num_of_cases > 0) {
            int b = sc.nextInt();
            int f = sc.nextInt();
            int r = sc.nextInt();
            int v = sc.nextInt();
            table[b - 1][f - 1][r - 1] += v;
            num_of_cases--;
        }
        print(table[0]);
        for (int i = 1; i <= 3; i++) {
            System.out.printf("####################\n");
            print(table[i]);
        }
        sc.close();
    }

    private static void print(int house[][]) {

        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 10; col++) {
                System.out.printf(" %d", house[row][col]);
            }
            System.out.printf("\n");
        }
    }
}