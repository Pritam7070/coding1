package pkg1.trainstations;

import java.io.File;
import java.util.Scanner;
import java.io.IOException;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class StationsController2 {
	@GetMapping("stations/get")
	public String getAllStations() throws IOException{
		File f1=new File("railwaystations.txt");
		Scanner sc1=new Scanner(f1);
		String s1="";
		String s2="";
		for(int i=0;i<10;i++) {
			s1=sc1.nextLine();
			s2=s2+s1+"\n";
		}
		return s2;
	}
	
}