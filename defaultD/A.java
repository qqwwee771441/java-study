package packageA;

public class A {
	private A1 a1 = new A1();
	A2 a2 = new A2();
	protected A3 a3 = new A3();
	
	public A() {
		a1.setNum(0);
		a2.setNum(0);
		a3.setNum(0);
	}
	public void setAn(int a1, int a2, int a3) {
		(this.a1).setNum(a1);
		(this.a2).setNum(a2);
		(this.a3).setNum(a3);
	}
	public int getA1() { return a1.getNum(); }
	public int getA2() { return a2.getNum(); }
	public int getA3() { return a3.getNum(); }
}

class A1 {
	private int num;
	public A1() { num=0; }
	public A1(int num) { this.num = num; }
	public void setNum(int num) { this.num = num; }
	public int getNum() { return this.num; }
}

class A2 {
	private int num;
	public A2() { num=0; }
	public A2(int num) { this.num = num; }
	public void setNum(int num) { this.num = num; }
	public int getNum() { return this.num; }
}

class A3 {
	private int num;
	public A3() { num=0; }
	public A3(int num) { this.num = num; }
	public void setNum(int num) { this.num = num; }
	public int getNum() { return this.num; }
}
