package com.top.myProject;
import java.util.Arrays;
import java.util.Random;

public class Sorting {
	public static void main(String[] args) {
		Random random = new Random();
		String[] list = arrayRandom(10);
		
		
		arraySorting(list);
		arraySorting2(list);
		arraySorting3(list);
	}
	public static String[] arrayRandom(int size){
	    String[] list = {"машина", "дом", "дерево", "автомобиль", "компьютер", "телефон", "книга", "стол", 
	            "стул", "дверь", "окно", "стена", "пол", "потолок", "ковер", "диван", "раковина",
	            "кресло", "лампа", "телевизор", "холодильник", "плита", "душ", "ванна",  "зеркало"};
	    String[] words = new String[size];
	    Random random = new Random();
	    for (int i = 0; i < size; i++) {
            words[i] = list[(int) (Math.random() * list.length)];
        }
	    return words;
	}
	public static void arraySorting(String[] array){
		for(String i : array) {
			System.out.print(i+" ");
		}
		System.out.println();
	}
	public static void arraySorting2(String[] array){
		Arrays.sort(array);
		for(String i : array) {
			System.out.print(i+" ");
		}
		System.out.println();
	}
	public static void arraySorting3(String[] array){
		Arrays.sort(array,(a,d) -> Integer.compare(a.length(),d.length()));
		for(String i : array) {
			System.out.print(i+" ");
		}
		System.out.println();
	}
}