package letCodePractice;

public class ThisClass {
	int a=8;
	
	
	public void thimethod() {
	
		int b= 7;
		int a;
		System.out.println(b+this.a);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThisClass tc= new ThisClass();
		tc.thimethod();
		//this.a;
			
		}
	}


