import java.util.*;

class JesseAndCookies {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long k = sc.nextLong();
        PriorityQueue<Integer> qu = new PriorityQueue<Integer>();
        for (int i = 0; i < n; i++)
            qu.add(sc.nextInt());

        int count = 0;
        while (qu.size() > 1 && qu.peek() < k) {
            int least = qu.poll();
            int sec = qu.poll();
            int num = least + sec * 2;
            qu.add(num);
            count++;
        }

        System.out.println((qu.size() > 0 && qu.peek() >= k) ? count : -1);
        sc.close();
    }
}