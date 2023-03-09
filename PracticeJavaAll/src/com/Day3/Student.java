package com.Day3;

public class Student {
    int roll;
    String name;
    int marks;

    public void displayStudentDetails(){
        System.out.println("Roll is :"+roll);
        System.out.println("Name is : "+name);
        System.out.println("Marks is :"+marks);
    }

    public static void main(String[] args) {
        Student st = new Student();
        st.marks = 50;
        st.name = "Efat";
        st.roll = 123;
        st.displayStudentDetails();
        System.out.println("--------------------------");




        Student st2 = new Student();
        st2.roll = 456;
        st2.name = "Sifat";
        st2.marks = 65;
        st2.displayStudentDetails();
    }
}
