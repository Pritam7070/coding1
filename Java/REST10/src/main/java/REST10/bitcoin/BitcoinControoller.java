package REST10.bitcoin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BitcoinControoller {
	@Autowired
	BitcoinRepo ber;
	
	@PostMapping("/bitcoin/data")
	public String getData(@RequestBody BitcoinEntity be) {
		ber.save(be);
		return "Success";
	}

}
