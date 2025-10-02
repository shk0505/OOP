import java.util.Scanner;

public class Homework3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("몇 개의 수를 입력할 예정인가요? ");
        int n = sc.nextInt();
        int num[] = new int[n];
        System.out.print("수를 입력하세요: ");
        for (int i = 0; i<n; i++) num[i] = sc.nextInt();
        int max = num[0];
        int min = num[0];
        for (int j = 1; j<n; j++) {
            if (max < num[j]) max = num[j];
            if (min > num[j]) min = num[j];
        }
        System.out.printf("최대값: %d\n", max);
        System.out.printf("최소값: %d", min);
    }
}
