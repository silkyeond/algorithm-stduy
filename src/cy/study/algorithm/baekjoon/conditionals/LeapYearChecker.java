package cy.study.algorithm.baekjoon.conditionals;

import java.util.Scanner;

public class LeapYearChecker {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int year = sc.nextInt();

    int a = year % 4;
    int b = year % 100;
    int c = year % 400;
    if (a == 0 && b != 0 || c == 0) {
      System.out.println(1);
    } else {
      System.out.println(0);
    }
  }
}
