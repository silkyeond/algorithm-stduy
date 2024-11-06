package cy.study.algorithm.baekjoon.onedarray;

import java.io.*;
import java.util.*;

public class Counter {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int n = Integer.parseInt(br.readLine());

    int[] arr = new int[n];

    StringTokenizer st = new StringTokenizer(br.readLine());
    for (int i = 0; i < arr.length; i++) {
      arr[i] = Integer.parseInt(st.nextToken());
    }

    int a = Integer.parseInt(br.readLine());
    int v = 0;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == a) {
        v++;
      }
    }

    bw.write(v + "\n");

    br.close();
    bw.flush();
    bw.close();
  }
}
