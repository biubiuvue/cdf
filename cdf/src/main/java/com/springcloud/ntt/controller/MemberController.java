package com.springcloud.ntt.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MemberController {
	@RequestMapping("/getMember")
	public String getMember() {
		return "this is getMember";
	}

}
