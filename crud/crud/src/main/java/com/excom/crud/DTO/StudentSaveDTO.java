package com.excom.crud.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class StudentSaveDTO {
	private String studentname;
	private String studentaddress;
	private int mobileno;
	private boolean active;
}
