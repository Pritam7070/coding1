package rest15.pkg1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Goodmorning1 {
	@GetMapping("/goodmorning/test1")
	public String testGoodmorning() {
	return "successful";
	}
}
