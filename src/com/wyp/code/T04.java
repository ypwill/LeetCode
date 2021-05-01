package com.wyp.code;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author WYP
 * @date 2021-04-05 10:15
 */
public class T04 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] c1 = br.readLine().toCharArray();
        char[] c2 = br.readLine().toCharArray();
        char[] c3 = br.readLine().toCharArray();
        char[] c4 = br.readLine().toCharArray();
        int[] pos=new int[2];
        int m=0,i=0;
        for (i = 0;i<c1.length;i++){
            for (int j=0;j<c2.length;j++) {
                if (c1[i] >= 'A' && c1[i] <= 'Z') {
                    if (c1[i] == c2[j] && m < 2) {
                        pos[m++] = c1[i];
                        continue;
                    }
                }
            }
        }
            switch (pos[0]){
                case 65:
                    System.out.print("MON");
                    break;
                case 66:
                    System.out.print("TUE");
                    break;
                case 67:
                    System.out.print("WED");
                case 68:
                    System.out.print("THU");
                    break;
                case 69:
                    System.out.print("FRI");
                    break;
                case 70:
                    System.out.print("SAT");
                case 71:
                    System.out.print("SUN");
                    break;
            }
        System.out.print(" "+(pos[1]-64+9)+":");
       /* for (int i=0;i<2;i++){
            System.out.println(pos[i]);
        }*/
       int k=0;
        for (i = 0;i<c3.length;i++){
            for (int j=0;j<c4.length;j++) {
                if(c1[i]==c2[j]){
                    k=--j;
                    break;
                }
            }
        }
        System.out.println("0"+k);

    }
}
