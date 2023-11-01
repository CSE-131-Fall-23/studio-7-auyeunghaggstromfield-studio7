package studio7;

import java.util.Scanner;

import assignment6.maxpath.gui.MaxPathLengthDebugAppFrame;

public class Rectangle {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Input length");
		int xlength = in.nextInt();
		
		System.out.print("Input width ");
		int ywidth = in.nextInt();
		
		Rectangle rect = new Rectangle(xlength,ywidth);
		int area = rect.area();
		System.out.println(area);
		
		int perimeter = rect.perimeter();
		System.out.println(perimeter);
		
	}
	
	private static int length;
	private static int width;
	public Rectangle(int length, int width) {
		this.length = length;
		this.width = width;
		
	}
	public static int getLength() {
		return length;
	}
	public static int getWidth() {
		return width;
	}
	public static int area() {
		return length * width;
	}
	
	public static int perimeter() {
		return 2*length + 2* width;
	}
}
