import java.util.ArrayList;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        ArrayList<Integer> arrayList1 = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            arrayList1.add(sc.nextInt());
        }

        ArrayList<Integer> arrayList2 = new ArrayList<>();

        int temp = arrayList1.get(N - 1);

        arrayList2.add(temp);

        for (int i = 0; i < N - 1; i++) {
            arrayList2.add(arrayList1.get(i));
        }

        for (int i = 0; i < N; i++) {
            arrayList1.set(i, arrayList2.get(i));
        }

        /*Костыльный код!!!!!
        Если можно сделать лучше -
        напишите мне пж*/

        for (int i = 0; i < N; i++) {
            System.out.print(arrayList1.get(i) + " ");
        }
    }
}
