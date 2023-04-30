package com.knight.homework;


import java.util.HashMap;
import java.util.Map;

public class Main {

  public static void main(String[] args) {

    Solution user = new Solution();
    int[] arr = {1, 2, 2, 2, 3, 4, 4};
    System.out.println(user.solution(arr));


  }
}


class Solution {

  public int solution(int[] array) {
    Map<Integer, Integer> count = new HashMap<>(); // 숫자와 해당 숫자의 개수를 저장할 Map 생성
    int maxCount = 0; // 가장 많이 나온 숫자의 개수
    int mode = 0; // 최빈값
    for (int num : array) {
      int currentCount = count.getOrDefault(num, 0) + 1; // 현재 숫자의 개수
      count.put(num, currentCount); // Map에 현재 숫자의 개수를 저장
      if (currentCount > maxCount) { // 현재 숫자의 개수가 최대 개수보다 크다면
        maxCount = currentCount; // 최대 개수를 업데이트하고
        mode = num; // 최빈값을 업데이트함
      } else if (currentCount == maxCount) { // 현재 숫자의 개수가 최대 개수와 같다면
        mode = -1; // 최빈값을 -1로 설정함
      }
    }
    return mode;
  }

}

