package com.lab.app.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Book 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer bookId;
	@NotEmpty
	@Size(min=4,message = "Book Title Name must be 4 charecters")
	private String bookTitle;
	@NotEmpty
	@Size(min=4,message = "Book Author Name must be 4 charecters")
	private String author;
	@ManyToOne(cascade = CascadeType.ALL)
	private User user;
	

}
