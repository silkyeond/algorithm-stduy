package cy.study.algorithm.baekjoon.advanced1;

import java.io.*;

public class MaxUsedAlphabet {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    String word = br.readLine().toUpperCase();

    int alphabet[] = new int[26];

    for (int i = 0; i < word.length(); i++) {
      char ch = word.charAt(i);
      alphabet[ch - 'A']++;
    }
    int max = 0;
    char result = '?';

    for (int i = 0; i < alphabet.length; i++) {
       if (alphabet[i] > max) {
        max = alphabet[i];
        result = (char) (i + 'A');
      } else if (alphabet[i] == max) {
        result = '?';
      }
    }
    bw.write(result + "\n");

    br.close();
    bw.flush();
    bw.close();
  }
}
