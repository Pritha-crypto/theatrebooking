package com.TheatreBooking;



public class FareCalculation {

static int fare; static float fare_gst;
	public static void main(String[] args) {
		
	}
	
	
	public static boolean checkCorrectseat(String seatChoice) {
		
		String[] seatTypes = new String[3];
		seatTypes[0] = "Diamond";
		seatTypes[1] = "Gold";
		seatTypes[2] = "Silver";
		boolean valid = false;
		for(String type : seatTypes) {
			if(type.equalsIgnoreCase(seatChoice)) {  //searching whether the entered cabchoice is in our listed cab array //
				valid = true;
				break;
		}
		}
		return valid;
	}
	public static int ticketfare(String seatChoice,int seat) {
		
		if(seatChoice.equalsIgnoreCase("Diamond")) {
		 fare = 1000 * seat;
			
		}
		if(seatChoice.equalsIgnoreCase("Gold")) {
		  fare = 500 * seat;
				
			}
		if(seatChoice.equalsIgnoreCase("Silver")) {
			 fare = 200 * seat;
				
				
			}

		return fare;
		
		
	}
	
		public static float Gst() {
			System.out.println(".............GST = 7%...........");
			fare_gst =(fare * 7)/100 + fare;
			System.out.println(fare_gst);
			
			return fare_gst;
			
       }


}