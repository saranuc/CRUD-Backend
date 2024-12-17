package com.excom.crud.Service.IMPL;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.excom.crud.DTO.StudentDTO;
import com.excom.crud.DTO.StudentSaveDTO;
import com.excom.crud.DTO.StudentUpdateDTO;
import com.excom.crud.Model.Student;
import com.excom.crud.Repo.StudentRepo;
import com.excom.crud.Service.StudentService;

@Service
public class StudentServiceIMPL implements StudentService{

	
	@Autowired
	private StudentRepo studentrepo;
	@Override
	public String addStudent(StudentSaveDTO studentsavedto) {
		// TODO Auto-generated method stub
		Student student = new Student(
				studentsavedto.getStudentname(),
				studentsavedto.getStudentaddress(),
				studentsavedto.getMobileno(),
				studentsavedto.isActive());
		
		studentrepo.save(student);
		return "Student Added Sucessfully";
	}
	@Override
	public List<StudentDTO> getStudent() {
		// TODO Auto-generated method stub
		List<Student> getStudent = studentrepo.findAll();
		List<StudentDTO> studentDTOList = new ArrayList<>();
		for( Student s: getStudent)
		{
			StudentDTO studentdto = new StudentDTO(
			s.getStudentid(),
			s.getStudentname(),
			s.getStudentaddress(),
			s.getMobileno(),
			s.isActive()
			);
			studentDTOList.add(studentdto);
		}
		return studentDTOList;
	}
	@Override
	public String updateStudent(StudentUpdateDTO studentupdatedto ,int id) {
		// TODO Auto-generated method stub
		if(studentrepo.existsById(id))
		{
			Student student = studentrepo.getById(studentupdatedto.getStudentid());
			student.setStudentname(studentupdatedto.getStudentname());
			student.setStudentaddress(studentupdatedto.getStudentaddress());
			student.setMobileno(studentupdatedto.getMobileno());
			student.setActive(studentupdatedto.isActive());
			
			studentrepo.save(student);
		}
		else
		{
			return "ID is Wrong";
		}
		return "Sucessfully Updated";
	}
	@Override
	public boolean deleteStudent(int id) {
		// TODO Auto-generated method stub
		
		if(studentrepo.existsById(id))
		{
			studentrepo.deleteById(id);
		}
		else
		{
			System.out.print("NOT FOUND");
		}
		
		return false;
	}

}
