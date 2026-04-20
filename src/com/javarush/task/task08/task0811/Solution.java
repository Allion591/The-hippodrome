package com.javarush.task.task08.task0811;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/* 
Квартет «Методы»
*/

public class Solution {
    public static List getListForGet() {
       List<Object> fastGet = new ArrayList<>();
        return fastGet;
    }

    public static List getListForSet() {
        List<Object> fastSet = new ArrayList<>();
        return fastSet;

    }

    public static List getListForAddOrInsert() {
        List<Object> fastInsert = new LinkedList<>();
        return fastInsert;

    }

    public static List getListForRemove() {
        List<Object> fastDelete = new LinkedList<>();
        return fastDelete;
    }

    public static void main(String[] args) {

    }
}
