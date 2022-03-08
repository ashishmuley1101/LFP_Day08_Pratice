package com.bridgelabz.linecomparison;

import java.text.DecimalFormat;
import java.util.Scanner;

public class LineComparison {

	public double calLength(int x1,int x2, int y1, int y2) {
		
		double length = Math.sqrt(Math.pow((x2-x1), 2) + Math.pow((y2-y1),2));
		
		return length;
	}
	public static void main(String[] args) {
		
		DecimalFormat df = new DecimalFormat("##.00");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the point : x1");
		int x1 = sc.nextInt();
		System.out.println("Enter the point : x2");
		int x2 = sc.nextInt();
		System.out.println("Enter the point : y1");
		int y1 = sc.nextInt();
		System.out.println("Enter the point : y2");
		int y2 = sc.nextInt();
		
		LineComparison lineComp = new LineComparison();	
		String length1 = df.format(lineComp.calLength(x1, x2, y1, y2));
		System.out.println("Length of Line : " + length1);
	}
}
