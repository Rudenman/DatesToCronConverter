package com.rudenko.danila;

public class Main {

    public static void main(String[] args) {
        Realization r = new Realization();
        r.filling();






    }
}
















/*

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
        List <DateCoincidence> coinList = new ArrayList();
        int maxSec = 0, maxMin = 0, maxHour = 0, maxDay = 0, maxMonth = 0, maxYear;
        for (int i = 0; i < quantityList; i++) {

        }
*/


/*
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
        Coincidence t = new Coincidence();
        for (int i = 0; i < quantityList; i++) {
            String date = list.get(i);
            int num = (int)(date.charAt(5) - '0') * 10 + (int)(date.charAt(6) - '0');
            t.Month(num);
            num = (int)(date.charAt(8) - '0') * 10 + (int)(date.charAt(9) - '0');
            t.Day(num);
            num = (int)(date.charAt(11) - '0') * 10 + (int)(date.charAt(12) - '0');
            t.Hour(num);
            num = (int)(date.charAt(14) - '0') * 10 + (int)(date.charAt(15) - '0');
            t.Minute(num);
            num = (int)(date.charAt(17) - '0') * 10 + (int)(date.charAt(18) - '0');
            t.Second(num);
        }

*/
/*       for (int i = 1; i < 13; i++) {
            System.out.print("(" + t.month[i] + ", " + (i) + ") ");
        }
        System.out.println( "      (" + t.maxMonth + ", " + t.counterMaxMonth + ")");
 *//*




       String cron = "";

       if (t.counterMaxSecond > quantityList / 2) {
           for (int i = 0; i < 60; i++) {
               if (t.second[i] == t.maxSecond) {
                   if (i > 9) {
                       cron = Character.toString((char) (i / 10 + '0')) + Character.toString((char) (i % 10 + '0')) + Character.toString(' ');
                   }
                   else {
                       cron  = Character.toString((char)(i % 10 + '0')) + Character.toString(' ');
                   }
               }
           }
           }
        else {
            Delts s = new Delts();
        }

*/









/*
        Delts data = new Delts();
        for (int i = 0; i < quantityList - 1; i++) {
            String date1 = list.get(i);

            String str = Character.toString(date1.charAt(0) + date1.charAt(1) + date1.charAt(2) + date1.charAt(3));
            data.checker(str);
            str = Character.toString(date1.charAt(5) + date1.charAt(6));
            data.checker(str);
            str = Character.toString(date1.charAt(8) + date1.charAt(9));
            data.checker(str);
            str = Character.toString(date1.charAt(11) + date1.charAt(12));
            data.checker(str);
            str = Character.toString(date1.charAt(14) + date1.charAt(15));
            data.checker(str);
            str = Character.toString(date1.charAt(17) + date1.charAt(18));
            data.checker(str);


            for (int j = i + 1; j < quantityList; j++) {
                String date2 = list.get(j);

                str = Character.toString(date2.charAt(0) + date2.charAt(1) + date2.charAt(2) + date2.charAt(3));
                data.checker(str);
                str = Character.toString(date2.charAt(5) + date2.charAt(6));
                data.checker(str);
                str = Character.toString(date2.charAt(8) + date2.charAt(9));
                data.checker(str);
                str = Character.toString(date2.charAt(11) + date2.charAt(12));
                data.checker(str);
                str = Character.toString(date2.charAt(14) + date2.charAt(15));
                data.checker(str);
                str = Character.toString(date2.charAt(17) + date2.charAt(18));
                data.checker(str);

                int difference = Math.abs((int) (date1.charAt(0) - '0') - (int) (date2.charAt(0) - '0')) * 1000 +
                        Math.abs((int) (date1.charAt(1) - '0') - (int) (date2.charAt(1) - '0')) * 100
                        + Math.abs((int) (date1.charAt(2) - '0') - (int) (date2.charAt(2) - '0')) * 10 +
                        Math.abs((int) (date1.charAt(3) - '0') - (int) (date2.charAt(3) - '0'));
                str = Integer.toString(difference);
                data.checker(str);


                difference = Math.abs((int) (date1.charAt(5) - '0') - (int) (date2.charAt(5) - '0')) * 10 +
                        Math.abs((int) (date1.charAt(6) - '0') - (int) (date2.charAt(6) - '0'));
                str = Integer.toString(difference);
                data.checker(str);


                difference = Math.abs((int) (date1.charAt(8) - '0') - (int) (date2.charAt(8) - '0')) * 10 +
                        Math.abs((int) (date1.charAt(9) - '0') - (int) (date2.charAt(9) - '0'));
                str = Integer.toString(difference);
                data.checker(str);


                difference = Math.abs((int) (date1.charAt(11) - '0') - (int) (date2.charAt(11) - '0')) * 10 +
                        Math.abs((int) (date1.charAt(12) - '0') - (int) (date2.charAt(12) - '0'));
                str = Integer.toString(difference);
                data.checker(str);

                difference = Math.abs((int) (date1.charAt(14) - '0') - (int) (date2.charAt(14) - '0')) * 10 +
                        Math.abs((int) (date1.charAt(15) - '0') - (int) (date2.charAt(15) - '0'));
                str =  Integer.toString(difference);
                data.checker(str);




*/





        /*
        List<String> list = new ArrayList();
        list.add("2022-01-25T08:00:00");
        list.add("2022-01-25T08:30:00");
        list.add("2022-01-25T09:00:00");
        list.add("2022-01-25T09:30:00");
        list.add("2022-01-26T08:30:00");
        list.add("2022-01-26T09:00:00");
        list.add("2022-01-25T08:00:00");
        list.add("2022-01-26T09:30:00");
        int clist = 8;
        List<String> delta = new ArrayList();
        List<Integer> Cdelta = new ArrayList();
        int counterDelta = 0;
        int deltaMax = 0;
        String strDeltaMax = "";
        for (int i = 0; i < clist; i++) {
            String date1 = list.get(i);
            for (int j = i + 1; j < clist; j++) {
                String date2 = list.get(j);

                int difference = Math.abs((int) (date1.charAt(0) - '0') - (int) (date2.charAt(0) - '0')) * 1000 +
                        Math.abs((int) (date1.charAt(1) - '0') - (int) (date2.charAt(1) - '0')) * 100
                        + Math.abs((int) (date1.charAt(2) - '0') - (int) (date2.charAt(2) - '0')) * 10 +
                        Math.abs((int) (date1.charAt(3) - '0') - (int) (date2.charAt(3) - '0'));
                String newDate = Integer.toString(difference);
                newDate +=  '-';
                difference = Math.abs((int) (date1.charAt(5) - '0') - (int) (date2.charAt(5) - '0')) * 10 +
                        Math.abs((int) (date1.charAt(6) - '0') - (int) (date2.charAt(6) - '0'));
                newDate = newDate + Integer.toString(difference);
                newDate += '-';
                difference = Math.abs((int) (date1.charAt(8) - '0') - (int) (date2.charAt(8) - '0')) * 10 +
                        Math.abs((int) (date1.charAt(9) - '0') - (int) (date2.charAt(9) - '0'));
                newDate = newDate + Integer.toString(difference);
                newDate += 'T';
                difference = Math.abs((int)(date1.charAt(11) - '0') * 3600 + (int)(date1.charAt(14) - '0') * 60 + (int)(date1.charAt(17) - '0')
                        - (int)(date2.charAt(11) - '0') * 3600 - (int) (date2.charAt(14) - '0') * 60 - (int) (date2.charAt(17) - '0'));


                *//*difference = Math.abs((int) (date1.charAt(11) - '0') - (int) (date2.charAt(11) - '0')) * 10 +
                        Math.abs((int) (date1.charAt(12) - '0') - (int) (date2.charAt(12) - '0'));
                newDate = newDate + Integer.toString(difference);
                newDate += ':';
                difference = Math.abs((int) (date1.charAt(14) - '0') - (int) (date2.charAt(14) - '0')) * 10 +
                        Math.abs((int) (date1.charAt(15) - '0') - (int) (date2.charAt(15) - '0'));
                newDate = newDate + Integer.toString(difference);
                newDate += ':';
                difference = Math.abs((int) (date1.charAt(17) - '0') - (int) (date2.charAt(17) - '0')) * 10 +
                        Math.abs((int) (date1.charAt(18) - '0') - (int) (date2.charAt(18) - '0'));*//*
                newDate = newDate + Integer.toString(difference);
                boolean checker = false;
                for (int k = 0; k < counterDelta; k++) {
                    if (newDate == delta.get(k)) {
                        Cdelta.set(k, Cdelta.get(k) + 2);
                        checker = true;
                        if (Cdelta.get(k) > deltaMax) {
                            deltaMax = Cdelta.get(k);
                            strDeltaMax = delta.get(k);
                        }
                        break;
                    }
                }
                if (checker == false) {
                    delta.add(newDate);
                    Cdelta.add(2);
                    counterDelta++;

                }



            }

        }*/

