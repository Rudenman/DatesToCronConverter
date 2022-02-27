package com.rudenko.danila;


import java.util.ArrayList;
import java.util.List;

public class Coincidence {

    int []month = new int[13];
    int maxMonth = 0;

    int []day = new int[32];
    int maxDay = 0;


    int []hour = new int[24];
    int maxHour = 0;


    int []minute = new int[60];
    int maxMinute = 0;



    int []second = new int[60];
    int maxSecond = 0;

    public void clean () {
        for (int i = 0; i < 60; i++) {
            if (i < 13) {
                month[i] = 0;
            }
            if (i < 24) {
                hour[i] = 0;
            }
            if (i < 32) {
                day[i] = 0;
            }
            minute[i] = 0;
            second[i] = 0;
        }
        maxMonth = 0;
        maxDay = 0;
        maxHour = 0;
        maxMinute = 0;
        maxSecond = 0;
    }

    public void Month(int num) {
        month[num]++;
        if (month[num] > maxMonth) {
            maxMonth = month[num];
        }
    }

    public void Day(int num) {
        day[num]++;
        if (day[num] > maxDay) {
            maxDay = day[num];
        }
    }

    public void Hour(int num) {
        hour[num]++;
        if (hour[num] > maxHour) {
            maxHour = hour[num];
        }
    }

    public void Minute(int num) {
        minute[num]++;
        if (minute[num] > maxMinute) {
            maxMinute = minute[num];
        }
    }

    public void Second(int num) {
        second[num]++;
        if (second[num] > maxSecond) {
            maxSecond = second[num];
        }
    }

    public void Add(String date) {
        int num = ((int)(date.charAt(5)) - '0') * 10 + (int)(date.charAt(6) - '0');
        Month(num);
        num = (int)(date.charAt(8) - '0') * 10 + (int)(date.charAt(9) - '0');
        Day(num);
        num = (int)(date.charAt(11) - '0') * 10 + (int)(date.charAt(12) - '0');
        Hour(num);
        num = (int)(date.charAt(14) - '0') * 10 + (int)(date.charAt(15) - '0');
        Minute(num);
        num = (int)(date.charAt(17) - '0') * 10 + (int)(date.charAt(18) - '0');
        Second(num);



    }
}

/*    int []month = new int[13];
    int maxMonth = 0;
    int counterMaxMonth = 0;
    List<Integer> numCounterMonth = new ArrayList();

    int []day = new int[32];
    int maxDay = 0;
    int counterMaxDay = 0;
    List <Integer> numCounterDay = new ArrayList();


    int []hour = new int[24];
    int maxHour = 0;
    int counterMaxHour = 0;
    List <Integer> numCounterHour = new ArrayList();


    int []minute = new int[60];
    int maxMinute = 0;
    int counterMaxMinute = 0;
    List <Integer> numCounterMinute = new ArrayList();


    int []second = new int[60];
    int maxSecond = 0;
    int counterMaxSecond = 0;
    List <Integer> numCounterSecond = new ArrayList();

    public void clean () {
        for (int i = 0; i < 60; i++) {
            if (i < 13) {
                month[i] = 0;
            }
            if (i < 24) {
                hour[i] = 0;
            }
            if (i < 32) {
                day[i] = 0;
            }
            minute[i] = 0;
            second[i] = 0;
        }

        maxMonth = 0;
        counterMaxMonth = 0;
        numCounterMonth.clear();

        maxDay = 0;
        counterMaxDay = 0;
        numCounterDay.clear();

        maxHour = 0;
        counterMaxDay = 0;
        numCounterDay.clear();

        maxMinute = 0;
        counterMaxMinute = 0;
        numCounterMinute.clear();

        maxSecond = 0;
        counterMaxSecond = 0;
        numCounterSecond.clear();


    }




    public void Month(int num) {
        month[num]++;
        if (month[num] > maxMonth) {
            counterMaxMonth = 1;
            maxMonth = month[num];
            numCounterMonth.clear();
            numCounterMonth.add(num);
        }
        else if (month[num] == maxMonth) {
            counterMaxMonth++;
            boolean checker = true;
            for (int i = 0; i < numCounterMonth.size() - 1; i++) {
                if (numCounterMonth.get(i) == num) {
                    checker = false;
                }
            }
            if (checker == true) {
                numCounterMonth.add(num);
            }
        }
    }

    public void Day(int num) {
        day[num]++;
        if (day[num] > maxDay) {
            counterMaxDay = 1;
            maxDay = day[num];
            numCounterDay.clear();
            numCounterDay.add(num);
        }
        else if (day[num] == maxDay) {
            counterMaxDay++;

            boolean checker = true;
            for (int i = 0; i < numCounterDay.size() -1 ; i++) {
                if (numCounterDay.get(i) == num) {
                    checker = false;
                }
            }
            if (checker == true) {
                numCounterDay.add(num);
            }

        }
    }

    public void Hour(int num) {
        hour[num]++;
        if (hour[num] > maxHour) {
            counterMaxHour = 1;
            maxHour = hour[num];
            numCounterHour.clear();
            numCounterHour.add(num);
        }
        else if (hour[num] == maxHour) {
            counterMaxHour++;

            boolean checker = true;
            for (int i = 0; i < numCounterHour.size() - 1; i++) {
                if (numCounterHour.get(i) == num) {
                    checker = false;
                }
            }
            if (checker == true) {
                numCounterHour.add(num);
            }

        }
    }

    public void Minute(int num) {
        minute[num]++;
        if (minute[num] > maxMinute) {
            counterMaxMinute = 1;
            maxMinute = minute[num];
            numCounterMinute.clear();
            numCounterMinute.add(num);
        }
        else if (minute[num] == maxMinute) {
            counterMaxMinute++;

            boolean checker = true;
            for (int i = 0; i < numCounterMinute.size() - 1; i++) {
                if (numCounterMinute.get(i) == num) {
                    checker = false;
                }
            }
            if (checker == true) {
                numCounterMinute.add(num);
            }

        }
    }

    public void Second(int num) {
        second[num]++;
        if (second[num] > maxSecond) {
            counterMaxSecond = 1;
            maxSecond = second[num];
            numCounterSecond.clear();
            numCounterSecond.add(num);
        }
        else if (second[num] == maxSecond) {
            counterMaxSecond++;

            boolean checker = true;
            for (int i = 0; i < numCounterSecond.size(); i++) {
                if (numCounterSecond.get(i) == num) {
                    checker = false;
                }
            }
            if (checker == true) {
                numCounterSecond.add(num);
            }

        }
    }
*/