package cy.study.algorithm.baekjoon.advanced1;

import java.io.*;

public class GroupWordChecker {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int n = Integer.parseInt(br.readLine());
    int count = 0;
    for (int i = 0; i < n; i++) {
      String word = br.readLine();
      if (check(word) == true) {
        count++;
      }
    }
    bw.write(count + "\n");
    br.close();
    bw.flush();
    bw.close();
  }

  public static boolean check(String word) {
    boolean[] check = new boolean[26];
    // 전 단어
    int prev = 0;
    for (int i = 0; i < word.length(); i++) {
      int now = word.charAt(i);

      if (prev != now) {
        if (check[now - 'a'] == false) {
          check[now - 'a'] = true;
          prev = now;
        } else {
          return false;
        }
      } else {
        continue;
      }
    }
    return true;
  }
}
