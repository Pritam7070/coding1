package rest14.pkg1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	@GetMapping("/helloworld/test")
	public String testHello() {
		return "success";
	}

}
