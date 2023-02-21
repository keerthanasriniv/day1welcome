package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class display {
@GetMapping("Show")
public String show()
{
	return "Welcome";
}
}
