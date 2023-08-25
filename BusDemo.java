package BusReservation;

import java.util.Scanner;
import java.util.ArrayList;

public class BusDemo {
	@SuppressWarnings("resource")
	public static void main(String[] args) {

		ArrayList<Bus> buses = new ArrayList<Bus>();
		buses.add(new Bus(1, true, 50));
		buses.add(new Bus(2, false, 43));
		buses.add(new Bus(3, true, 25));

		ArrayList<Booking> bookings = new ArrayList<Booking>();

		int useroption = 1;
		Scanner scn = new Scanner(System.in);

		for (Bus b : buses) {
			b.displayBusInfo();
		}

		while (useroption == 1) {
			System.out.println("Enter 1 to Book And 2 to Exit");
			useroption = scn.nextInt();
			if (useroption == 1) {
				Booking booking = new Booking();
				if(booking.isAvailable (bookings,buses)) {
					bookings.add(booking);
					System.out.println("Your Booking Is Confirmed");
				}
				else
					System.out.println("Sorry.Bus is Full");
			}
		}
	}
}
