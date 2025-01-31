class Op{
	int n1;
	int n2;
	Op(int n1,int n2){
		this.n1 = n1;
		this.n2 = n2;
	}
	public void sum() {
		System.out.println("the sum is" +( n1+n2));
	}
	public void difference() {
		System.out.println("the difference "+(n1-n2));
	}
	public void product() {
		System.out.println(n1*n2);
	}
	public void devide() {
		if(n2==0) {
			System.out.println("division by 0 is not possible");
			return;
		}
		System.out.println((n1/n2) +" is the quotient and \n"+ (n1%n2) +" is the remainder");
	}
	
}

public class calculator {

	public static void main(String[] args) {

		Op o1 = new Op(2, 3);
		o1.sum();
		o1.difference();
		o1.product();
		o1.devide();
		Op o2 = new Op(8, 0);
		o2.sum();
		o2.difference();
		o2.product();
		o2.devide();
			
	}

}
