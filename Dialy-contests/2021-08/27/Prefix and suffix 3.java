import java.util.Scanner;

class PrefixAndSuffix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int s_len = s.length();
        int count = 0;
        if (s_len > 1) {
            int suf_start = (s_len + 1) / 2;
            while (suf_start < s_len) {
                if (s.charAt(suf_start) == s.charAt(count)) {
                    count++;
                    suf_start++;
                } else {
                    suf_start = suf_start - count + 1;
                    count = 0;
                }
            }
        }
        System.out.println(count);
        sc.close();
    }
}