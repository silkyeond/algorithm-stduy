package cy.study.algorithm.baekjoon.onedarray;

import java.io.*;
import java.util.*;

public class LessThanX {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    StringTokenizer st = new StringTokenizer(br.readLine());
    int n = Integer.parseInt(st.nextToken());
    int x = Integer.parseInt(st.nextToken());

    int[] arr = new int[n];
    String strings = "";
    StringTokenizer numbers = new StringTokenizer(br.readLine());
    for (int i = 0; i < arr.length; i++) {
      arr[i] = Integer.parseInt(numbers.nextToken());
      if (x > arr[i]) {
        strings = strings + arr[i] + " ";
      }
    }
    bw.write(strings + "\n");

    br.close();
    bw.flush();
    bw.close();
  }
}
