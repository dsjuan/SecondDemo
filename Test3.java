package cn.ekgc.bmdsjad.LogiDemo;

import java.util.Scanner;

/*
* 题目：将一个正整数分解质因数。例如：输入90,打印出90=2*3*3*5。
程序分析：对n进行分解质因数，应先找到一个最小的质数k，然后按下述步骤完成：
(1)如果这个质数恰等于k，则说明分解质因数的过程已经结束，打印出即可。
(2)如果n>k，但n能被k整除，则应打印出k的值，并用n除以k的商,作为新的正整数n,重复执行第一步。
(3)如果n不能被k整除，则用k+1作为k的值,重复执行第一步。
*/
public class Test3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入一个正整数：");
        int n = input.nextInt();
        dopose(n);
    }

    private static void dopose(int n) {
        System.out.print(n+"=");
        if (n == 1) {
            System.out.print(n);
        }
        for (int i = 2; i <= n; i++) {
               while (n % i == 0 && n != i) {
                    System.out.print(i+"*");
                    n /= i;
                }
               if(n==i){
                   System.out.println(n);
               }
        }


        }

    }




