package day9Q3;

public class Main {
    public static Person generatePerson(Person person) {
        return person;

    }
    public static void main(String[] args) {
        Student st = new Student();
        st.name = "Efat Husneara";
        st.gender = "Female";
        st.studentId = 5;
        st.courseEnrolled = "JA111";
        st.courseFee = 2000;
        st.toString();

        Instructor ins = new Instructor();
        ins.instructorId = 200;
        ins.salary = 50000;

        Person newStudent = Main.generatePerson(st);
        System.out.println(newStudent);

        Person newTeacher = Main.generatePerson(ins);
        System.out.println(newTeacher);

    }
}
