package com.javarush.task.task09.task0902;

/* 
И снова StackTrace
*/

public class Solution {
    public static void main(String[] args) {
        method1();
    }

    public static String method1() {

        method2();
        StackTraceElement trace = Thread.currentThread().getStackTrace()[2];
        System.out.println(trace.getMethodName());
        return trace.getMethodName();
    }

    public static String method2() {
        method3();
        StackTraceElement trace = Thread.currentThread().getStackTrace()[2];
        System.out.println(trace.getMethodName());
        return trace.getMethodName();
    }

    public static String method3() {
        method4();
        StackTraceElement trace = Thread.currentThread().getStackTrace()[2];
        System.out.println(trace.getMethodName());
        return trace.getMethodName();
    }

    public static String method4() {
        method5();
        StackTraceElement trace = Thread.currentThread().getStackTrace()[2];
        System.out.println(trace.getMethodName());
        return trace.getMethodName();
    }

    public static String method5() {
        StackTraceElement trace = Thread.currentThread().getStackTrace()[2];
        System.out.println(trace.getMethodName());
        return trace.getMethodName();
    }
}
