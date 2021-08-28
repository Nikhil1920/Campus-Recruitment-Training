import java.util.Scanner;

class LeftRotation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int rotate = sc.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }
        for (int i = 0; i < rotate; i++) {
            int first_digit = array[0];
            int j;
            for (j = 1; j < size; j++) {
                array[j - 1] = array[j];
            }
            array[size - 1] = first_digit;
        }
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
        sc.close();
    }
}