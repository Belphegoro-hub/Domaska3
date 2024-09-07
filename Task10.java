package saven;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;
public class Task10{
	public static void main(String[]args){
		Scanner scanner=new Scanner(System.in);
		Random random=new Random();
		
		int n=scanner.nextInt();
		int[]list=new int[n];
		int index = -1;
		int[]list2=new int[n];
		
		for(int i=0;i<n;i++){
			list[i] = random.nextInt(34);
			list2[i] = -1;
			}
		for(int i=1;i<list.length -1;i++) {
			if(list[i] %list[i -1] == 0 && list[i] % list[i+1]==0) {
				list2[i] = i;
			}
		}
		System.out.println(Arrays.toString(list));
		System.out.println(Arrays.toString(list2));
		
	}
}
