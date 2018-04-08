package com.example.demo;

import java.util.Map;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
@Controller
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
	
	
	@RequestMapping("/index")
    public String demo(Map<String, Object> map) {
        map.put("descrip", "It's a springboot integrate freemarker's demo!!!!");
        return "index";
    }
}
