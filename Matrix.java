package com.top.myProject;

public class Matrix {
	
	private double[][] data;

	public Matrix(int size) {
		data = new double[size][size];
	}

	public void setData(int i, int j, double value) {
		if (i < 0 || i >= data.length || j < 0 || j >= data[0].length) {
			throw new IndexOutOfBoundsException("Индекс выходит за пределы матрицы");
		}
		data[i][j] = value;
	}

	public static Matrix createIdentityMatrix(int size) {
		Matrix matrix = new Matrix(size);
		for (int i = 0; i < size; i++) {
			matrix.data[i][i] = 1;
		}
		return matrix;
	}

	public static Matrix createZeroMatrix(int size) {
		return new Matrix(size);
	}

	public Matrix add(Matrix other) {
		if (data.length != other.data.length || data[0].length != other.data[0].length) {
			throw new RuntimeException("Матрицы должны иметь одинаковый размер");
		}
		Matrix result = new Matrix(data.length);
		for (int i = 0; i < data.length; i++) {
			for (int j = 0; j < data[0].length; j++) {
				result.data[i][j] = data[i][j] + other.data[i][j];
			}
		}
		return result;
	}

	public Matrix multiply(Matrix other) {
		if (data[0].length != other.data.length) {
			throw new RuntimeException(
					"Количество столбцов первой матрицы должно быть равно количеству строк второй матрицы");
		}
		Matrix result = new Matrix(data.length);
		for (int i = 0; i < data.length; i++) {
			for (int j = 0; j < other.data[0].length; j++) {
				for (int k = 0; k < data[0].length; k++) {
					result.data[i][j] += data[i][k] * other.data[k][j];
				}
			}
		}
		return result;
	}

	public Matrix multiply(double scalar) {
		Matrix result = new Matrix(data.length);
		for (int i = 0; i < data.length; i++) {
			for (int j = 0; j < data[0].length; j++) {
				result.data[i][j] = data[i][j] * scalar;
			}
		}
		return result;
	}

	public double determinant() {
		if (data.length != data[0].length) {
			throw new RuntimeException("Матрица должна быть квадратной");
		}
		if (data.length == 1) {
			return data[0][0];
		}
		if (data.length == 2) {
			return data[0][0] * data[1][1] - data[0][1] * data[1][0];
		}
		double det = 0;
		for (int i = 0; i < data[0].length; i++) {
			Matrix subMatrix = new Matrix(data.length - 1);
			for (int j = 1; j < data.length; j++) {
				int k = 0;
				for (int col = 0; col < data[0].length; col++) {
					if (col != i) {
						subMatrix.data[j - 1][k++] = data[j][col];
					}
				}
			}
			det += ((i % 2 == 0) ? 1 : -1) * data[0][i] * subMatrix.determinant();
		}
		return det;
	}

	public void print() {
		for (int i = 0; i < data.length; i++) {
			for (int j = 0; j < data[0].length; j++) {
				System.out.print(data[i][j] + " ");
			}
			System.out.println();
		}
	}
}