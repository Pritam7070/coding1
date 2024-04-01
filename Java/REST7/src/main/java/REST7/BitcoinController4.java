package REST7;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BitcoinController4 {
	@Autowired
	BitcoinRepo4 brr4;
	
	@PostMapping("/bitcoin4/adddata")
	public String getData(@RequestBody BitcoinEntity4 be4) {
		brr4.save(be4);
		return "successfull";
	}

}
