package com.wyp.code;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 正整数A的“DA（为1位整数）部分”定义为由A中所有DA组成的新整数PA。例如：
 * 给定A = 3862767，DA = 6，则A的“6部分”PA是66，因为A中有2个6。
 *
 *  现给定A、DA、B、DB，请编写程序计算PA + PB。
 *
 */
public class T07 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        char[] c0 = s[0].toCharArray();
        char[] c1 = s[1].toCharArray();
        char[] c2 = s[2].toCharArray();
        char[] c3 = s[3].toCharArray();
        int m=0,n=0;
        for (int i=0;i<c0.length;i++){
            if(c0[i] == c1[0]){
                m++;
            }
        }
        for (int i=0;i<c2.length;i++){
            if(c2[i] == c3[0]){
                n++;
            }
        }
        int A = Integer.parseInt(String.valueOf(c1[0]));
        int B = Integer.parseInt(String.valueOf(c3[0]));

        double PA=0,PB=0;
        for (int i=0;i<m;i++){
            PA = A*Math.pow(10,i)+PA;
        }
      
        for (int i=0;i<n;i++){
            PB = B*Math.pow(10,i)+PB;
        }
        System.out.println((int)PB+(int)PA);



    }
}
