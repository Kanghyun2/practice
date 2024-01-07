package practice;

public class Room {
	private int roomNum;
	private int state;
	private Customer customers;
	public Room(int roomNum, int state, Customer customers) {
		super();
		this.roomNum = roomNum;
		this.state = state;
		this.customers = customers;
	}
	public int getRoomNum() {
		return roomNum;
	}
	public void setRoomNum(int roomNum) {
		this.roomNum = roomNum;
	}
	public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
	}
	public Customer getCustomers() {
		return customers;
	}
	public void setCustomers(Customer customers) {
		this.customers = customers;
	}
}
