package BusReservation;

public class Bus {
	private int BusNo;
	private boolean ac;
	private int Capacity;

	public int getBusno() {
		return BusNo;
	}

	public boolean isAc() {
		return ac;
	}

	public void setAc(boolean ac) {
		this.ac = ac;
	}

	public int getCapacity() {
		return Capacity;
	}

	public void setCapacity(int capacity) {
		Capacity = capacity;
	}

	Bus(int no, boolean ac, int capacity) {
		this.BusNo = no;
		this.ac = ac;
		this.Capacity = capacity;
	}

	public void displayBusInfo() {
		System.out.println("Bus No : " + BusNo + "AC : " + ac + "Total Capacity : "+ Capacity);

	}

}
