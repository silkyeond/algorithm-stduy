package cy.study.algorithm.baekjoon.onedarray;

import java.util.*;
import java.io.*;

public class BallReplacer {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    StringTokenizer st = new StringTokenizer(br.readLine());

    int N = Integer.parseInt(st.nextToken());
    int M = Integer.parseInt(st.nextToken());
    int[] arr = new int[N];

    for (int i = 0; i < arr.length; i++) {
      arr[i] = i + 1;
    }

    for (int x = 0; x < M; x++) {
      st = new StringTokenizer(br.readLine());
      int i = Integer.parseInt(st.nextToken()) - 1;
      int j = Integer.parseInt(st.nextToken()) - 1;

      int temp = arr[i];
      arr[i] = arr[j];
      arr[j] = temp;
    }
    for (int i = 0; i < arr.length; i++) {
      bw.write(arr[i] + " ");
    }

    br.close();
    bw.flush();
    bw.close();
  }
}
