package com.sgbsc.article;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "article", path="article")
public interface ArticleRepository extends JpaRepository<Article, Integer> {

}
