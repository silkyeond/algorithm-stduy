package cy.study.algorithm.baekjoon.calculatorio;

import java.util.Scanner;

public class SumOfThree {
  public static void main(String[] args) {
    // 문제에서 A, B, C (1 ≤ A, B, C ≤ 10^12)
    // int 타입은 대략 10^9까지라고 보면 됨.
    // 따라서 10^10 이상의 수를 받으려면 long 타입으로 받아야 함.
    Scanner sc = new Scanner(System.in);
    long A = sc.nextLong();
    long B = sc.nextLong();
    long C = sc.nextLong();
    System.out.println(A + B + C);
  }
}
