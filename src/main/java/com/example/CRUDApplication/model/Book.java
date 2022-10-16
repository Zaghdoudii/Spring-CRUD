package com.example.CRUDApplication.model;

import javax.persistence.*;

import lombok.*;

@Entity
@Table(name="Books")
@NoArgsConstructor
@Setter
@Getter
@ToString
public class Book {
	
	@Id 
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private String title;
	
	private String author;

	public String getAuthor() {
		return author;
	}

	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	
}
