package com.company;

public class Operators {
    public static void main(String[] args){
       double Number1 = 20.00d;
       double Number2 = 80.00;
       double Sum = (Number1+Number2) * 100d;
        System.out.println("The First number is : " +Number1);
        System.out.println("The Second number is : " +Number2);
        System.out.println("The Sum is : " +Sum);
        double Remainder = Sum % 40.00d;
        System.out.println("The Remainder is" + Remainder);
        boolean isNoRemainder = (Remainder == 0) ? true : false;
        System.out.println("isNoRemainder " +isNoRemainder);
        if(isNoRemainder=false){
            System.out.println("Got some remainder");
        }

    }
}
