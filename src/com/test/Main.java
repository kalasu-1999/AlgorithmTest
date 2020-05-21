package com.test;

import java.util.Scanner;
/*
    问题描述
    　　在横轴上放了n个相邻的矩形，每个矩形的宽度是1，而第i（1 ≤ i ≤ n）个矩形的高度是hi。这n个矩形构成了一个直方图。例如，下图中六个矩形的高度就分别是3, 1, 6, 5, 2, 3。
    　　请找出能放在给定直方图里面积最大的矩形，它的边要与坐标轴平行。对于上面给出的例子，最大矩形如下图所示的阴影部分，面积是10。
    输入格式
    　　第一行包含一个整数n，即矩形的数量(1 ≤ n ≤ 1000)。
    　　第二行包含n 个整数h1, h2, … , hn，相邻的数之间由空格分隔。(1 ≤ hi ≤ 10000)。hi是第i个矩形的高度。
    输出格式
    　　输出一行，包含一个整数，即给定直方图内的最大矩形的面积。
    样例输入
    6
    3 1 6 5 2 3
    样例输出
    10
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int[] b = new int[a];
        for (int i = 0; i < a; i++) {
            b[i] = sc.nextInt();
        }
        int max = 0;
        int count;
        for (int i : b) {
            count = 0;
            for (int item : b) {
                if (item >= i) {
                    count += i;
                } else {
                    if (count > max) {
                        max = count;
                    }
                    count = 0;
                }
            }
            if (count > max) {
                max = count;
            }
        }
        System.out.println(max);
    }
}
