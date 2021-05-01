package com.wyp.code;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**123 4577973  100
 * @author WYP
 * @date 2021-04-24 23:37
 */
public class T16 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        int a = Integer.parseInt(s[0]);
        int b = Integer.parseInt(s[1]);
        int CLK_TCK = 100;
        float d = ((float)(b - a)/CLK_TCK);
        int e;
        String s1 = String.valueOf(d);
        int i = Integer.parseInt(s1.substring(s1.length() - 1, s1.length()));
        //System.out.println(i);
        if (i<5){
            e=(int)d;
        }else{
            e=((int)d)+1;
        }
        //System.out.println(e);
        int HH=0,MM=0,SS=0;
        HH = e/3600;
        //System.out.println(HH);
        int e1 = e - HH * 3600;
        //System.out.println(e1);
        MM = e1/60;
        SS = e1 - MM * 60;
        System.out.printf("%02d",HH);
        System.out.print(":");
        System.out.printf("%02d",MM);
        System.out.print(":");
        System.out.printf("%02d",SS);
        //System.out.printf("%02d%n","%02d%n","%02d%n",HH+":"+MM+":"+ SS);


    }
}
