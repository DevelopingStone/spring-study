package com.knight.homework;


public class Main {

  public static void main(String[] args) {
    Solution user = new Solution();
//    int[][] array = {{1, 1, 1, 1, 1}, {1, 1, 1, 1, 1}, {1, 1, 1, 1, 1}, {1, 1, 1, 1, 1},
//        {1, 1, 1, 1, 1}};
    int[][] array = {{1, 4}, {9, 2}, {3, 8}, {-5, 10}};
    int[] value = {3, 3, 3, 2, 2, 2};
    String[] players = {"19", "67", "67"};
    int[][] num = {{5, 10}, {1, 8}, {0, 2}, {0, 3}, {2, 5}, {2, 6}, {10, 12}, {7, 12}};
    int[] food = {1, 3, 4, 6};
    System.out.println(user.solution(food));
  }
}

/*
class Solution {

  public int solution(int[][] lines) {
    Map<Integer, Integer> map = new HashMap<>();

    for (int i = 0; i < lines.length; i++) {
      int min = Math.min(lines[i][0], lines[i][1]);
      System.out.println("min = " + min);
      int max = Math.max(lines[i][0], lines[i][1]);
      System.out.println("max = " + max);


      for(int j=min; j<max; j++){
        int value = map.getOrDefault(j,0);
        map.put(j,value+1);

      }




    }
    System.out.println("map = " + map);

    int answer = 0;
    for(Map.Entry<Integer,Integer> entry : map.entrySet()){
      if(entry.getValue()>=2){
        answer++;
      }
    }




    return answer;
  }
}*/
/*class Solution {
  int a = 0;
  int b = 0;
  public int solution(int[][] dots) {
    System.out.println(dots.length);
    System.out.println(dots[0].length);
    for (int i = 0; i <dots.length ; i++) {
      for (int j = i+1; j <dots[i].length ; j++) {
        int a = dots[i][j] - dots[i][i];
        int b = dots[j][j] - dots[i][j];



      }
    }



    return 0;
  }
}*/


class Solution {

  public String solution(int[] food) {
    StringBuilder sb = new StringBuilder();

    for (int i = 1; i < food.length; i++) {
      if (food[i] / 2 >= 1) {
        int a = food[i] / 2;
        while (a > 0) {
          sb.append(i);
          a--;
        }
      }
    }
    sb.append(0);
    for (int i = food.length - 1; i >= 1; i--) {
      if (food[i] / 2 >= 1) {
        int a = food[i] / 2;
        while (a > 0) {
          sb.append(i);
          a--;
        }
      }
    }

    return sb.toString();
  }
}