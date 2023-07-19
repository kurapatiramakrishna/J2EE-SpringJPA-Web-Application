package org.jsp.springJPA.dao;

import java.util.List;

import org.jsp.springJPA.entity.Studentdetaile;

public interface StudentDAO 
{
	//Insert Data in Table
	void addStudent(Studentdetaile s1);
	//Delete Data from Table by using rollNo
	int deleteStudent(int rollNo);
	//Search Data by Using rollNo
	Studentdetaile getStudentDetails(int rollNo);
	//Search All Student Data
	List<Studentdetaile> getAllStudentDetails();
	//Update Student Details
	Studentdetaile updatePercentage(int rollNo, double percentage);
	//Search Student Data By Name
	List<Studentdetaile> getStudentDetailsByName(String studentName);
	//Find by Percentage Greater Than
	List<Studentdetaile> findStudentPercentageGreaterThan(String percentage);
}
