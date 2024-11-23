package cy.study.algorithm.baekjoon.advanced1;

import java.io.*;

public class CroatianAlphabetCounter {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    String str = br.readLine();
    String[] croatias = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
    for (int i = 0; i < croatias.length; i++) {
      if (str.contains(croatias[i])) {
        str = str.replace(croatias[i], "!");
      }
    }
    bw.write(str.length() + "\n");
    br.close();
    bw.flush();
    bw.close();
  }
}
