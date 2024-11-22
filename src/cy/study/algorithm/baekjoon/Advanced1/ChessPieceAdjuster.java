package cy.study.algorithm.baekjoon.Advanced1;

import java.io.*;
import java.util.*;

public class ChessPieceAdjuster {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    StringTokenizer st = new StringTokenizer(br.readLine());

    int kCount = 1 - Integer.parseInt(st.nextToken());
    int qCount = 1 - Integer.parseInt(st.nextToken());
    int lCount = 2 - Integer.parseInt(st.nextToken());
    int bCount = 2 - Integer.parseInt(st.nextToken());
    int nCount = 2 - Integer.parseInt(st.nextToken());
    int pCount = 8 - Integer.parseInt(st.nextToken());

    bw.write(
        kCount + " " + qCount + " " + lCount + " " + bCount + " " + nCount + " " + pCount + "\n");

    br.close();
    bw.flush();
    bw.close();

    //      int[] pieces = {1, 1, 2, 2, 2, 8};
    //
    //      StringTokenizer st = new StringTokenizer(br.readLine());
    //      StringBuilder sb = new StringBuilder();
    //
    //      for (int i = 0; i < 6; i++) {
    //          sb.append(pieces[i] - Integer.parseInt(st.nextToken())).append(" ");
    //      }
    //      System.out.println(sb);

  }
}
