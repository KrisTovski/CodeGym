package com.codegym.task.task19.task1921;

import java.io.FileReader;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* 
John Johnson

*/

public class Solution {
    public static final List<Person> PEOPLE = new ArrayList<>();



        public static void main(String[] args) throws IOException {

            if (args.length == 0) {
                return;
            }

            FileReader fileIn = new FileReader(args[0]);
            StringBuilder sb = new StringBuilder();
            List<String> sData = new ArrayList<>();
            char ch;
            while (fileIn.ready()) {
                ch = (char) fileIn.read();
                if (ch != '\n') {
                    sb.append(ch);
                } else {
                    sData.add(sb.toString());
                    sb = new StringBuilder();
                }
            }
            if (!"".equals(sb.toString())) {
                sData.add(sb.toString());
            }
            fileIn.close();
            DateFormat dateFormat = new SimpleDateFormat("MM dd yyyy", Locale.ENGLISH);
            for (String str : sData) {


                String[] strings = str.split(" ");
                if (strings.length >= 4) {
                    StringBuilder sbDate = new StringBuilder();
                    StringBuilder sbName = new StringBuilder();
                    for (int i = 0; i < strings.length - 3; i++) {
                        sbName.append(strings[i]).append(" ");
                    }
                    sbDate.append(strings[strings.length - 3])
                            .append(" ")
                            .append(strings[strings.length - 2])
                            .append(" ")
                            .append(strings[strings.length - 1]
                            );
                    try {
                        PEOPLE.add(new Person(sbName.toString().trim(),
                                dateFormat.parse(sbDate.toString().trim())));
                    } catch (ParseException e) {
                        e.printStackTrace();
                    }
                }

            }

            for (Person person : PEOPLE) {
                System.out.println(person.getName() + " " + dateFormat.format(person.getBirthDate()));
            }


        }
}
