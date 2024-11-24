package cy.study.algorithm.baekjoon.twodarray;

import java.io.*;
import java.util.*;

public class MaxValueFinder {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int[][] arr = new int[9][9];
    int maxValue = 0;
    int n = 1;
    int m = 1;
    for (int i = 0; i < 9; i++) {
      StringTokenizer st = new StringTokenizer(br.readLine());
      for (int j = 0; j < 9; j++) {
        arr[i][j] = Integer.parseInt(st.nextToken());
      }
    }

    for (int i = 0; i < 9; i++) {
      for (int j = 0; j < 9; j++) {
        if (maxValue < arr[i][j]) {
          maxValue = arr[i][j];
          n = i + 1;
          m = j + 1;
        }
      }
    }

    bw.write(maxValue + "\n");
    bw.write(n + " " + m + "\n");

    br.close();
    bw.flush();
    bw.close();
  }
}
