package org.jsp.springJPA.dao;

import java.util.List;
import java.util.Optional;

import org.jsp.springJPA.entity.Studentdetaile;
import org.jsp.springJPA.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class StudentDAOImp implements StudentDAO
{
	//Implementation Class Object Will get Inject
	@Autowired
	private StudentRepository studentRepository;
	
	@Override
	public void addStudent(Studentdetaile s1) 
	{
		//Insert Records
		//Internally - Call persist Method
		studentRepository.save(s1);
	}
	@Override
	public int deleteStudent(int rollNo) 
	{
		try 
		{
			studentRepository.deleteById(rollNo);
			return 1;
		} 
		catch (Exception e) 
		{
			return 0;
		}
	}
	@Override
	public Studentdetaile getStudentDetails(int rollNo) 
	{
		//Optional<Student> opt = studentRepository.findById(rollNo);
		//Student s1 = opt.get();
		try 
		{
			Studentdetaile s1 = studentRepository.findById(rollNo).get();
			return s1;
		} 
		catch (Exception e) 
		{
			return null;
		}
	}
	@Override
	public List<Studentdetaile> getAllStudentDetails() 
	{
		List<Studentdetaile> list = studentRepository.findAll();
		return 	list;
	}
	@Override
	public Studentdetaile updatePercentage(int rollNo, double percentage) 
	{
		//Retrieve Data
		try 
		{
			Studentdetaile s2 = studentRepository.findById(rollNo).get();
			//Update Percentage
			s2.setPercentage(percentage);
			//Save the Data
			Studentdetaile s3 = studentRepository.save(s2);
			return s3;
		} 
		catch (Exception e) 
		{
			return null;
		}
	}
	@Override
	public List<Studentdetaile> getStudentDetailsByName(String studentName) 
	{
		return studentRepository.getDetailsBystudentName(studentName);
	}
	@Override
	public List<Studentdetaile> findStudentPercentageGreaterThan(String percentage) 
	{
		return studentRepository.findBypercentageGreaterThan(percentage);
	}
}
