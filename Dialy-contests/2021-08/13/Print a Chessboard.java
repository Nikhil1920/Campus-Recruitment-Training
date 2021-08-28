import java.util.Scanner;

class PrintAChessboard {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int h = sc.nextInt();
            int w = sc.nextInt();
            if (w == 0 || h == 0)
                continue;
            boolean isHash = true;
            for (int i = 1; i <= h; i++) {
                if (i % 2 == 1)
                    isHash = true;
                else
                    isHash = false;
                for (int j = 1; j <= w; j++) {
                    System.out.print(isHash ? "#" : ".");
                    isHash = !isHash;
                }
                System.out.println();
            }
            System.out.println();
        }
        sc.close();
    }
}