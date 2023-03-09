package com.day16;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Demo {

    public static void main(String[] args) {
//        LocalDate ld = LocalDate.now();
//        System.out.println(ld);
//
//        LocalTime  lt = LocalTime.now();
//        System.out.println(lt);
//
//        LocalDateTime ldt = LocalDateTime.now();
//        System.out.println(ldt);




      //  LocalDate ld = LocalDate.now();

      //  DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy");

//        String res =ld.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
//        System.out.println(res);

//
//        LocalDate ld = LocalDate.now();
//
//        String res = ld.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
//        System.out.println(res);


//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("Enter DOB dd/MM/yyyy");
//
//        String dob = sc.next();
//
//        LocalDate date =LocalDate.parse(dob,DateTimeFormatter.ofPattern("dd/MM/yyyy"));

//        System.out.println(date);


//
//        LocalDate ld = LocalDate.now();
//
//       String s = ld.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
//        System.out.println(s);
//
//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("Enter date dd/MM/yyyy");
//        String date = sc.next();
//
//        LocalDate ld2 =LocalDate.parse(date,DateTimeFormatter.ofPattern("dd/MM/yyyy"));
//        System.out.println(ld2);


        // Regular Expression........

        int count = 0;

        Pattern p = Pattern.compile("ab");

        Matcher m = p.matcher("abbbaaabbaa");

        while (m.find()){
            count++;
            System.out.println(m.start()+"-------"+m.end()+"------"+m.group());


        }
        System.out.println("the number of occurence :"+count);







    }

}
