package com.lab.app.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class User 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer userId;
	@NotEmpty
	@Size(min=4,message ="UserName must be min of 4 charecter" )
	private String userName;
	@Pattern(regexp = "^[987]\\d{9}$", message = "Invalid mobile number. It must be 10 digits long and start with 9, 8, or 7.")
	private Long userContact;
	@NotEmpty
	@Size(min=4,message ="User Address must be min of 4 charecter" )
	private String userAddress;

}
