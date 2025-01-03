package locale.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.LocaleResolver;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class LocaleController {
	private LocaleResolver localeResolver;
	
	public LocaleController(LocaleResolver localeResolver) {
		this.localeResolver=localeResolver;
	}
	
	@RequestMapping("/")
	public String index(HttpServletRequest request) { // 이 처리는 아마 interceptor같은데서 해야
		System.out.println("resolver-locale: " + localeResolver.resolveLocale(request).getLanguage());
		return "index";
	}
	
}
