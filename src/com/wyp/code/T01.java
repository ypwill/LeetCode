package com.wyp.code;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * @author WYP
 * @date 2021-04-04 10:30
 */
public class T01 {
    public static void main(String[] args) throws IOException {
        Scanner s = new Scanner(System.in);
        int d = s.nextInt();
        String[] str = new String[d];

        for (int i = 0; i < d; i++) {

            long a = s.nextLong();
            long b = s.nextLong();
            long c = s.nextLong();
            if (a + b > c) {
                str[i] = "true";
            } else {
                str[i] = "false";
            }
        }
        for (int j = 0; j < d; j++) {
            System.out.println("Case #" + (j + 1) + ": " + str[j]);
        }
    }
}
