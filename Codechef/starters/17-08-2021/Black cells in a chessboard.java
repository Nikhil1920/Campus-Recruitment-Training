import java.util.Scanner;

class BlackCellsInChessBoard {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println((num * num) / 2);
        sc.close();
    }
}