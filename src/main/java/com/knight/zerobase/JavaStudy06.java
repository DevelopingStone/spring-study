package com.knight.zerobase;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

public class JavaStudy06 {

  public static void main(String[] args) {
    Random vote = new Random();
    HashMap<Integer, String> name = new HashMap<>();
    name.put(1, "이재명");
    name.put(2, "윤석열");
    name.put(3, "심상정");
    name.put(4, "안철수");
    int one = 0;
    int two = 0;
    int three = 0;
    int four = 0;
    int result = 0;

    for (int i = 1; i <= 100000; i++) {
      int num = vote.nextInt(4) + 1;
      if (num == 1) {
        one++;
      }
      if (num == 2) {
        two++;
      }
      if (num == 3) {
        three++;
      }
      if (num == 4) {
        four++;
      }
      System.out.println();
      System.out.println("[투표진행율] : " + String.format("%.2f", ((double) i / 1000)) + "%, " + i + "명 투표 => "+ name.get(num));
      System.out.printf("[기호:1] 이재명: %.2f%%,  (투표수: %d)\n", ((double) one / 100000) * 100, one);
      System.out.printf("[기호:2] 윤석열: %.2f%%,  (투표수: %d)\n", ((double) two / 100000) * 100, two);
      System.out.printf("[기호:3] 심상정: %.2f%%,  (투표수: %d)\n", ((double) three / 100000) * 100, three);
      System.out.printf("[기호:4] 안철수: %.2f%%,  (투표수: %d)\n", ((double) four / 100000) * 100, four);


    }

    List<Integer> list = new ArrayList<>(Arrays.asList(one, two, three, four));
    for (int i = 0; i < list.size(); i++) {
      if (list.get(i) > list.get(result)) {
        result = i;
      }
    }

    System.out.println("[투표결과] 당선인 : " + name.get(result + 1));


  }

}
