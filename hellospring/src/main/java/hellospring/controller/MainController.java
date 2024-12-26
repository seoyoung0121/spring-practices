package hellospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {
	
	@ResponseBody
	@RequestMapping({"/", "/main", "/a/b/c/main"})	// 서블릿은 "" 해야 나머지 전부, 이건 /
	public String main() {
		return "MainController:main()";
	}
}
