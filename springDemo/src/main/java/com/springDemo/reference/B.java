package com.springDemo.reference;

public class B {
	private int y;

	// constructers
	public B(int y) {
		super();
		this.y = y;
	}

	public B() {
		super();
		// TODO Auto-generated constructor stub
	}

	// getters setters
	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	@Override
	public String toString() {
		return "B [y=" + y + "]";
	}

}
