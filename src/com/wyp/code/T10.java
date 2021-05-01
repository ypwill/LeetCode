package com.wyp.code;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 给定任一个各位数字不完全相同的4位正整数，如果我们先把4个数字按非递增排序，再按非递减排序，然后用第1个数字减第2个数字，
 * 将得到一个新的数字。一直重复这样做，我们很快会停在有“数字黑洞”之称的6174，这个神奇的数字也叫Kaprekar常数。
 *
 *  例如，我们从6767开始，将得到
 *
 *  7766 - 6677 = 1089
 *  9810 - 0189 = 9621
 *  9621 - 1269 = 8352
 *  8532 - 2358 = 6174
 *  7641 - 1467 = 6174
 *
 */
public class T10 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        char[] c = bf.readLine().toCharArray();
        char[] x = new char[4];
        for (int i=0;i<c.length;i++){
            x[i]=c[i];
        }
        for(int i=c.length;i<x.length;i++){
            x[i]='0';
        }
        char[] y =x;

        while (true){
            int max = Integer.parseInt(String.valueOf(asc(x)));
            int min = Integer.parseInt(String.valueOf(desc(y)));
            if(max-min==0){
                System.out.println("N - N = 0000");
                break;
            }
            System.out.println(String.valueOf(asc(x))+" - "+String.valueOf(desc(y))+" = "+(max-min));
            if(max-min==6174){
                break;
            }
           x = String.valueOf(max - min).toCharArray();
           y=x;
        }


    }

    //降序
    public static char[] asc(char[] x){
        for (int i=0;i<x.length;i++){
            for (int j=0;j<x.length-i-1;j++){
                if(x[j] < x[j+1]){
                    char tmp = x[j];
                    x[j] = x[j+1];
                    x[j+1] = tmp;
                }
            }
        }
        return x;
    }


    public static char[] desc(char[] x){
        for (int i=0;i<x.length;i++){
            for (int j=0;j<x.length-i-1;j++){
                if(x[j] > x[j+1]){
                    char tmp = x[j];
                    x[j] = x[j+1];
                    x[j+1] = tmp;
                }
            }
        }
        return x;
    }
}
