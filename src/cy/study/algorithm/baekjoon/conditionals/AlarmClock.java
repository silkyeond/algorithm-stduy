package cy.study.algorithm.baekjoon.conditionals;

import java.util.Scanner;

public class AlarmClock {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int H = sc.nextInt();
    int M = sc.nextInt();

    if (M >= 45 && M <= 59) {
      M -= 45;
    } else if (H == 0 && M < 45) {
      H = 23;
      M += 15;
    } else {
      H -= 1;
      M += 15;
    }
    System.out.println(H + " " + M);
  }
}
