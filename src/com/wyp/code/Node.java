package com.wyp.code;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/**
 * @author WYP
 * @date 2021-04-26 20:02
 */
public class Node {
    public static void main(String[] args) {
        HashSet<String> hash = new HashSet<>();
        hash.add("小明");
        System.out.println(hash);
        hash.add("小明");
        System.out.println(hash);
    }
}
