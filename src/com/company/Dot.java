package com.company;


import com.sun.xml.internal.ws.util.StringUtils;

import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;



public class Dot {
    Dot d;
    int size;
  String s;

    public static void main(String[] args) {
      String s = "";
      if(011 == 9) s += 4;
      if(0x11 == 17) s += 5;
      Integer I = 12345;
      if(I.intValue() == Integer.valueOf("12345")) s += 6;
      System.out.println(s);
        System.out.println("TEst");

        System.out.println("new line");



      }

  public static String task2(final String in) {
    //String in = "input string to the method test";

    String str[] = in.split(" ");
    StringBuilder stringBuilder = new StringBuilder();
    for (int i = 0; i < str.length; i++) {
      stringBuilder.append(task1(str[i]) + " ");
    }
   return  stringBuilder.toString().trim();

  }
  public static String task1(final String in) {
    // BEGIN
    return new StringBuffer(in).reverse().toString();
    // END

  }


  Dot setDot(Dot d3) {
        d3.size = 5;
        d3.d = new Dot();
        return d3;
    }

}
