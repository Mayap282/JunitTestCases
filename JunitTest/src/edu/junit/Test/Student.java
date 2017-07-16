package edu.junit.Test;

public class Student {

	private String name;
	private int roll_no;
	String gender;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRoll_no() {
		return roll_no;
	}
	public void setRoll_no(int roll_no) {
		this.roll_no = roll_no;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public float CalculateFees(float tutionfee,float service){
		float fees = tutionfee;
		
		if(gender.equalsIgnoreCase("male")){
			 fees = tutionfee ;
			
		}else{
			fees = tutionfee/2  + ((tutionfee/2)*service)/100; 
		}
		
		
		return fees;
		
	}
}
