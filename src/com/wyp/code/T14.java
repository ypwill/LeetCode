package com.wyp.code;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**在一行中输出能够组成的最小的数。
 * @author WYP
 * @date 2021-04-21 22:00
 */
public class T14 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        int[] num = new int[s.length];
        int[] check = new int[10];
        int[] rs = new int[10];
        String a;
        for (int i=0;i<s.length;i++) {
            num[i] = Integer.parseInt(s[i]);
            check[num[i]]++;
        }

    }
}
