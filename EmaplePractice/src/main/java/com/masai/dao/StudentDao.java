package com.masai.dao;

import com.masai.Student;

public interface StudentDao {
	
	public void save(Student student);
	public String findStudentById(int roll);
	public boolean removeStudent(int roll);
	public String giveGraceMarks(int roll, int extaMarks);

}
