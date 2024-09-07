package saven;
import java.util.Random;
import java.util.Scanner;
public class Task2 {
	public static void main(String[]args) {
		Scanner scanner=new Scanner(System.in);
		int[]list=new int[30];
		int max=Integer.MIN_VALUE;
		int min=Integer.MAX_VALUE;
		System.out.println("true?------false?");
		boolean x=scanner.nextBoolean();
		Random random=new Random();
		for (int i=0;i<list.length;i++) {
            list[i]=random.nextInt(121) - 70; 
            if(x==false){
    			if(list[i]<min){
    				min = list[i];
    			}
            }
            if(x==true) {
            	if(list[i]>max){
    				max=list[i];
    			}
            }
		}
		System.out.println("значение: " + (x? max:min));
			}
}
