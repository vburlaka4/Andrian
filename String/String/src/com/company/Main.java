package com.company;

public class Main {
    public static void main(String[] args) {
        MyString str = new MyString("Aloha From Here");

        System.out.println(str.getMyStr());
        System.out.println(str.substring(1, 6));
        System.out.println(str.substringEdit(0, 5, "Hey"));
    }
}
