package cy.study.algorithm.baekjoon.loops;

import java.util.Scanner;

public class CodingIsPE {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();

    String a = "";
    for (int i = 0; i < N / 4; i++) {
      if (i % 4 == 0) {
        String LONG = "long ";
        a = a + LONG;
      }
    }
    System.out.println(a + "int");
  }
}
