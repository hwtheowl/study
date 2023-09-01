class A2Cal {
	int v1, v2;
	A2Cal(int v1, int v2) {
		System.out.println("Cal init!!");
		this.v1 = v1; this.v2 = v2;
	}
	public int sum() {return this.v1+v2;}
}
class A2Cal3 extends A2Cal{
	A2Cal3(int v1, int v2) {
		super(v1, v2);
		System.out.println("Cal3 init!!");
	}
	public int minus() {return this.v1-v2;}
}
public class InheritanceApp2 {
	public static void main(String[] args) {
		A2Cal c = new A2Cal(2,1);
		A2Cal3 c3 = new A2Cal3(2, 1);
		System.out.println(c3.sum()); // 3
		System.out.println(c3.minus()); // 1
	}
}