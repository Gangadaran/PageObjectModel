package Encapulation;

public class EmployeeData extends ProtectedClass {

	private int ssn;
	private String empName;
	private int empNum;
	
	public int getssn() {
		return ssn;
	}
	public int setssn(int ssn) {
		this.ssn=ssn;
		return ssn;
	}
	public static void main(String[] args) {
		EmployeeData emp = new EmployeeData();
		emp.setssn(32434);
		System.out.println(emp.getssn());
		
		ProtectedClass obj = new ProtectedClass();
		int a2 = obj.a;
		
		
	}
}
