package com.company;




class Zada4a {
    public static void main(String[] args) {
        double m=9;
        double n=9;
        double x=10;
       double a = Math.abs(x-m);
       double b = Math.abs(x-n);
       if (a==b){
           System.out.println(""+b+"и"+a+" равноудалены друг к другу");
       }

       if(a>b) {
           System.out.println("" + a + "ближе,чем " + b + "");
       }


       if(b>a){

               System.out.println(""+b+" ближе,чем "+a+"");
           }
       }

    }





