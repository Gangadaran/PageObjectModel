package collections;

public class Learnstatic {
	
	static int  a =10;
	int b = 15;
	
	public static void incre() {
       a =a+1;
	}
	 public void dec() {
		b=b-1;

	}
	 
	 public static void main(String[] args) {
		Learnstatic obj = new Learnstatic();
	   System.out.println(obj.b);
	   
	}

}
