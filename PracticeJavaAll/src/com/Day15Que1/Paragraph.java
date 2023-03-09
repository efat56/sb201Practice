package com.Day15Que1;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Paragraph {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Paragraph");

        String s = sc.nextLine();

        Pattern p = Pattern.compile("Java");

        Matcher m = p.matcher(s);

        int count = 0;

        while (m.find()){
            count++;
            System.out.println(m.start()+"--------"+m.end()+"-------"+m.group());
        }


        System.out.println("the number of occurance is :"+count);




    }
}
