package com.codegym.task.task18.task1815;

import java.util.List;

/* 
Table

*/

public class Solution {
    public class TableInterfaceWrapper implements TableInterface{

        private TableInterface ti;

        @Override
        public void setModel(List rows) {

        }

        @Override
        public String getHeaderText() {
            return null;
        }

        @Override
        public void setHeaderText(String newHeaderText) {

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