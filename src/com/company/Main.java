package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(temvaz(20, 500));
        System.out.println(temvaz(30, 25));
        System.out.println(temvaz(20, 20));
        System.out.println(temvaz(26, 22));
        System.out.println(temvaz(30, 30));
    }
        public static String temvaz ( int vozrast, int temperatura ){
            if ((vozrast > 20 && vozrast < 45) && (temperatura > -20 && temperatura < 30)) {
                return "Можно идти гулять";
            } else if (vozrast < 20 && (temperatura >=0 || temperatura < 28)) {
                return "Можно идти гулять";
            } else if (vozrast > 45 && (temperatura >-10 || temperatura < 25)) {
                return "Можно идти гулять";
            } else {
                return "Оставайтесь дома";
            }
        }



}
