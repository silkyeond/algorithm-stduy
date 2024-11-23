package cy.study.algorithm.baekjoon.advanced1;

import java.io.*;

public class PalindromeChecker {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    String word = br.readLine();
    StringBuilder sb = new StringBuilder();
    for (int i = word.length(); i > 0; i--) {
      sb.append(word.charAt(i - 1));
    }
    if (word.equals(sb.toString())) {
      bw.write(1 + "\n");
    } else {
      bw.write(0 + "\n");
    }
    br.close();
    bw.flush();
    bw.close();
  }
}
