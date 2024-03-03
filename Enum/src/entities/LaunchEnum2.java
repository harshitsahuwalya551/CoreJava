package entities;
enum Results{
	PASS,FAIL,NR;
	int marks;
	
	private Results() {
		System.out.println("construcor is getting called");
	}
	
	void setMarks(int marks) {
		this.marks = marks;
	}
	int getMarks() {
		return marks;
	}
}

public class LaunchEnum2 {
	public static void main(String[] args) {
		Results.PASS.setMarks(10);
		int result = Results.PASS.getMarks();
		System.out.println(result);
	}
}
