package com.wyp.code;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author WYP
 * @date 2021-04-04 21:36
 */
public class T02 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        int A1=0,A2=0,A3=0,A4=0,A5=0;
        int flag=1;
        int max=0,j=0;
        for(int i=1;i<s.length;i++){
           int a = Integer.parseInt(s[i]);
           if(a%5==0 &&a%2==0){
               A1=A1+a;
           }else if(a%5==1){
               A2=A2+a*flag;
               flag=flag*-1;
           }else if(a%5==2){
               A3++;
           }else if(a%5==3){
               j++;
               A4=A4+a;
           }else if(a%5==4){
               if(a>max){
                   max=a;
               }
           }
        }
        double a4 = A4/(j*1.0);
        if(A1!=0)
            System.out.print(A1+" ");
        else
            System.out.print('N'+" ");
        if(A2!=0)
            System.out.print(A2+" ");
        else
            System.out.print('N'+" ");
        if(A3!=0)
            System.out.print(A3+" ");
        else
            System.out.print('N'+" ");
        if(a4!=0)
            System.out.print(A4+" ");
        else
            System.out.print('N'+" ");
        if(A5!=0)
            System.out.print(A5);
        else
            System.out.print('N');


        //System.out.println(A1+" "+A2+" "+A3+" "+a4+" "+max);
    }
}
