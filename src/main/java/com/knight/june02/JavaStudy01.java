package com.knight.june02;

/*
 박강락
 */
public class JavaStudy01 {

    public static void main(String[] args) {
        System.out.println("[구구단 출력]");
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                System.out.print(String.format("%02d x %02d = %02d    ", j, i, i * j));
            }
            System.out.println();
        }
    }
}
