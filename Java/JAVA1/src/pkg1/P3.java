package pkg1;
import java.util.ArrayList;
public class P3 {
	public static void divideByN(int[] arr1,int num1) {
		ArrayList<Integer> list1=new ArrayList<>();
		ArrayList<Integer> list2=new ArrayList<>();
		for(int i=0;i<arr1.length;i++) {
			list1.add(arr1[i]);
			if(arr1[i]%num1==0) {
				list2.add(arr1[i]);
			}	
		}
		System.out.println(list1);
		System.out.println(list2);
	}

	public static void main(String[] args) {
		int[] arr1= {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
		divideByN(arr1,4);
		divideByN(arr1,5);
		
	}
}