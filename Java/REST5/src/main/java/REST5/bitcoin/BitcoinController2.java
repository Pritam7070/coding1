package REST5.bitcoin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class BitcoinController2 {
	@Autowired
	BitcoinRepo2 br2;
	
	@PostMapping("/bitcoin2/adddata")
	public String adddata(@RequestBody BitcoinEntity2 be2) {
		br2.save(be2);
		return "success";
	}

}
