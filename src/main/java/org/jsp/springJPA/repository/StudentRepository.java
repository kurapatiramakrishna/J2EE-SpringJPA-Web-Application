package org.jsp.springJPA.repository;

import java.util.List;

import org.jsp.springJPA.entity.Studentdetaile;
import org.springframework.data.jpa.repository.JpaRepository;

//For the Interface Implementation Classes hidden - Abstraction
public interface StudentRepository extends JpaRepository<Studentdetaile, Integer>
{
	//Customize
	List<Studentdetaile> getDetailsBystudentName(String studentName);
	//Customize
	List<Studentdetaile> findBypercentageGreaterThan(String percentage);
}
