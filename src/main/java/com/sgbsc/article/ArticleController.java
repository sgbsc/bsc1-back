package com.sgbsc.article;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class ArticleController {

	@Autowired
	private JdbcTemplate template;	
	
	@RequestMapping("/articles1")
	public String getArticles(Map<String, Object> model) {
		
		List<Map<String,Object>> articles = template.queryForList("select * from articles");
		model.put("articles", articles);
		return "articles";
	}
	
	@RequestMapping("/articles2")
	public String getArticles(Model model) {
		
		model.addAttribute("a","b");
		return "articles";
	}
	
}
