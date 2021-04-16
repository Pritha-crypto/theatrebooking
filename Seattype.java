package com.TheatreBooking;

import java.util.Arrays;

public class Seattype {

	public static void main(String[] args) {
		
	}
	public static void seatType() {
			String[] seatTypes = new String[3];
			seatTypes[0] = "Diamond";
			seatTypes[1] = "Gold";
			seatTypes[2] = "Silver";
			System.out.println("choose one from the listed seattypes:");
			Arrays.toString(seatTypes);
			System.out.println("No.of.seat Types:" + seatTypes.length);
			//for array print
			for(int i=0;i<seatTypes.length;i++) {
				String cType = seatTypes[i];
				System.out.println(cType);
			}

	}
	

}
