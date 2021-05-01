package com.wyp.code;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 每个测试用例先给出一个不超过1000的正整数N表示月饼的种类数、以及不超过500的正整数D表示市场最大需求量。
 * 随后一行给出N个正数表示每种月饼的库存量（以万吨为单位）；最后一行给出N个正数表示每种月饼的总售价
 *
 *输入例子:
 *3 20
 *18 15 10
 *75 72 45
 */
public class T11 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        int n = Integer.parseInt(s[0]);
        int D = Integer.parseInt(s[1]);
        String[] s1 = br.readLine().split(" ");
        String[] s2 = br.readLine().split(" ");
        int[] s3 = new int[n];
        int[] s4 = new int[n];
        float[] s5 = new float[n];
        for (int i=0;i<n;i++){
            s3[i] = Integer.parseInt(s1[i]);
            s4[i] = Integer.parseInt(s2[i]);
            s5[i] = (float)s4[i]/s3[i];
        }
    }

    

}
