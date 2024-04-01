package pkg1.bitcoin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class BitcoinController {
	@Autowired
	BitcoinRepo br;
	
	@PostMapping("/bitcoin/adddata")
	public String addData(@RequestBody BitcoinEntity be) {
		br.save(be);
		return "success";
	}

}
