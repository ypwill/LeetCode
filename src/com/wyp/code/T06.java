package com.wyp.code;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * 输入第1行给出3个正整数，分别为：N（<=105），即考生总数；L（>=60），为录取最低分数线，即德分和才分均不低于L的考生才有资格
 * 被考虑录取；H（<100），为优先录取线——德分和才分均不低于此线的被定义为“才德全尽”，此类考生按德才总分从高到低排序；才分不到
 * 但德分到线的一类考生属于“德胜才”，也按总分排序，但排在第一类考生之后；德才分均低于H，但是德分不低于才分的考生属于“才德兼
 * 亡”但尚有“德胜才”者，按总分排序，但排在第二类考生之后；其他达到最低线L的考生也按总分排序，但排在第三类考生之后。
 *
 * 生按输入中说明的规则从高到低排序。当某类考生中有多人
 * 总分相同时，按其德分降序排列；若德分也并列，则按准考证号的升序输出。
 */
public class T06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Student.l = sc.nextInt();
        Student.h = sc.nextInt();
        Student[] stu = new Student[n];
        for (int i = 0;i < n;i++){
            stu[i] = new Student(sc.nextInt(),sc.nextInt(),sc.nextInt());
        }
        sc.close();
        List<Student> list = new ArrayList<Student>();
        for (Student stuArr : stu){
            if (stuArr.score1>=Student.l &&stuArr.score2>=Student.l){
                list.add(stuArr);
            }
        }
        Collections.sort(list);
        System.out.println(list.size());
        for (int i=list.size()-1;i>=0;i--){
            System.out.println(list.get(i));
        }

    }

    static public  class Student implements Comparable<Student>{
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
            sum=score1 + score2;
            if(score1 >= h && score2 >= h){
                level = 4;
            }else if(score1 >=h && score2 <h){
                level = 3;
            }else if(score1 < h && score1 > score1){
                level = 2;
            }else {
                level = 1;
            }
        }

        @Override
        public int compareTo(Student s) {
            if (level == s.level) {
                if (sum == s.sum) {
                    if (score1 == s.score1) {
                        return id - s.id;
                    }
                    else{
                        return score1 - s.score1;
                    }
                }else {
                    return sum - s.sum;
                }
            } else {
                return level - s.level;
            }

        }
    }
}
