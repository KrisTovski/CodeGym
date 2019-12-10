package com.codegym.task.task06.task0604;

/* 
Cat counter

*/

public class Cat {
    public static int catCount = 0;

    public Cat(){
        catCount++;
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        catCount--;
    }

    public static void main(String[] args) {

    }
}