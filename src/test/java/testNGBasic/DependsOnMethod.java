package testNGBasic;


import org.testng.annotations.Test;



public class DependsOnMethod {
	
	@Test(enabled = true)
	public void highSchool(){
	System.out.println("high school");	
	}
	
	@Test(dependsOnMethods = "highSchool")
	public void highSecSchool(){
		System.out.println("high sec school");
	}
	@Test(dependsOnMethods = "highSecSchool")
	public void engineering() {
		System.out.println("engineering college");
		
	}
}
