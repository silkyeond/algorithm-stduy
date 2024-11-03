package cy.study.algorithm.baekjoon.onedarray;

import java.io.*;
import java.util.*;

public class BasketExchange {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    StringTokenizer st = new StringTokenizer(br.readLine());
    int N = Integer.parseInt(st.nextToken());
    int M = Integer.parseInt(st.nextToken());

    int[] arr = new int[N];
    for (int k = 0; k < arr.length; k++) {
      arr[k] = k + 1;
    }

    for (int k = 0; k < M; k++) {
      st = new StringTokenizer(br.readLine());
      int i = Integer.parseInt(st.nextToken()) - 1;
      int j = Integer.parseInt(st.nextToken()) - 1;
      int temp = 0;

      while (i < j) {
        temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        i++;
        j--;
      }
    }
    for (int num : arr) {
      bw.write(num + " ");
    }
    br.close();
    bw.flush();
    bw.close();
  }
}
