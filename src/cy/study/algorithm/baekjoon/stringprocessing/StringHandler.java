package cy.study.algorithm.baekjoon.stringprocessing;

import java.io.*;
import java.util.*;

public class StringHandler {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int t = Integer.parseInt(br.readLine());

    for (int i = 0; i < t; i++) {
      String str = br.readLine();
      int lastIndex = str.length() - 1;
      bw.write(str.charAt(0) + "" + str.charAt(lastIndex) + "\n");
    }
    br.close();
    bw.flush();
    bw.close();
  }
}
