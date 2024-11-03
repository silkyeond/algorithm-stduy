package cy.study.algorithm.baekjoon.onedarray;

import java.io.*;
import java.util.*;

public class RemainderSetCalculator {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    HashSet<Integer> hs = new HashSet<Integer>();

    for (int i = 0; i < 10; i++){
      int n = Integer.parseInt(br.readLine());
      hs.add(n % 42);
    }

    bw.write(hs.size() + "\n");

    br.close();
    bw.flush();
    bw.close();
  }

}
