package REST6.bitcoin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BitcoinController3 {
	@Autowired
	BitcoinRepo3 br3;
	
	@PostMapping("/bitcoin3/adddata")
	public String getData(@RequestBody BitcoinEntity3 be3) {
		br3.save(be3);
		return "successfully retrieve";
	}

}
