package evQ1;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Map<Employee,Integer> employees = new TreeMap<>();

        Employee emp1 = new Employee(10,"Efat","varanasi");
        Employee emp2 = new Employee(11,"Sifat","Allahabad");
        Employee emp3 = new Employee(12,"Rahul","Lucknow");
        Employee emp4 = new Employee(13,"Raaz","MP");
        Employee emp5 = new Employee(14,"Mehul","Delhi");

        employees.put(emp1,400000);
        employees.put(emp2,500000);
        employees.put(emp3,60000);
        employees.put(emp4,70000);
        employees.put(emp5,80000);

        System.out.println(employees);




        }





}
