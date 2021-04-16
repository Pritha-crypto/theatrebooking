package com.TheatreBooking;

public class Mbe_pwd_Check {

	public static void main(String[] args) {
		//NumberCheck obj = new NumberCheck();
		

	}
	// check mobile no is equal to 10 
	// if it is 10, return true
	// is if its not 10 or null or -ve no , return false
	
	public static boolean checkmobileNo(Long mobileNo, int length_mbe) {
		boolean valid = true;
		String mbe_string = Long.toString(mobileNo);
		if(mbe_string.length()==length_mbe) {
			valid = true;
		}
		if(mbe_string.length()!=length_mbe || mbe_string.equals("") || mbe_string.length() < 0) {
		    valid = false;	
		}	
		return valid;
		
	}
	public static boolean checkLength(String pwd, int length_pwd) {
		boolean valid = true;
		if(pwd.length()>=length_pwd) {
			valid = true;
		}
		if(pwd.length()<length_pwd || pwd.equals("") ) {
			valid = false;
		}
		return valid;
	

}
}
