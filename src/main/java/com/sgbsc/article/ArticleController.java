package com.sgbsc.article;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/*
 * This @Controller is backed by the h2 database (specified in data.sql and schema.sql),
 * and uses the articles.html Thymeleaf template.
 * 
 * The @RequestMapping("/articles") specified the name.
 * 
 * We use the JdbcTemplate to retrieve the data, and the model is a map avaialable to
 * the template to display the results.
 *
 */

@Controller
public class ArticleController {

	@Autowired
	private JdbcTemplate template;	
	
	@RequestMapping("/articles")
	public String getArticles(Map<String, Object> model) {
		
		//get all the articles
		List<Map<String,Object>> articles = template.queryForList("select * from articles");
		
		//put the articles in the model so that we can access them in the Thymeleaf template
		model.put("articles", articles);
		
		//return the name of the template
		return "articles";
	}
	
}
