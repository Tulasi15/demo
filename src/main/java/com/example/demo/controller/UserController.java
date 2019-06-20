package com.example.demo.controller;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class UserController {
@RequestMapping("/")
public String checkStstus()
{
	return "HELLO VSMCOLLEGE";
}
}
