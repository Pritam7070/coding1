package REST8.bitcoin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BitcoinController8 {
	@Autowired
	BitcoinRepo8 br8;
	
	@PostMapping("/bitcoins/data")
	public String getData(@RequestBody BitcoinEntity be) {
		br8.save(be);
		return "sucessfully integrated";
	}
	

}
