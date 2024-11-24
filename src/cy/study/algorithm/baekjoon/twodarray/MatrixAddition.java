package cy.study.algorithm.baekjoon.twodarray;

import java.io.*;
import java.util.*;

public class MatrixAddition {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer st = new StringTokenizer(br.readLine());

    int n = Integer.parseInt(st.nextToken());
    int m = Integer.parseInt(st.nextToken());
    int[][] arrN = new int[n][m];
    int[][] arrM = new int[n][m];
    for (int i = 0; i < n; i++) {
      st = new StringTokenizer(br.readLine());
      for (int j = 0; j < m; j++) {
        arrN[i][j] = Integer.parseInt(st.nextToken());
      }
    }
    for (int i = 0; i < n; i++) {
      st = new StringTokenizer(br.readLine());
      for (int j = 0; j < m; j++) {
        arrM[i][j] = Integer.parseInt(st.nextToken()) + arrN[i][j];
      }
    }

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        bw.write(arrM[i][j] + " ");
      }
      bw.write("\n");
    }
    br.close();
    bw.flush();
    bw.close();
  }
}
