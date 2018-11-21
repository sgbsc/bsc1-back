package com.sgbsc.article;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sgbsc.article.Article;

/*
 * This @Controller is backed by the h2 database (specified in data.sql and schema.sql),
 * and uses the articles.html Thymeleaf template.
 * 
 * The @RequestMapping("/articles") specified the name.
 * 
 * We use the JdbcTemplate to retrieve the data, and the model is a map available to
 * the template to display the results.
 *
 */

@Controller
public class ArticleController {

	@Autowired
	private ArticlesRepository repo;
	
	@RequestMapping("/jpa-articles/{id}")
	public String findByArticleId(@PathVariable("id") Integer id, Map<String, Object> model){
		
		//get all the articles
		//List<Articles> articles = em.createQuery("select a from Articles a").getResultList();
		
		//get one article
		List<Article> article = new ArrayList<Article>();
		article.add(repo.findByArticleId(id));
		
		//put the articles in the model so that we can access them in the Thymeleaf template
		model.put("articles", article);
		
		return "jpa-articles";
		
	}
	
	@RequestMapping("/jpa-articles")
	public String findAll(Map<String, Object> model){
		
		//get all the articles
		List<Article> articles = repo.findAll();
			
		//put the articles in the model so that we can access them in the Thymeleaf template
		model.put("articles", articles);
		
		return "jpa-articles";
		
	}
	
	@RequestMapping("/create-jpa-articles")
	public String createArticles(Map<String, Object> model){
		
		LocalTime now = LocalTime.now();
		
		Article article = new Article();
		article.setTitle("Title " + now.toSecondOfDay());
		article.setSummary("Created Summary");
		repo.save(article);
		
		//get all the articles
		List<Article> articles = repo.findAll();
			
		//put the articles in the model so that we can access them in the Thymeleaf template
		model.put("articles", articles);
		
		return "jpa-articles";
		
	}
	
}
