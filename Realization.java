package com.rudenko.danila;

import java.util.ArrayList;
import java.util.List;

public class Realization {
    public void filling() {


        List<String> list = new ArrayList();
        list.add("2022-01-25T08:00:00");
        list.add("2022-01-25T08:30:00");
        list.add("2022-01-25T09:00:00");
        list.add("2022-01-25T09:30:00");
        list.add("2022-01-26T08:30:00");
        list.add("2022-01-26T09:00:00");
        list.add("2022-01-25T08:00:00");
        list.add("2022-01-26T09:30:00");
        int quantityList = 8;
        Coincidence c = new Coincidence();
        Filter f = new Filter();
        for (int i = 0; i < quantityList; i++) {
            String date = list.get(i);
            c.Add(date);
        }
        String cron = "";
        if (c.maxSecond * 2 > quantityList) {
            for (int i = 0; i < 60; i++) {
                if (c.maxSecond == c.second[i]) {
                    cron = Character.toString((char) (i / 10 + '0')) + Character.toString((char) (i % 10 + '0')) + Character.toString(' ');
                    break;
                }
            }
            c.clean();
            for (int i = 0; i < quantityList; i++) {
                String date = Character.toString(list.get(i).charAt(17)) + Character.toString(list.get(i).charAt(18));
                if (date == cron);
                c.Add(list.get(i));

            }
        }
        else {
            for (int i = 0; i < 59; i++) {
                for (int j = i + 1; j < 60; j++) {
                    int a = c.second[i], b = c.second[j];
                    f.add(i, a, j,  b);
                }
            }
            for (int i = 0; i < 59; i++) {
                for (int j = i + 1; j < 60; j++) {
                    if (Math.abs(i -  j) == f.maxDelta) {
                        f.addNum(i, j);
                    }
                }
            }
            if (f.num.size() * 2 > quantityList) {
                if (f.maxDelta > 9) {
                    cron = cron + "*/" + Character.toString(f.maxDelta / 10 + '0') + Character.toString(f.maxDelta % 10 + '0');
                }
                else {
                    cron = cron + "*/" + Character.toString(f.maxDelta % 10 + '0');
                }
                c.clean();
                for (int i = 0; i < quantityList; i++) {
                    String date = Character.toString(list.get(i).charAt(17)) + Character.toString(list.get(i).charAt(18));
                    if (date == cron);
                    c.Add(list.get(i));
                }
            }
            else {
                System.out.println("cron doesn't exist");
                System.exit(0);
            }
            c.clean();
            for (int i = 0; i < quantityList; i++) {
                for (int j = 0; j < f.num.size(); j++) {
                    String str1 = list.get(i);
                     str1 = Character.toString(str1.charAt(17)) + Character.toString(str1.charAt(18));
                     String str2 = Character.toString((char)(f.num.get(j) / 10) + '0') + Character.toString( (char)(f.num.get(j) % 10) + '0');
                    if (str1 == str2) {
                        String date = list.get(i);
                        c.Add(date);
                    }

                }
            }

        }
        cron += " ";
        f.clean();

        if (c.maxMinute * 2 > quantityList) {
            for (int i = 0; i < 60; i++) {
                if (c.maxMinute == c.minute[i]) {
                    cron = Character.toString( (i / 10 + '0')) + Character.toString( (i % 10 + '0')) + Character.toString(' ');
                    break;
                }
            }
            c.clean();
            for (int i = 0; i < quantityList; i++) {
                String date = list.get(i);
                date = Character.toString(date.charAt(14)) + Character.toString(list.get(i).charAt(15));
                if (date == cron);
                c.Add(list.get(i));
            }
        }




        else {
            for (int i = 0; i < 59; i++) {
                for (int j = i + 1; j < 60; j++) {
                    int a = c.minute[i], b = c.minute[j];
                    if (c.minute[i] != 0 && c.minute[j] != 0) {
                        f.add(i, a, j, b);
                    }
                }
            }
            for (int i = 0; i < 59; i++) {
                for (int j = i + 1; j < 60; j++) {
                    if (c.minute[i] != 0 && c.minute[j] != 0){
                        if (Math.abs(i - j) == f.maxDelta) {
                            f.addNum(i, j);

                        }
                }
                }
            }
            if (f.maxCounterDelta * 2 > quantityList && f.maxDelta == 1 && (f.minNum != 0 && f.maxNum != 59)) {
                cron = cron + Character.toString((char)(f.minNum / 10) + '0') + Character.toString((char)(f.minNum % 10) + '0')
                + "-" + Character.toString((char)(f.maxNum / 10) + '0') + Character.toString((char)(f.maxNum % 10) + '0');
            }
            else if (f.maxCounterDelta* 2 > quantityList) {
                if (f.maxDelta > 9) {
                    cron = cron + "*/" + Character.toString((char)(f.maxDelta / 10) + '0') + Character.toString((char)(f.maxDelta % 10) + '0');
                }
                else {
                    cron = cron + "*/" + Character.toString((char)(f.maxDelta % 10) + '0');
                }
            }
            else {
                cron += "*";
            }
            c.clean();
            for (int i = 0; i < quantityList; i++) {
                for (int j = 0; j < f.num.size(); j++) {
                    String str1 = Character.toString(list.get(i).charAt(14)) + Character.toString(list.get(i).charAt(15));
                    String str2 = Character.toString((char) (f.num.get(j) / 10) + '0') + Character.toString((char) (f.num.get(j) % 10) + '0');
                    if (str1 == str2) {
                        String date = list.get(i);
                        c.Add(date);
                    }
                }
            }
        }

        cron += " ";
        f.clean();





        if (c.maxHour * 2 > quantityList) {
            for (int i = 0; i < 24; i++) {
                if (c.maxHour == c.hour[i]) {
                    cron = Character.toString( (i / 10 + '0')) + Character.toString( (i % 10 + '0')) + " ";
                    break;
                }
            }
            c.clean();
            for (int i = 0; i < quantityList; i++) {
                String date = list.get(i);
                date = Character.toString(date.charAt(11)) + Character.toString(list.get(i).charAt(12));
                if (date == cron);
                c.Add(list.get(i));
            }
        }
        else {
            for (int i = 0; i < 23; i++) {
                for (int j = i + 1; j < 24; j++) {
                    int a = c.hour[i], b = c.hour[j];
                    if (c.hour[i] != 0 && c.hour[j] != 0) {
                        f.add(i, a, j, b);
                    }
                }
            }
            for (int i = 0; i < 23; i++) {
                for (int j = i + 1; j < 24; j++) {
                    if (c.hour[i] != 0 && c.hour[j] != 0){
                        if (Math.abs(i - j) == f.maxDelta) {
                            f.addNum(i, j);

                        }
                    }
                }
            }
            if (f.maxDelta == 1 && (f.minNum != 0 && f.maxNum != 23)) {
                cron = cron + Character.toString((char)(f.minNum / 10) + '0') + Character.toString((char)(f.minNum % 10) + '0')
                        + "-" + Character.toString((char)(f.maxNum / 10) + '0') + Character.toString((char)(f.maxNum % 10) + '0');
            }
            else if (f.maxCounterDelta * 2 > quantityList) {
                if (f.maxDelta > 9) {
                    cron = cron + "*/" + Character.toString((char)(f.maxDelta / 10) + '0') + Character.toString((char)(f.maxDelta % 10) + '0');
                }
                else {
                    cron = cron + "*/" + Character.toString((char)(f.maxDelta % 10) + '0');
                }
            }
            else {
                cron += "*";
            }
            c.clean();
            for (int i = 0; i < quantityList; i++) {
                for (int j = 0; j < f.num.size(); j++) {
                    String str1 = Character.toString(list.get(i).charAt(11)) + Character.toString(list.get(i).charAt(12));
                    String str2 = Character.toString((char) (f.num.get(j) / 10) + '0') + Character.toString((char) (f.num.get(j) % 10) + '0');
                    if (str1 == str2) {
                        String date = list.get(i);
                        c.Add(date);
                    }
                }
            }
        }

        cron += " ";
        f.clean();

        if (c.maxDay * 2 > quantityList) {
            for (int i = 1; i < 32; i++) {
                if (c.maxDay == c.day[i]) {
                    cron = Character.toString( (i / 10 + '0')) + Character.toString( (i % 10 + '0')) + " ";
                    break;
                }
            }
            c.clean();
            for (int i = 0; i < quantityList; i++) {
                String date = list.get(i);
                date = Character.toString(date.charAt(8)) + Character.toString(list.get(i).charAt(9));
                if (date == cron);
                c.Add(list.get(i));
            }
        }
        else {
            for (int i = 1; i < 31; i++) {
                for (int j = i + 1; j < 32; j++) {
                    int a = c.day[i], b = c.day[j];
                    if (c.day[i] != 0 && c.day[j] != 0) {
                        f.add(i, a, j, b);
                    }
                }
            }
            for (int i = 1; i < 31; i++) {
                for (int j = i + 1; j < 32; j++) {
                    if (c.day[i] != 0 && c.day[j] != 0){
                        if (Math.abs(i - j) == f.maxDelta) {
                            f.addNum(i, j);

                        }
                    }
                }
            }
            if (f.maxDelta == 1 && (f.minNum != 0 && f.maxNum != 31)) {
                cron = cron + Character.toString((char)(f.minNum / 10) + '0') + Character.toString((char)(f.minNum % 10) + '0')
                        + "-" + Character.toString((char)(f.maxNum / 10) + '0') + Character.toString((char)(f.maxNum % 10) + '0');
            }
            else if (f.maxCounterDelta * 2 > quantityList) {
                if (f.maxDelta > 9) {
                    cron = cron + "*/" + Character.toString((char)(f.maxDelta / 10) + '0') + Character.toString((char)(f.maxDelta % 10) + '0');
                }
                else {
                    cron = cron + "*/" + Character.toString((char)(f.maxDelta % 10) + '0');
                }
            }
            else {
                cron += "*";
            }
            c.clean();
            for (int i = 0; i < quantityList; i++) {
                for (int j = 0; j < f.num.size(); j++) {
                    String str1 = Character.toString(list.get(i).charAt(8)) + Character.toString(list.get(i).charAt(9));
                    String str2 = Character.toString((char) (f.num.get(j) / 10) + '0') + Character.toString((char) (f.num.get(j) % 10) + '0');
                    if (str1 == str2) {
                        String date = list.get(i);
                        c.Add(date);
                    }
                }
            }
        }

        cron += " ";
        f.clean();

        System.out.println(c.maxMonth);
        if (c.maxMonth * 2 > quantityList) {
            for (int i = 1; i < 13; i++) {
                if (c.maxMonth == c.month[i]) {
                    cron = Character.toString( (i / 10 + '0')) + Character.toString( (i % 10 + '0')) + " ";
                    break;
                }
            }
            c.clean();
            for (int i = 0; i < quantityList; i++) {
                String date = list.get(i);
                date = Character.toString(date.charAt(5)) + Character.toString(list.get(i).charAt(6));
                if (date == cron);
                c.Add(list.get(i));
            }
        }
        else {
            for (int i = 1; i < 12; i++) {
                for (int j = i + 1; j < 13; j++) {
                    int a = c.minute[i], b = c.month[j];
                    if (c.month[i] != 0 && c.month[j] != 0) {
                        f.add(i, a, j, b);
                    }
                }
            }
            for (int i = 1; i < 12; i++) {
                for (int j = i + 1; j < 13; j++) {
                    if (c.month[i] != 0 && c.month[j] != 0){
                        if (Math.abs(i - j) == f.maxDelta) {
                            f.addNum(i, j);

                        }
                    }
                }
            }
            if (f.maxDelta == 1 && (f.minNum != 0 && f.maxNum != 12)) {
                cron = cron + Character.toString((char)(f.minNum / 10) + '0') + Character.toString((char)(f.minNum % 10) + '0')
                        + "-" + Character.toString((char)(f.maxNum / 10) + '0') + Character.toString((char)(f.maxNum % 10) + '0');
            }
            else if (f.maxCounterDelta * 2 > quantityList) {
                if (f.maxDelta > 9) {
                    cron = cron + "*/" + Character.toString((char)(f.maxDelta / 10) + '0') + Character.toString((char)(f.maxDelta % 10) + '0');
                }
                else {
                    cron = cron + "*/" + Character.toString((char)(f.maxDelta % 10) + '0');
                }
            }
            else {
                cron += "*";
            }
            c.clean();
            for (int i = 0; i < quantityList; i++) {
                for (int j = 1; j < f.num.size(); j++) {
                    String str1 = Character.toString(list.get(i).charAt(5)) + Character.toString(list.get(i).charAt(6));
                    String str2 = Character.toString((char) (f.num.get(j) / 10) + '0') + Character.toString((char) (f.num.get(j) % 10) + '0');
                    if (str1 == str2) {
                        String date = list.get(i);
                        c.Add(date);
                    }
                }
            }
        }
        cron += " *";

        System.out.println(cron);



















    }
}
