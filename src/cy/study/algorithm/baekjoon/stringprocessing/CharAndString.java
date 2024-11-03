package cy.study.algorithm.baekjoon.stringprocessing;

import java.util.*;
import java.io.*;

public class CharAndString {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    String str = br.readLine();
    int i = Integer.parseInt(br.readLine()) -1;

    bw.write(str.charAt(i) + "\n");

    br.close();
    bw.flush();
    bw.close();
  }
}
