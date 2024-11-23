package cy.study.algorithm.baekjoon.advanced1;

import java.io.*;
import java.util.*;

// 전공평점 = (학점 * 과목평점) / 학점의 총합
public class GradeCalculator {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    double grades = 0;
    double scores = 0;
    for (int i = 0; i < 20; i++) {
      StringTokenizer st = new StringTokenizer(br.readLine());
      st.nextToken();
      double grade = Double.parseDouble(st.nextToken());
      String score = st.nextToken();
      if (score.equals("P")) {
        continue;
      }
      grades += grade;
      scores += scoreDouble(score) * grade;
    }
    double result = scores / grades;
    bw.write(result + "\n");
    br.close();
    bw.flush();
    bw.close();
  }

  private static double scoreDouble(String score) {
    switch (score) {
      case "A+":
        return 4.5;
      case "A0":
        return 4.0;
      case "B+":
        return 3.5;
      case "B0":
        return 3.0;
      case "C+":
        return 2.5;
      case "C0":
        return 2.0;
      case "D+":
        return 1.5;
      case "D0":
        return 1.0;
      case "F":
        return 0;
      default:
        break;
    }
    return 0;
  }
}
