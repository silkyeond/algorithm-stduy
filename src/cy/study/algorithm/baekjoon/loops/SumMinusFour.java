package cy.study.algorithm.baekjoon.loops;

import java.io.*;

public class SumMinusFour {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    String str;
    while ((str = br.readLine()) != null) {
      int a = Integer.parseInt(str.split(" ")[0]);
      int b = Integer.parseInt(str.split(" ")[1]);

      bw.write((a + b) + "\n");
    }

    br.close();
    bw.flush();
    bw.close();
  }
}
