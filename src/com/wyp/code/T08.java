package com.wyp.code;

import java.io.*;
import java.math.BigInteger;
import java.util.Scanner;

/**
 * 本题要求计算A/B，其中A是不超过1000位的正整数，
 * B是1位正整数。你需要输出商数Q和余数R，使得A = B * Q + R成立。
 */
public class T08 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = new String[2];
        str = br.readLine().split(" ");
        BigInteger a   = new BigInteger(str[0]);
        BigInteger b = new BigInteger(str[1]);
        BigInteger ea,eb;
        ea = a.divide(b);
        eb = a.mod(b);
        System.out.println(ea+" "+eb);
    }
}
