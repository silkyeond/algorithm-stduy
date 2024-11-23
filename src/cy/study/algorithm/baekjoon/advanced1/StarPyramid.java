package cy.study.algorithm.baekjoon.advanced1;

import java.io.*;

public class StarPyramid {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int n = Integer.parseInt(br.readLine());
    int l = 2 * n - 1;
    for (int i = 1; i < l + 1; i = i + 2) {
      bw.write(" ".repeat((l - i) / 2) + "*".repeat(i) + "\n");
      //      System.out.println(" ".repeat((l - i)/2) + "*".repeat(i));
    }
    for (int i = l - 2; i > 0; i = i - 2) {
      bw.write(" ".repeat((l - i) / 2) + "*".repeat(i) + "\n");
      //      System.out.println(" ".repeat((l-i)/2) + "*".repeat(i));
    }

    br.close();
    bw.flush();
    bw.close();
  }
}
