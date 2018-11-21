package com.sgbsc.article;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Entity
@Setter @Getter
public class Article {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int articleId;
	
	private String title;
	
	private String summary;

	public Article() {}
	
	public Article(String title, String summary) {
		this.title = title;
		this.summary = summary;
	}
}
