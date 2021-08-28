import java.util.Scanner;

class TimeConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String format12 = sc.nextLine();
        String format24 = "hi";
        boolean isAm = true;
        if (format12.charAt(8) == 'P')
            isAm = false;

        if (isAm) {
            String hour;
            if (format12.substring(0, 2).equals("12")) {
                hour = "00";
                format24 = hour + format12.substring(2, 8);
            } else
                format24 = format12.substring(0, 8);
        } else {
            if (format12.substring(0, 2).equals("12")) {
                format24 = format12.substring(0, 8);
            } else {
                int hour = Integer.parseInt(format12.substring(0, 2));
                hour += 12;
                format24 = hour + format12.substring(2, 8);
            }
        }
        System.out.println(format24);
        sc.close();
    }
}