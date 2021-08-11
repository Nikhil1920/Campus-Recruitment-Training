import java.util.Scanner;

class Watch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sec = sc.nextInt();
        int hour = sec / 3600;
        int minute = (sec - 3600 * hour) / 60;
        sec = sec % 60;
        System.out.println(hour + ":" + minute + ":" + sec);
        sc.close();
    }
}