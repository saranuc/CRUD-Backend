package com.excom.crud.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class StudentDTO {
	
	private int studentid;
	private String studentname;
	private String studentaddress;
	private int mobileno;
	private boolean active;

}
