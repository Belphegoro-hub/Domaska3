package saven;
import java.util.Scanner;
public class Task3 {
	public static void main(String[]args) {
		Scanner scanner=new Scanner(System.in);
		int[] list=new int[3];
		int value1=scanner.nextInt();
		int value2=scanner.nextInt();
		int value3=scanner.nextInt();
		list[0]=value1;
		list[1]=value2;
		list[2]=value3;
		if(value1==value2&&value2==value3&&value3==value1){
			System.out.print("Yes "+ value1 +" = "+ value2  +" = "+ value3);
		}else
			System.out.print("No");
	}

}
