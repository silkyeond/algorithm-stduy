package cy.study.algorithm.baekjoon.calculatorio;

import java.util.Scanner;

public class Multiplier {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int a = sc.nextInt();
    String b = sc.next();

    int one = Integer.parseInt(b.substring(0, 1));
    int two = Integer.parseInt(b.substring(1, 2));
    int three = Integer.parseInt(b.substring(2, 3));
    System.out.println(a * three);
    System.out.println(a * two);
    System.out.println(a * one);
    System.out.println(a * Integer.parseInt(b));
  }
}
