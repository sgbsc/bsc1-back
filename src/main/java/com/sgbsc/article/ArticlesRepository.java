package com.sgbsc.article;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArticlesRepository extends JpaRepository<Article, Integer> {

	public Article findByArticleId(int id);
	
	public List<Article> findAll();
}
