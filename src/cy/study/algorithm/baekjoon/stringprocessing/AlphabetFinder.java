package cy.study.algorithm.baekjoon.stringprocessing;

import java.io.*;
import java.util.*;

public class AlphabetFinder {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    String str = br.readLine();

    int[] arr = new int[26];

    for (int i = 0; i < arr.length; i++) {
      arr[i] = -1;
    }
    for (int i = 0; i < str.length(); i++) {
      char ch = str.charAt(i);

      if (arr[ch - 'a'] == -1) {
        arr[ch - 'a'] = i;
      }
    }

    for (int num : arr) bw.write(num + " ");

    br.close();
    bw.flush();
    bw.close();
  }
}
