package cy.study.algorithm.baekjoon.loops;

import java.io.*;

public class StarPrinter1 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int n = Integer.parseInt(br.readLine());
    for (int i = 0; i < n; i++) {
      bw.write("*".repeat(i + 1) + "\n");
    }

    br.close();
    bw.flush();
    bw.close();
  }
}
