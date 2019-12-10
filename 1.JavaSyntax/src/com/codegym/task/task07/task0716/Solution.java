package com.codegym.task.task07.task0716;

import java.util.ArrayList;
import java.util.Iterator;

/* 
R or L

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> list = new ArrayList<String>();
        list.add("rose"); // 0
        list.add("love"); // 1
        list.add("lyre"); // 2
        list = fix(list);

        for (String s : list) {
            System.out.println(s);
        }
    }

    public static ArrayList<String> fix(ArrayList<String> list) {

//        ArrayList<String> rl = new ArrayList<>();
//        ArrayList<String> r = new ArrayList<>();
//        ArrayList<String> l = new ArrayList<>();
//        ArrayList<String> other = new ArrayList<>();
//        ArrayList<String> result = new ArrayList<>();
//
//        for (int i = 0; i < list.size(); i++) {
//            if (list.get(i).contains("r") && list.get(i).contains("l")) {
//                rl.add(list.get(i));
//            }
//            else if (list.get(i).contains("r") && !list.get(i).contains("l")) {
//                r.add(list.get(i));
//            }
//            else if (list.get(i).contains("l") && !list.get(i).contains("r")) {
//                l.add(list.get(i));
//                l.add(list.get(i));
//
//               }
//            else
//                other.add(list.get(i));
//
//        }
//        result.addAll(rl);
//        result.addAll(l);
//        list.removeAll(r);
//
//
//        return result;

        for(int i = 0; i<list.size();) {
            if(list.get(i).contains("r"))
            {
                if(!list.get(i).contains("l"))
                {
                    list.remove(i);
                } else
                {
                    i++;
                }
            } else
            if(list.get(i).contains("l"))
            {
                if(!(list.get(i).contains("r")))
                {
                    list.add(i, list.get(i));
                    i += 2;
                }
            } else
            {
                i++;
            }
        }
        return list;


    }

}