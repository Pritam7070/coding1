package pkg1.cric;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class Cric1Controller {
	@GetMapping("cric/bestbatsman")
	public static String findBestBatsman() throws IOException {
		File f1=new File("cric_1273727.csv");
		Scanner sc1=new Scanner(f1);
		ArrayList<String> list1=new ArrayList<>();
		ArrayList<Integer> list2=new ArrayList<>();
		ArrayList<String> list3=new ArrayList<>();
		String[] arr1;
		int[] arr3=new int[22];
		String s1="";
		String s2="";
		String name1="";
		String bestBatsman="";
		int total1=0;
		int maxRuns=0;
		
		for(int i=0;i<71;i++) {
			s1=sc1.nextLine();
			if (i >= 22 && i < 43) {
				arr1=s1.split(",");
				list3.add(arr1[3]);
			}
		}
		
		for(int i=0;i<230;i++) {
			s1=sc1.nextLine();
			arr1=s1.split(",");
			list1.add(arr1[4]);
			list2.add(Integer.parseInt(arr1[7]));
		}
	
		for(int j=0;j<list3.size();j++) {
			total1=0;
			name1=list3.get(j);
			for(int i=0;i<list1.size();i++) {
				if(list1.get(i).equals(name1)) {
					total1=total1+list2.get(i);
				}
				arr3[j]=total1;
			}
		}
		for(int i=0;i<list3.size();i++) {
			if(arr3[i]>maxRuns) {
				maxRuns=arr3[i];
				bestBatsman=list3.get(i);
			}
		}
		s2=("Best batsman is :"+bestBatsman+" with runs "+maxRuns);	
		return s2;
	}

}
