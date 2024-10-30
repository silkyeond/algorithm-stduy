package cy.study.algorithm.baekjoon.conditionals;

import java.util.Scanner;

public class TripleDice {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    if (a == b && b == c) {
      System.out.println(10000 + a * 1000);
    } else if (a == b) {
      System.out.println(1000 + b * 100);
    } else if (a == c) {
      System.out.println(1000 + c * 100);
    } else if (c == b) {
      System.out.println(1000 + c * 100);
    } else {
      int ABMax = Math.max(a, b);
      int max = Math.max(ABMax, c);
      System.out.println(max * 100);
    }
  }
}
