import java.util.Scanner;

public class Homework4 {
    int gcd(int a, int b) {
        if (b == 0) return a;
        if (a == b) return a;
        else if (a > b) return gcd(b, a%b);
        else return gcd(a, b%a);
    }
    public static void main(String[] args) {
        System.out.print("두 수를 입력하세요: ");
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        Homework4 h = new Homework4();
        int result = h.gcd(m, n);
        System.out.printf("두 수의 최대공약수는 %d입니다.", result);
    }
}
