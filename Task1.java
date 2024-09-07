package saven;

public class Task1 {
	public static void main(String[] args) {
		int[] list = {0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377};
		for(int i = 0;i<list.length;i++) {
			if(list[i] % 2 == 0) {
				System.out.println(list[i]);
			}
		}
	}

}
