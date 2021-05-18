package com.company;

public class Main {
    public static void main(String[] args) {
        MyString str = new MyString("Aloha From Here");
        MyString gtr = new MyString("Hello world");

        System.out.println(gtr.getMyStr());
        System.out.println(str.getMyStr());
        System.out.println(str.length());
        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());
        System.out.println(str.Concate(gtr));
        System.out.println(str.substring(7,10));

    }}