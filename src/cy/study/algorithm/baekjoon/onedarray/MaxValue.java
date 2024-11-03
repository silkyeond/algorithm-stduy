package cy.study.algorithm.baekjoon.onedarray;

import java.io.*;
import java.util.*;

public class MaxValue {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int[] numbers = new int[9];
    for (int i = 0; i < numbers.length; i++) {
      numbers[i] = Integer.parseInt(br.readLine());
    }
    int max = numbers[0];
    int a = 1;
    for (int i = 1; i < numbers.length; i++) {
      if (max < numbers[i]) {
        max = numbers[i];
        a = i + 1;
      }
    }
    bw.write(max + "\n" + a);


    br.close();
    bw.flush();
    bw.close();
  }
}
