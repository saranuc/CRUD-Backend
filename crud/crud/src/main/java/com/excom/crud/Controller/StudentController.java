package com.excom.crud.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.excom.crud.DTO.StudentDTO;
import com.excom.crud.DTO.StudentSaveDTO;
import com.excom.crud.DTO.StudentUpdateDTO;
import com.excom.crud.Service.StudentService;

@RestController
@CrossOrigin
@RequestMapping("api/excom/student/")
public class StudentController {
	
	
	@Autowired
	private StudentService studentservice;
	@PostMapping(path = "/save")
	public String saveStudent(@RequestBody  StudentSaveDTO studentsavedto)
	{
		String id = studentservice.addStudent(studentsavedto);
		return id;
	}
	@GetMapping(path = "/get")
	public List<StudentDTO> getAllStudent()
	{
		List<StudentDTO> allStudents = studentservice.getStudent();
		return allStudents;
		
	}
	@PutMapping(path = "/update/{id}")
	public String updateStudent(@RequestBody  StudentUpdateDTO studentupdatedto,@PathVariable(value = "id")int id)
	{
		String idd1 = studentservice.updateStudent(studentupdatedto, id );
		return idd1;
	}
	@DeleteMapping(path = "/delete/{id}")
	public String deleteStudent(@PathVariable(value = "id")int id)
	{
		boolean deletestudent = studentservice.deleteStudent(id);
		return "Deleted Sucessfully";
	}

}
