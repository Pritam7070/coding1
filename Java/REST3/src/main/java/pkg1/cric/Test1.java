package pkg1.cric;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Test1 {

	public static void main(String[] args) {
		String[] arr1= {"cat","rat","bat","cat","rat","cat"};
		ArrayList<String> list1=new ArrayList<>();
		//Set<String> set1=new HashSet<String>();
		for(int i=0;i<6;i++) {
			list1.add(arr1[i]);
		}
		System.out.println(list1);
		Set<String> set1=new HashSet<String>(list1);
		System.out.println(set1);
		List<String> list2=new ArrayList<String>(set1);
		System.out.println(list2);
	}

}
