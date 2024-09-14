package com.top.myProject;

public class perMethods {
	public static void main(String[] args) {
		
		int[] list = {1,2,3,4,5};
		String[] listString = {"Алиса","Настя","Маша"};
		int[][] list2D = {{5,6,3,2},{2,3,1,8}};
		String[][] list2dString = {{"Костя ","Антон ","Гена "},{"Виктор ","Пётр ","Владимир "}};
		
		
		arrayPrint(list);
		arrayPrint(listString);
		arrayPrint(list2D);
		arrayPrint(list2dString);
	}
	public static void arrayPrint(int[] array) {
		for(int i : array) {
			System.out.print(i+ " ");
		}
		System.out.println();
	}
	public static void arrayPrint(String[] array) {
		for(String j : array) {
			System.out.print(j+ " ");
		}
		System.out.println();
	}
	public static void arrayPrint(int[][] array) {
	    for (int[] row : array) {
	        for (int i : row) {
	            System.out.print(i);
	        }
	        System.out.println(); 
	    }
	}

	public static void arrayPrint(String[][] array) {
	    for (String[] niw : array) {
	        for (String j : niw) {
	            System.out.print(j);
	        }
	        System.out.println();
	    }
	}
}
