package com.wyp.code;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**10 8   给定一个正整数数列，和正整数p，设这个数列中的最大值是M，最小值是m，如果M <= m * p，则称这个数列是完美数列。
 *2 3 20 4 5 1 6 7 8 9
 * @author WYP
 * @date 2021-04-25 21:23
 */
public class T18 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        String[] s1 = br.readLine().split(" ");
        int n = Integer.parseInt(s[0]);
        int p = Integer.parseInt(s[1]);
        int[] num = new int[s1.length];
        for (int i=0;i<s1.length;i++){
            num[i] = Integer.parseInt(s1[i]);
        }
        int M = num[0];
        int m = num[0];
        for (int i=1;i<num.length;i++){
            if(num[i] > M){
                M = num[i];
            }
        }
        for (int i=1;i<num.length;i++){
            if(num[i] < m){
                m = num[i];
            }
        }
        System.out.println(M+" "+m);
        int j=0;
        for (int i=0;i<num.length;i++){
            if (M <= m * num[i]){
                j++;
            }
        }
        System.out.println(j);



    }
}
