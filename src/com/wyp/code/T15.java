package com.wyp.code;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * +1.23400E-03
 * 0.00123400
 * @author WYP
 * @date 2021-04-24 23:00
 */
public class T15 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        StringBuffer sb = new StringBuffer(String.valueOf(s.charAt(1)));
        //System.out.println(sb);
        int n = 0;
        String subs0 = "0.";
        StringBuffer sb1 = new StringBuffer(subs0);
        String subs1 = null;
        for (int i=1;i<s.length();i++){
            if (s.charAt(i) == '-'){
                String subs = s.substring(i + 1, s.length());
                //System.out.println(subs);
                 n = Integer.parseInt(subs);
                break;
            }
            if (s.charAt(i) == 'E'){
                 subs1 = s.substring(3, i);
            }
        }
        sb.append(subs1);

        for (int i =1;i<n;i++){
            sb1.append('0');
        }
        sb1.append(sb);

        if (s.charAt(0) == '-'){
            String a = "-";
            StringBuffer sb2 = new StringBuffer(a);
            sb2.append(sb1);
            System.out.println(sb2);
        }
        System.out.println(sb1);





    }
}
