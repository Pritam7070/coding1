package rest11.pkg1;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PincodeController1 {
	@Autowired
	PincodeRepo1 pr1;
	
	@PostMapping("/pincode/loadfile/{fname}")
	public String loadFile(@PathVariable String fname) throws IOException {
		
		File f1=new File(fname);
		Scanner sc1=new Scanner(f1);
		String location1="";
		int pincode1=0;
		String district1="";
		String state1="";
		String[] arr1=new String[8];
		String s1="";
		s1=sc1.nextLine();
		
		for(int i=0;i<100000;i++) {
			s1=sc1.nextLine();
			arr1=s1.split(",");
			location1=arr1[3];
			pincode1=Integer.parseInt(arr1[4]);
			district1=arr1[7];
			state1=arr1[8];
			
			PincodeEntity1 pe1=new PincodeEntity1(location1,pincode1,district1,state1);
			pr1.save(pe1); 
		}
		
		return "success";
	}
	@GetMapping("/pincode/getLocation/{pin}")
	public String getLocation(@PathVariable int pin) {
		String result=String.valueOf(pr1.findById(pin));
		return result;
	}

}
