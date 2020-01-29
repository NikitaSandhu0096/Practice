package com.lambton;

public class StringExample {
    public String printString(String a) {
        System.out.println(a);
        return a;
    }

    public String printStringReverse(String temp) {
        char ch[] = temp.toCharArray();
        int length = ch.length;
        for (int i = 0, j = length - 1; i <length/2; i++, j--) {
            char t = ch[j];
            ch[j] = ch[i];
            ch[i] = t;
        }
        return new String(ch);
    }

    public void printStringArray(String b[]) {
        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i]);
        }
    }

    public String zigzag(String temp1){
        if(temp1.length()<2){
            System.out.println("String only has one character");
        }
        else{
            if(temp1.length()%2==0){
                char[] ch1 = temp1.toCharArray();
                int length = temp1.length();
                for(int i = 0; i<length;i+=2){
                    char t1 = ch1[i];
                    ch1[i] = ch1[i+1];
                    ch1[i+1] = t1;
                }
                return new String(ch1);
            }
            else {
                //char t2 = temp1.charAt(temp1.length()-1);
                char[] ch1 = temp1.toCharArray();
                int length = temp1.length();
                char t2 = ch1[length-1];
                for(int i = 0; i<length-1;i+=2){
                    char t1 = ch1[i];
                    ch1[i] = ch1[i+1];
                    ch1[i+1] = t1;
                }

                for(int j =length-1; j>length/2;j--){
                    char t3 = ch1[j];
                    ch1[j] = ch1[j-1];
                    ch1[j-1] = t3;
                }

                ch1[length/2]=t2;
                return new String(ch1);
            }
        }
        return new String();
    }
}
