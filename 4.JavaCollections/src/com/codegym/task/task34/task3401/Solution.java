package com.codegym.task.task34.task3401;

/* 
Fibonacci numbers using recursion

*/
public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(solution.fibonacci(9));     // 34
        System.out.println(solution.fibonacci(5));     // 5
        System.out.println(solution.fibonacci(2));     // 1
        System.out.println(solution.fibonacci(1));     // 1
    }

    public int fibonacci(int n) {
        if(n == 0){
            return 0;
        }
        if(n == 1 || n == 2){
            return 1;
        }
        return fibonacci(n-2) + fibonacci(n-1);


    }
}