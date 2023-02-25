import java.util.ArrayList;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        ArrayList<Integer> arrayList1 = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            arrayList1.add(sc.nextInt());
        }

        int max = arrayList1.get(0);

        for (int i = 0; i < N; i++) {
            if (arrayList1.get(i) > max) max = arrayList1.get(i);
        }

        System.out.println(max);
    }
}