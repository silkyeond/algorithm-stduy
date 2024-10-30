package cy.study.algorithm.baekjoon.loops;

import java.io.*;

public class SumMinusSeven {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int T = Integer.parseInt(br.readLine());
    for (int i = 1; i < T + 1; i++) {
      String str = br.readLine();
      int a = Integer.parseInt(str.split(" ")[0]);
      int b = Integer.parseInt(str.split(" ")[1]);
      bw.write("Case #" + i + ": " + (a + b) + "\n");
    }

    br.close();
    bw.flush();
    bw.close();
  }
}
