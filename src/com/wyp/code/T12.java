package com.wyp.code;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *2003244
 * @author WYP
 * @date 2021-04-21 21:00
 */
public class T12 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String str = bufferedReader.readLine();
        int[] check = new int[10];

        for (int i = 0; i < str.length(); i++){
            int temp = str.charAt(i) - '0';
            check[temp]++;
        }

        for (int i = 0; i < 10; i++) {
            if (check[i] != 0)
                System.out.println(i + ":" + check[i]);
        }
        bufferedReader.close();
    }


}
