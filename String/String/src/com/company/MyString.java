package com.company;


public class MyString {
    public char[] myStr;
    public Integer length;
    public String newString ;

    public MyString (String str) {

        this.myStr = str.toCharArray();
        this.length = this.myStr.length;
    }

    public char[] getMyStr() {
        return this.myStr;
    }

    public Integer length(){
        return this.myStr.length;
    }
    public String toUpperCase() {

        this.newString = new String();
        for (int i = 0; this.myStr.length > i; i++) {
            if (Character.isUpperCase(this.myStr[i])) {
                newString += this.myStr[i];
            }
            if (Character.isLowerCase(this.myStr[i])) {
                newString += Character.toUpperCase(this.myStr[i]);
            }
            if (this.myStr[i] == ' ') {

                newString+=' ';
            }

        }
        return newString;

    }
    public String toLowerCase() {

        this.newString = new String();

        for (int i = 0; this.myStr.length > i; i++) {
            if (Character.isLowerCase(this.myStr[i])) {
                newString += this.myStr[i];
            }
            if (Character.isUpperCase(this.myStr[i])) {
               newString += Character.toLowerCase(this.myStr[i]);
            }
            if (this.myStr[i] == ' ') {

                newString += ' ';
            }
        }
        return newString;
    }
        public char[] Concate(MyString string_2) {
        int len = this.myStr.length + string_2.myStr.length;
        char[] Concate = new char[len];
        int position=0;
        for (char object : myStr) {
            Concate[position] = object;
            position ++;
        }
            for (char object : string_2.myStr)
            {
                Concate[position] = object;
                position++;
            }
            this.myStr=Concate;
         return Concate;


    }
    public int substring (int beginIndex, int endIndex){


        for ( beginIndex=0; beginIndex<this.myStr.length;beginIndex++ )
            for (endIndex=beginIndex+1; endIndex<=this.myStr.length;endIndex++)
    }

}








