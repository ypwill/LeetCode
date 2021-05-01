package com.wyp.code;

import com.sun.org.apache.xerces.internal.util.SynchronizedSymbolTable;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author WYP
 * @date 2021-04-29 9:41
 */
public class T20 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] c = br.readLine().toCharArray();
        int p = 0;
        int pa = 0;
        int pat = 0;
        for (int i = 0;i < c.length;i++){
            if (c[i] == 'P'){
                p++;
            }else if (c[i] == 'A'){
                pa+=p;
            }else{
                pat+=pa;
            }
        }
        int sum = pat%10000007;
        System.out.println(sum);
    }
}
