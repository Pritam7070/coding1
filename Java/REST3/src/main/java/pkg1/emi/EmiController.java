package pkg1.emi;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class EmiController {
	@GetMapping("/emi/test1")
	public double calcEMI() {
		int p=1000;
		int t=2;
		double r=8.0;
		double si=p*t*r/100;
		double amt=p+si;
		int months=t*12;
		double emi=amt/months;
		return emi;
	}
	@PostMapping("/emi/calc1")
	public double calcEMI2(@RequestBody EmiEntity ee) {
		int p1=ee.getP();
		int t1=ee.getT();
		double r1=ee.getR();
		double si1=p1*t1*r1/100;
		int months1=t1*12;
		double amt1=p1+si1;
		double emi1=amt1/months1;
		return emi1;
		}
	@GetMapping("/emi/file/carloan1.txt")
	public String calcEMI3() throws IOException {
		File f1=new File("carloan1.txt");
		Scanner sc1=new Scanner(f1);
		String s1="";
		String s2="";
		String[] arr1;
		String name2;
		int p2,t2,months2;
		double r2,si2,amt2,emi2;
		for(int i=0;i<3;i++) {
			s1=sc1.nextLine();
			arr1=s1.split(",");
			name2=arr1[0];
			p2=Integer.parseInt(arr1[2]);
			t2=Integer.parseInt(arr1[3]);
			r2=Double.parseDouble(arr1[4]);
			si2=p2*t2*r2/100;
			months2=t2*12;
			amt2=p2+si2;
			emi2=amt2/months2;
			s2=s2+name2+","+String.valueOf(emi2)+"\n";
		}
		
		return s2;
	}
		
}
