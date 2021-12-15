package com.boot.sts;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {
	
	@RequestMapping("/test")
	@ResponseBody
	public String test()
	{
		return "Happy Landing to DevTool (/test)";
	}
	@RequestMapping("/sample")
	@ResponseBody
	public String sample()
	{
		return "Happy Landing to DevTool (/sample)";
	}
	@RequestMapping("/dummy")
	@ResponseBody
	public String dummy()
	{
		return "Happy Landing to DevTool (/dummy)";
	}

}
