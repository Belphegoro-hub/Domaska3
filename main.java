package com.top.myProject;

public class main {
	    public static void main(String[] args) {
	    	 Matrix matrix1 = new Matrix(3);
	         matrix1.setData(0, 0, 1);
	         matrix1.setData(0, 1, 2);
	         matrix1.setData(0, 2, 3);
	         matrix1.setData(1, 0, 4);
	         matrix1.setData(1, 1, 5);
	         matrix1.setData(1, 2, 6);
	         matrix1.setData(2, 0, 7);
	         matrix1.setData(2, 1, 8);
	         matrix1.setData(2, 2, 9);

	        System.out.println("Исходная матрица:");
	        matrix1.print();

	        Matrix identityMatrix = Matrix.createIdentityMatrix(3);
	        System.out.println("Единичная матрица:");
	        identityMatrix.print();

	        Matrix zeroMatrix = Matrix.createZeroMatrix(3);
	        System.out.println("Нулевая матрица:");
	        zeroMatrix.print();

	        Matrix sumMatrix = matrix1.add(matrix1);
	        System.out.println("Сумма матриц:");
	        sumMatrix.print();

	        Matrix productMatrix = matrix1.multiply(matrix1);
	        System.out.println("Произведение матриц:");
	        productMatrix.print();

	        Matrix scalarMatrix = matrix1.multiply(2);
	        System.out.println("Умножение матрицы на скаляр:");
	        scalarMatrix.print();

	        double determinant = matrix1.determinant();
	        System.out.println("Детерминант матрицы: " + determinant);
	    }
	}