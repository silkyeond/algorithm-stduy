package cy.study.algorithm.baekjoon.loops;

import java.io.*;

public class SumMinusEight {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int T = Integer.parseInt(br.readLine());

    for (int i = 0; i < T; i++) {
      String str = br.readLine();
      int a = Integer.parseInt(str.split(" ")[0]);
      int b = Integer.parseInt(str.split(" ")[1]);

      bw.write("Case #" + (i + 1) + ": " + a + " + " + b + " = " + (a + b) + "\n");
    }
    br.close();
    bw.flush();
    bw.close();
  }
}
