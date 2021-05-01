package com.wyp.code;



import javax.annotation.processing.SupportedSourceVersion;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author WYP
 * @date 2021-04-10 23:13
 */
public class T09 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int js=0,pj=0,jf=0;
        int jc=0,jj=0,jb=0;
        int yc=0,yj=0,yb=0;
        for (int i = 0;i < n;i++){
            String[] s = br.readLine().split(" ");
            char o = s[0].charAt(0);
            char p = s[1].charAt(0);
            if (o=='C'){
                if(p=='J'){
                    js++;
                    jc++;
                }else if(p=='B'){
                    jf++;
                    yb++;
                }else if(p=='C'){
                    pj++;
                }
            }else if(o=='J'){
                if(p=='J'){
                    pj++;
                }else if(p=='B'){
                    js++;
                    jj++;
                }else if(p=='C'){
                    jf++;
                    yc++;
                }
            }else if(o=='B'){
                if(p=='J'){
                    jf++;
                    yj++;
                }else if(p=='B'){
                    pj++;
                }else if(p=='C'){
                    js++;
                    jb++;
                }
            }
        }
        char jzm = bj(jc, jj, jb);
        char yzm = bj(yc, yj, yb);


        System.out.println(js+" "+pj+" "+jf);
        System.out.println(jf+" "+pj+" "+js);
        //System.out.println(jc+" "+jj+" "+jb);
        //System.out.println(yc+" "+yj+" "+yb);
        System.out.println(jzm+" "+yzm);


    }
    public static char bj(int a,int b,int c){
        char max=0;
        if(a>b){
            if(a>c){
                //max=a;
                max='C';
            }else{
                //max=c;
                max='B';
            }
        }
        if(a>c){
            if(a>b){
                //max=a;
                max='C';
            }else{
               // max=b;
                max='J';
            }
        }
        if(b>c){
            if (b>a){
               // max=b;
                max='J';
            }else{
               // max=a;
                max='C';
            }
        }
        return max;
    }

}
