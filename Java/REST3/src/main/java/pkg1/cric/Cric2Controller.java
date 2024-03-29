package pkg1.cric;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class Cric2Controller {
	@GetMapping("cric/bestbowler")
	public static String bestBowler() throws IOException{
		File f1=new File("cric_1273727.csv");
		Scanner sc1=new Scanner(f1);
		ArrayList<String> list1=new ArrayList<>();
		ArrayList<String> list2=new ArrayList<>();
		String[] arr1=new String[16];
		String s1="";
		String s2="";
		int len1;
		
		for(int i=0;i<236;i++) {
			s1=sc1.nextLine();
			arr1=s1.split(",");
			len1=arr1.length;
			if(len1==16) {
				list1.add(arr1[6]);
				list2.add(arr1[14]);
			}
		}
	
		int maxCount = 0;
        String maxOccurringElement = null;
        for (String element : list1) {
            int count = Collections.frequency(list1, element);
            if (count > maxCount) {
                maxCount = count;
                maxOccurringElement = element;
            }
        }

        s2=("The bowler that takes maximum wicket is: " + maxOccurringElement +
                ", which takes " + maxCount + " wickets.");
        return s2;
	}

}


