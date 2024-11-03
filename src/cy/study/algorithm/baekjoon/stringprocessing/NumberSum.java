package cy.study.algorithm.baekjoon.stringprocessing;

import java.io.*;
import java.util.*;

public class NumberSum {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int n = Integer.parseInt(br.readLine());
    String numbers = br.readLine();

    int sum = 0;
    for (int i = 0; i < n; i++) {
      int number = Integer.parseInt(String.valueOf(numbers.charAt(i)));
      sum += number;
    }

    bw.write(sum + "\n");

    br.close();
    bw.flush();
    bw.close();
  }
}
