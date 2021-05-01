package com.wyp.code;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**输入两个非负10进制整数A和B(<=230-1)，输出A+B的D (1 < D <= 10)进制数。
 * @author WYP
 * @date 2021-04-21 21:20
 */
public class T13 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        int A = Integer.parseInt(s[0]);
        int B = Integer.parseInt(s[1]);
        int D = Integer.parseInt(s[2]);
        int sum = A + B;
        int[] y = new int[10];
        int j = 0;
        while (sum>D){
            int i = sum % D;
            sum = (sum-i)/D;
            y[j] = i;
            //System.out.println(i);
            j++;
        }
        //System.out.println(sum);
        y[j]=sum;
        for (int i=j;i>=0;i--){
            System.out.print(y[i]);
        }

    }
}
