package com.springDemo.Constructor_Injection;

public class Addition {
	private int a;
	private int b;

	public Addition(double a, double b) {
		this.a = (int) a;
		this.b = (int) b;
		System.out.println("double, double constructer called.");
	}

	public Addition(int a, int b) {
		this.a = a;
		this.b = b;
		System.out.println("int, int constructer called.");
	}

	public Addition(String a, String b) {
		this.a = Integer.parseInt(a);
		this.b = Integer.parseInt(b);
		System.out.println("string, string constructer called.");
	}

	public void doSum() {
		System.out.println("a : " + this.a);
		System.out.println("b : " + this.b);
		System.out.println("Addition : " + (this.a + this.b));
	}
}
