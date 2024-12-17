package com.excom.crud.Service;

import java.util.List;

import com.excom.crud.DTO.StudentDTO;
import com.excom.crud.DTO.StudentSaveDTO;
import com.excom.crud.DTO.StudentUpdateDTO;

public interface StudentService {

	String addStudent(StudentSaveDTO studentsavedto);

	List<StudentDTO> getStudent();

	String updateStudent(StudentUpdateDTO studentupdatedto, int id);

	boolean deleteStudent(int id);

}
