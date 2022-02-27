package com.rudenko.danila;

import java.util.ArrayList;
import java.util.List;

public class Filter {
    List <Integer> delta = new ArrayList(); //тут записаны все разницы
    List <Integer> counterDelta = new ArrayList(); //тут записаны счетчике всех разниц
    int maxCounterDelta = 0;
    int maxDelta = 0; // разница, которая встречалась чаще всего


    List <Integer> num = new ArrayList(); //тут находится индекс элемента, подходящего для нужной разницы
    int minNum = 100;
    int maxNum = 0;


    public void add(int a,int ca, int b, int cb) {
                boolean checker = true;
        for (int i = 0; i < delta.size(); i++) {
            if (delta.get(i) == Math.abs(a - b)) {
                counterDelta.set(i, counterDelta.get(i) + b);
                checker = false;
                if (counterDelta.get(i) > maxCounterDelta) {
                    maxCounterDelta = counterDelta.get(i);
                    maxDelta = delta.get(i);
                }
                break;
            }
        }
        if (checker == true) {
            delta.add(Math.abs(a - b));
            counterDelta.add(a + b);
            if (a + b > maxCounterDelta) {
                maxCounterDelta = counterDelta.get(counterDelta.size() - 1);
                maxDelta = delta.get(delta.size() - 1);
            }
        }
    }

    /*        boolean checker = true;
        for (int i = 0; i < delta.size(); i++) {
            if (delta.get(i) == Math.abs(a - b)) {
                counterDelta.set(i, counterDelta.get(i) * cb);
                checker = false;
                if (counterDelta.get(i) > maxCounterDelta) {
                    maxCounterDelta = counterDelta.get(i);
                    maxDelta = delta.get(i);
                }
                break;
            }
        }
        if (checker == true && Math.abs(a - b) != 0) {
            delta.add(Math.abs(a - b));
            counterDelta.add(ca * cb);
        }*/


    public void addNum (int i, int j) {
        boolean iChecker = true, jChecker = true;
        for (int k = 0; k < num.size(); k++) {
            if (num.get(k) == i) {
                iChecker = false;
            }
            if (num.get(k) == j) {
                jChecker = false;
            }
        }
        if (iChecker == true) {
            num.add(i);
        }
        if (jChecker == true) {
            num.add(j);
        }
    }

    public void minMaxNum () {
        for (int i = 0; i < num.size(); i++) {
            if (num.get(i) > maxNum) {
                maxNum = num.get(i);
            }
            if (num.get(i) < minNum) {
                minNum = num.get(i);
            }
        }
    }

    public void clean() {
        delta.clear();
        System.out.println(delta.size());
        counterDelta.clear();
        num.clear();
        maxCounterDelta = 0;
        maxDelta = 0;
        minNum = 100;
        maxNum = 0;
    }












}



/*    List <Integer> deltaSec = new ArrayList();
    List <Integer> numSec = new ArrayList();
    List <Integer> num = new ArrayList();
    int maxDeltaSec = 0;
    int delta = 0;


    public void clean () {
        deltaSec.clear();
        numSec.clear();
        num.clear();
        maxDeltaSec = 0;
       delta = 0;
    }


    public void checkSec(int a, int b) {
        boolean checker = true;
        for (int i = 0; i < deltaSec.size(); i++) {
            if (deltaSec.get(i) == Math.abs(a - b)) {
                numSec.set(i, numSec.get(i) + 1);
                if (maxDeltaSec < numSec.get(i)) {
                    maxDeltaSec = numSec.get(i);
                    delta = Math.abs(a - b);
                }
                checker = false;
                break;
            }
        }
        if (checker == true) {
            deltaSec.add(Math.abs(a - b));
            numSec.add(1);
        }
    }


        public void addFromDelta(int i, int j) {
            boolean iChecker = true, jChecker = true;
            for (int k = 0; k < num.size(); k++) {
                if (i == num.get(k)) {
                    iChecker = false;
                }
                else if (j == num.get(k)) {
                    jChecker = false;
                }
            }
            if (iChecker == true) {
                num.add(i);
            }
            else if (jChecker == true) {
                num.add(j);
            }
        }*/








   /*
   List<String> delta = new ArrayList();
    List<Integer> CounterDelta = new ArrayList();
    int quantityDelta = 0;

    public void Delts(String str, int counter) {
        delta.add(str);
        CounterDelta.add(counter);
        quantityDelta++;
    }
    public void add(int number) {
        CounterDelta.set(number, CounterDelta.get(number) + 1);
    }
    public void checker(String str) {
        boolean flag = true;
        for (int i = 0; i < quantityDelta; i++) {
            if (str == delta.get(i)) {
                add(i);
                flag = false;
                break;
            }
        }
        if (flag == true) {
            Delts(str, 1);
        }
    }

*/