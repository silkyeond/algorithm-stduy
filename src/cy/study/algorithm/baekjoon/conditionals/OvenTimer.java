package cy.study.algorithm.baekjoon.conditionals;

import java.util.Scanner;

public class OvenTimer {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int A = sc.nextInt();
    int B = sc.nextInt();
    int C = sc.nextInt();

    int min = B + C;
    int hour = 0;

    if (min < 60) {
      System.out.println(A + " " + min);
    } else if (min >= 60) {
      hour = min / 60;
      min = min % 60;
      if (A + hour > 23) {
        hour = A + hour - 24;
        System.out.println(hour + " " + min);
      } else {
        System.out.println(A + hour + " " + min);
      }
    }
  }
}
