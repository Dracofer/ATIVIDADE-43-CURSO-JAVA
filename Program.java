package application;

import java.util.Scanner;
import java.util.Locale;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
    Locale.setDefault(Locale.US);
		
		int n = sc.nextInt();
		int[][] mat = new int[n][n];
		
		for (int i=0; i<mat.length; i++) {
			for (int x=0; x<mat[i].length; x++) {
				mat[i][x] = sc.nextInt();
			}
		}
		
		System.out.println("Main diagonal:");
		for (int i=0; i<mat.length; i++) {
			System.out.print(mat[i][i] + " ");
		}
		System.out.println();
		
		int count = 0;
		for (int i=0; i<mat.length; i++) {
			for (int x=0; x<mat[i].length; x++) {
				if (mat[i][x] < 0) {
					count++;
				}
			}
		}
		System.out.println("Negative numbers = " + count);
		
		
		sc.close();
	}
}
