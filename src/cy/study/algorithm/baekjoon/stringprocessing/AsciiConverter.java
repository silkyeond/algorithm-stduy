package cy.study.algorithm.baekjoon.stringprocessing;

import java.util.*;
import java.io.*;

public class AsciiConverter {
    public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    String str = br.readLine();
    int code = str.charAt(0);

    bw.write(code + "\n");
    br.close();
    bw.flush();
    bw.close();
    }
}
