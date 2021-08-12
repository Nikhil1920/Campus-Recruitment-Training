import java.util.Scanner;

class HasDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String num = sc.nextLine();
            String digit = sc.nextLine();
            System.out.println(num.indexOf(digit) != -1 ? "true" : "false");
        }
        sc.close();
    }
}