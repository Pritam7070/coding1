package rest13.pkg1;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PincodeController3 {
	@Autowired
	PincodeRepo3 pr3;
	
	@PostMapping("/pincode3/loadfile/{fname}")
	public String getFile(@PathVariable String fname) throws IOException {
		File f1=new File(fname);
		ArrayList<String> locations=new ArrayList<>();
		ArrayList<Integer> pincodes=new ArrayList<>();
		ArrayList<String> districts=new ArrayList<>();
		ArrayList<String> states=new ArrayList<>();
		Scanner sc1=new Scanner(f1);
		String s1="";
		String[] arr1=new String[8];
		s1=sc1.nextLine();
		for(int i=0;i<1000;i++) {
			s1=sc1.nextLine();
			arr1=s1.split(",");
			locations.add(arr1[3]);
			pincodes.add(Integer.parseInt(arr1[4]));
			districts.add(arr1[7]);
			states.add(arr1[8]);
			pr3.save(new PincodeEntity3(locations.get(i),pincodes.get(i),districts.get(i),states.get(i)));
		}
		return "success";
	}
	@GetMapping("/pincode3/getLocation/{pin}")
	public String getLocation(@PathVariable int pin) {
		String result=String.valueOf(pr3.findById(pin));
		return result;
	}
	

}
