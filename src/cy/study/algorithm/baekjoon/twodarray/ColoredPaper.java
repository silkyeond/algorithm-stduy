package cy.study.algorithm.baekjoon.twodarray;

import java.io.*;
import java.util.*;

public class ColoredPaper {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int n = Integer.parseInt(br.readLine());
    int[][] paper = new int[100][100];

    StringTokenizer st;
    for (int i = 0; i < n; i++) {
      st = new StringTokenizer(br.readLine());
      int x = Integer.parseInt(st.nextToken());
      int y = Integer.parseInt(st.nextToken());
      for (int j = x; j < x + 10; j++) {
        for (int k = y; k < y + 10; k++) {
          paper[j][k] = 1;
        }
      }
    }

    int result = 0;
    for (int i = 0; i < paper.length; i++) {
      for (int j = 0; j < paper.length; j++) {
        if (paper[i][j] == 1) {
          result += paper[i][j];
        }
      }
    }
    bw.write(paper.length + "\n");
    bw.write(result + "\n");

    br.close();
    bw.flush();
    bw.close();
  }
}
