package com.javarush.task.task18.task1815;

import java.util.List;

/* 
Таблица
*/

public class Solution {
    public class TableInterfaceWrapper implements TableInterface {
        TableInterface current;

        public TableInterfaceWrapper(TableInterface tableInterface) {
            current = tableInterface;
        }

        @Override
        public void setModel(List rows) {
            System.out.println(rows.size());
            current.setModel(rows);
        }

        @Override
        public String getHeaderText() {
            return current.getHeaderText().toUpperCase();
        }

        @Override
        public void setHeaderText(String newHeaderText) {
            current.setHeaderText(newHeaderText);
        }

    }

    public interface TableInterface {
        void setModel(List rows);

        String getHeaderText();

        void setHeaderText(String newHeaderText);
    }

    public static void main(String[] args) {
    }
}