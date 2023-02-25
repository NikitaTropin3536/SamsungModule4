import java.util.ArrayList;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            arrayList.add(sc.nextInt());
        }

        int s = 0;
        for (int i = 0; i < N - 1; i++) {
            if (arrayList.get(i + 1)> arrayList.get(i)) {
                s++;
            }
        }

        System.out.println(s);
    }
}