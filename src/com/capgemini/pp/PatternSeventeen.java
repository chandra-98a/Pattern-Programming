package com.capgemini.pp;

public class PatternSeventeen {
    public static void main(String[] args){
        for (int i=1;i<=5;i++){
            for (int k=1;k<=i;k++){
                System.out.print(" ");
            }
            for (int j=1;j<=2*(5-i+1)-1;j++){
                if(i==1||j==1||j<=2*(5-i+1)-1) {
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
