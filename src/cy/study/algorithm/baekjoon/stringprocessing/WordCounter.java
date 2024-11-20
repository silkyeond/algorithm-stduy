package cy.study.algorithm.baekjoon.stringprocessing;

import java.io.*;
import java.util.*;

public class WordCounter {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    String str = br.readLine().trim();
    if (str.isEmpty()) {
      bw.write(0 + "\n");
    } else {
      String[] strArr = str.split(" ");
      bw.write(strArr.length + "\n");
    }
    br.close();
    bw.flush();
    bw.close();
  }
}
