package com.sgbsc.article;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Entity
@Setter @Getter
public class Articles {

	@Id
	private int articleId;
	
	private String title;
	
	private String summary;
	
	private String tag;
}
