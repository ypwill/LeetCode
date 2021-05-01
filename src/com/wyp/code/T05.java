package com.wyp.code;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * @author WYP
 * @date 2021-04-06 10:06
 */
public class T05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Student.l = sc.nextInt();
        Student.h = sc.nextInt();
        Student[] stu = new Student[n];
        for (int i=0;i<n;i++){
            stu[i] = new Student(sc.nextInt(),sc.nextInt(),sc.nextInt());
        }
        sc.close();
        List<Student> list = new ArrayList<Student>();
        //筛选不及格的考生
        for (Student stuArr : stu){
            if (stuArr.score1>=Student.l && stuArr.score2>=Student.l){
                list.add(stuArr);
            }
        }
        Collections.sort(list);
        System.out.println(list.size());
        for (int i = list.size()-1; i >= 0; i--) {
            System.out.println(list.get(i));
        }
    }
    static class Student implements Comparable<Student>{
        static int l;
        static int h;

        int id;
        int score1;
        int score2;
        int sum;
        int level;
        public Student(int id, int score1, int score2) {
            this.id = id;
            this.score1 = score1;
            this.score2 = score2;
            sum = score1 + score1;
            if(score1>=h &&score2>=h){
                level = 4;
            }else if(score1>=h &&score2<=h){
                level = 3;
            }else if(score1<h && score1>score2){
                level = 2;
            }else {
                level = 1;
            }
        }

        @Override
        public String toString() {
            return id +" "+score1+" "+score2;
        }

        @Override
        public int compareTo(Student s) {
            if (level == s.level){
                if (sum == s.sum){
                    if (score1 == s.score1){
                        return id - s.id;
                    }else {
                        return score1 - s.score1;
                    }
                }else {
                    return sum - s.sum;
                }
            }else {
                return level - s.level;
            }
        }
    }
}
