package cy.study.algorithm.baekjoon.stringprocessing;

import java.io.*;
import java.util.*;

public class Constant {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    StringTokenizer st = new StringTokenizer(br.readLine());
    String a = st.nextToken();
    String b = st.nextToken();

    StringBuilder bfA = new StringBuilder();
    StringBuilder bfB = new StringBuilder();

    for (int i = a.length(); i > 0; i--) {
      bfA.append(a.charAt(i - 1));
    }
    for (int i = b.length(); i > 0; i--) {
      bfB.append(b.charAt(i - 1));
    }
    bw.write(
        Math.max(Integer.parseInt(String.valueOf(bfA)), Integer.parseInt(String.valueOf(bfB)))
            + "\n");

    br.close();
    bw.flush();
    bw.close();
  }
}
