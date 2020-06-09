package com.codegym.task.task18.task1815;

import java.util.List;

/* 
Table

*/

public class Solution {
    public class TableInterfaceWrapper implements TableInterface {

        private TableInterface ti;
        public TableInterfaceWrapper(TableInterface table){
            this.ti = table;

        }

        @Override
        public void setModel(List rows) {
            System.out.println(rows.size());
            this.ti.setModel(rows);
        }

        @Override
        public String getHeaderText() {
            return ti.getHeaderText().toUpperCase();
        }

        @Override
        public void setHeaderText(String newHeaderText) {
            ti.setHeaderText(newHeaderText);
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