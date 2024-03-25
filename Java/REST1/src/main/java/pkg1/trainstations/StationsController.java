package pkg1.trainstations;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class StationsController {
	@GetMapping("stations/get")
	public String getAllStations() {
		return "Bhubaneswar,BBSR";
	}

}
