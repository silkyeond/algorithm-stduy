package cy.study.algorithm.baekjoon.twodarray;

import java.io.*;
import java.util.*;

public class ColumnReader {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    int max = 0;

    char[][] arr = new char[5][15];
    for (int i = 0; i < arr.length; i++) {
      String str = br.readLine();
      if (max < str.length()) {
        max = str.length();
      }
      for (int j = 0; j < str.length(); j++) {
        arr[i][j] = str.charAt(j);
      }
    }

    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < max; i++) {
      for (int j = 0; j < arr.length; j++) {
        if (arr[j][i] == 0) continue;
        sb.append(arr[j][i]);
      }
    }
    bw.write(sb + "\n");

    br.close();
    bw.flush();
    bw.close();
  }
}
