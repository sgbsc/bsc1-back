package com.sgbsc.log;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Log {

	@PostMapping("/logs")
	public void getLog(@RequestBody String request) {
		System.out.println(request);
	}
}
