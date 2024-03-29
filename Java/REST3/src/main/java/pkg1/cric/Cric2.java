package pkg1.cric;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Cric2 {

	public static void main(String[] args) throws IOException {
		File f1=new File("cric_1273727.csv");
		Scanner sc1=new Scanner(f1);
		ArrayList<String> list1=new ArrayList<>();
		ArrayList<String> list2=new ArrayList<>();
		String[] arr1=new String[16];
		String s1="";
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

        System.out.println("The bowler that takes maximum wicket is: " + maxOccurringElement +
                ", which takes " + maxCount + " wickets.");
	}

}
