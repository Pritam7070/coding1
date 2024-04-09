package pkg1;

import java.util.ArrayList;

public class P1 {
	public static void divideByN(int num1){
		int[] arr1= {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
		ArrayList<Integer> list1=new ArrayList<>();
		for(int i=0;i<arr1.length;i++) {
			if(arr1[i]%num1==0) {
				list1.add(arr1[i]);
			}
		}
		System.out.println(list1);
	}

	public static void main(String[] args) {
		divideByN(4);
		divideByN(3);
	}

}
