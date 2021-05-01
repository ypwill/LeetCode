package com.wyp.code;

import java.util.Scanner;

/**
 * @author WYP
 * @date 2021-04-04 22:22
 */
public class T03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        int count=0,count2=0;
        int x=2;
        while (true) {
                if (isPrime(x)) {
                    count++;
                    if (count >= m && count <= n) {
                        count2++;
                        if(count2<=9&&count!=n){
                            System.out.print(x+" ");
                        }else{
                            if(count==n){
                                System.out.print(x);
                            }else{
                                System.out.print(x);
                                System.out.println();
                                count2=0;
                            }
                        }
                    }
                }
                if(count >n){
                    break;
                }else{
                    x++;
                }

        }
    }
    public static boolean isPrime(int n){
        for(int j=2;j<=Math.sqrt(n);j++) {
            if (n % j == 0) {
                return false;
            }
        }
        return true;
    }

}
