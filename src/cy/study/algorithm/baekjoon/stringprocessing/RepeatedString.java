package cy.study.algorithm.baekjoon.stringprocessing;

import java.io.*;
import java.util.*;

public class RepeatedString {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int t = Integer.parseInt(br.readLine());

    for (int i = 0; i < t; i++) {
      StringTokenizer str = new StringTokenizer(br.readLine());
      StringBuffer result = new StringBuffer();
      int r = Integer.parseInt(str.nextToken());
      String s = str.nextToken();
      for (int j = 0; j < s.length(); j++) {
        String charS = String.valueOf(s.charAt(j));
        result.append(charS.repeat(r));
      }
      System.out.println(result);
    }

    br.close();
  }
}
