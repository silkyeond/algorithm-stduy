package cy.study.algorithm.baekjoon.loops;

import java.util.Scanner;

public class PurchaseReceipt {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int X = sc.nextInt(); // 구매한 물건의 총 금액
    int N = sc.nextInt(); // 구매한 물건의 종류의 수

    int sum = 0;
    for (int i = 0; i < N; i++) {
      int a = sc.nextInt();
      int b = sc.nextInt();

      sum += a * b;
    }

    if (sum == X) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
  }
}
