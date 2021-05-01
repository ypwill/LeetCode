package com.wyp.code;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**10 8   给定一个正整数数列，和正整数p，设这个数列中的最大值是M，最小值是m，如果M <= m * p，则称这个数列是完美数列。
 *2 3 20 4 5 1 6 7 8 9
 * @author WYP
 * @date 2021-04-25 21:23
 */
public class T17 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        String s1 = br.readLine();
        boolean flag = false;
        String s2 = "";
        StringBuffer sb = new StringBuffer(s2);
        for (int i = 0;i < s.length();i++){
            for (int j = 0;j < s1.length();j++){
                if (s.charAt(i) == s1.charAt(j)){
                    flag = true;
                }
            }
            if (flag==false){
                sb.append(s.charAt(i));
            }
            flag = false;
        }
        List list = new ArrayList<>();
        String s3 = sb.toString();
        String s4 = s3.toUpperCase();
        char[] c = s4.toCharArray();
        StringBuffer sb1 = new StringBuffer();
        String s5="";
        for (int i=0;i<c.length;i++){
            if (!list.contains(c[i])){
                sb1.append(c[i]);
                list.add(c[i]);
            }
        }
        System.out.println(sb1);
    }
}
