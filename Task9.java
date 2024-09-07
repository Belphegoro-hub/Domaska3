package saven;
import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;
public class Task9 {
	public static void main(String[] args){
		Scanner scanner=new Scanner(System.in);
		Random random=new Random();
		
		int n=scanner.nextInt();
		int[]list=new int[n];
		int[]list2=new int[n];
		
		for(int i=0;i<n;i++){
			list[i]=random.nextInt(n+2)-2;
			list2[i]=list[i];
			if(list2[i]<0) {
				list2[i]=list2[i]*list2[i];
			}
		}
		System.out.println(Arrays.toString(list));
		System.out.println(Arrays.toString(list2));
	}
}
