package BusReservation;

import java.util.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Booking {
	String PassengerName;
	int BusNo;
	Date date;

	@SuppressWarnings({ "unused", "resource" })
	Booking() {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the Name of the Passenger: ");
		PassengerName = scn.next();
		System.out.println("Enter the BusNo: ");
		BusNo = scn.nextInt();
		System.out.println("Enter the Date dd-mm-yyyy ");
		String dateInput = scn.next();
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
		try {
			date = dateFormat.parse(dateInput);
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}

	public void isAvailable (ArrayList<Booking> bookings, ArrayList<Bus> buses) {
		int capacity = 0;
		for (Bus bus : buses) {
		}
	}
}
