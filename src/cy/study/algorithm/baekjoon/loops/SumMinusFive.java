package cy.study.algorithm.baekjoon.loops;

import java.io.*;

public class SumMinusFive {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    while (true) {
      String str = br.readLine();
      int a = Integer.parseInt(str.split(" ")[0]);
      int b = Integer.parseInt(str.split(" ")[1]);

      if (a == 0 && b == 0) {
        break;
      }
      bw.write((a + b) + "\n");
    }

    br.close();
    bw.flush();
    bw.close();
  }
}
