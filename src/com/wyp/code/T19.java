package com.wyp.code;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 * @author WYP
 * @date 2021-04-27 23:42
 */
public class T19 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        System.out.println();
        String[] s = new String[n];
        for (int i = 0; i < n; i++) {
            s[i] = br.readLine();

        }
        int[] sum = {0,0,0,0};
        int[] sum1 = {0,0,0,0};
        int[] qz = {7, 9, 10, 5, 8, 4, 2, 1, 6, 3, 7, 9, 10, 5, 8, 4, 2};
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < s[i].length()-1; j++) {
                sum[i] = (s[i].charAt(j) - '0') * qz[j] + sum[i];
            }
            System.out.println(sum[i]);
        }
        for (int i=0;i<n;i++){
           sum1[i] = sum[i] % 11;

        }

        int pos = 0;
        int[] z = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        char[] M = {1, 0, 'x', 9, 8, 7, 6, 5, 4, 3, 2, 1};
        for (int j=0;j<n;j++){
            for (int i = 0; i < z.length; i++) {
                if (sum1[j] == z[i]) {
                    System.out.println(M[i]);
                }
            }
        }

    }
}
