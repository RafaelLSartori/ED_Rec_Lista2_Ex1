package controller;

public class Ex1 {
	public Ex1() {
		super();
	}
	
	public int soma(int n1, int n2) {
		if (n2 == 1) {
			return n1;
		} else {
			return n1 + soma(n1, n2 -1);
		}
	}
}
