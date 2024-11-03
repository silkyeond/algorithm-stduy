package cy.study.algorithm.baekjoon.stringprocessing;

import java.io.*;
import java.util.*;

public class WordLength {
    public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    String str = br.readLine();

    bw.write(str.length() + 1 + "\n");

    br.close();
    bw.flush();
    bw.close();
    }
}
