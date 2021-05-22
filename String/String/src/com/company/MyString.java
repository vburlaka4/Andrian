package com.company;

public class MyString {
    private final char empty = ' ';
    public char[] myStr;
    public Integer length;

    public MyString (String str) {
        this.myStr = str.toCharArray();
        this.length = this.myStr.length;
    }

    public char[] getMyStr() {
        return this.myStr;
    }

    public Integer length (){
        return this.myStr.length;
    }

    public String toUpperCase() {
        StringBuilder newString = new StringBuilder();

        for (char c : this.myStr) {
            if (Character.isUpperCase(c)) {
                newString.append(c);
            }
            if (Character.isLowerCase(c)) {
                newString.append(Character.toUpperCase(c));
            }
            if (c == this.empty) {
                newString.append(this.empty);
            }
        }
        return newString.toString();
    }
    public String toLowerCase() {
        StringBuilder newString = new StringBuilder();
        for (char c : this.myStr) {
            if (Character.isUpperCase(c)) {
                newString.append(Character.toLowerCase(c));
            }
            if (Character.isLowerCase(c)) {
                newString.append(c);
            }
            if (c == this.empty) {
                newString.append(this.empty);
            }
        }
        return newString.toString();
    }

    public char[] concat(MyString string_2) {
        int len = this.myStr.length + string_2.myStr.length;
        char[] Concate = new char[len];
        int position = 0;
        for (char object : myStr) {
            Concate[position] = object;
            position ++;
        }
        for (char object : string_2.myStr) {
            Concate[position] = object;
            position++;
        }
        this.myStr=Concate;
        return Concate;

    }
    public String substring (int start, int end) {
        if (start < 0 || end > this.myStr.length) {
            return "Bad parameters";
        }
        String string = new String(this.myStr);
        return string.substring(start, end);
    }

    public String substringEdit (int start, int end, String insertString) {
        String leftString = new String(this.myStr).substring(0, start);
        String rightString = new String(this.myStr).substring(end, this.myStr.length);
        return String.format("%s%s%s", leftString, insertString, rightString);
    }
}








