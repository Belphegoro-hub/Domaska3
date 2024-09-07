package saven;
import java.util.Arrays;
import java.util.Random;
public class Task5 {
	public static void main(String[] args){
        Random random=new Random();

        int[]list=new int[10];
        int[]counts=new int[21]; 

        for(int i=0;i<list.length;i++){
        	list[i]=random.nextInt(21)-11; 
        }
        for(int i=0;i<list.length;i++){
            int num=list[i];
            if (num>=-10&&num<=10){
                counts[num + 10]++;  
            }
        }
        for(int i=0;i<counts.length;i++){
            if(counts[i]>0){
                System.out.println(i +" – "+counts[i]+" раз");
            }
        }
    }
}
