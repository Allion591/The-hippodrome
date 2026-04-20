package com.javarush.task.task14.task1420;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

/* 
НОД
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BigInteger nod;

        BigInteger a = BigInteger.valueOf(Integer.parseInt(reader.readLine()));
        BigInteger b = BigInteger.valueOf(Integer.parseInt(reader.readLine()));

        nod = a.gcd(b);

        System.out.println(nod);
    }
}