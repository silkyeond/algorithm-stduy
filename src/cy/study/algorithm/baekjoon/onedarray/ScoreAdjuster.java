package cy.study.algorithm.baekjoon.onedarray;

import java.io.*;
import java.util.*;

public class ScoreAdjuster {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int n = Integer.parseInt(br.readLine());
    StringTokenizer st = new StringTokenizer(br.readLine());

    double sum = 0;
    double max = 0;
    double[] scores = new double[n];
    for (int i = 0; i < scores.length; i++) {
      scores[i] = Double.parseDouble(st.nextToken());
      if (scores[i] > max) {
        max = scores[i];
      }
    }

    for (int i = 0; i < scores.length; i++) {
      scores[i] = (scores[i] / max) * 100;
      sum = sum + scores[i];
    }

    bw.write(sum / n + "\n");

    br.close();
    bw.flush();
    bw.close();
  }
}
