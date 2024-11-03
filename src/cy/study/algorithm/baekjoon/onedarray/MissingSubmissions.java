package cy.study.algorithm.baekjoon.onedarray;

import java.io.*;
import java.util.*;

public class MissingSubmissions {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    int[] students = new int[30];

    for (int i = 0; i < 28; i++) {
      int n = Integer.parseInt(br.readLine());
      students[n - 1] = 1;
    }
    for (int i = 0; i < students.length; i++) {
      if (students[i] != 1) {
        bw.write(i + 1 + "\n");
      }
    }

    br.close();
    bw.flush();
    bw.close();
  }
}
