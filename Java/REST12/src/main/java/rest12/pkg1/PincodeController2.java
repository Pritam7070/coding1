package rest12.pkg1;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class PincodeController2 {
	@Autowired
	PincodeRepo2 pr2;
	
	@PostMapping("/pincode2/loadfile/{fname}")
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
		
		for(int i=0;i<100;i++) {
			s1=sc1.nextLine();
			arr1=s1.split(",");
			location1=arr1[3];
			pincode1=Integer.parseInt(arr1[4]);
			district1=arr1[7];
			state1=arr1[8];
			
			PincodeEntity2 pe2=new PincodeEntity2(location1,pincode1,district1,state1);
			pr2.save(pe2);
			System.out.println(pincode1);
		}
		
		return "success";
	}
	@GetMapping("/pincode2/getLocation/{pin}")
	public String getLocation(@PathVariable int pin) {
		String result=String.valueOf(pr2.findById(pin));
		return result;
	}

}
