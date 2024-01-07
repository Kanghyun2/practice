package practice;

public class HotelMangaeImpl implements HotelManage {
	private Room[][] rooms;
	private Customer customers;

	@Override
	public Room[][] Room(int floor, int floorRoom) { // 방 초기화
		rooms = new Room[floor][floorRoom];

		for (int i = 0; i < floor; i++) {
			for (int j = 0; j < floorRoom; j++) {
				rooms[i][j] = new Room(calculateRoomNumber(i + 1, j + 1), 0, null); // 0 = state , null = Customer 값
			}
		}
		return rooms;
	}

	public int calculateRoomNumber(int floor, int floorRoom) { // 방호수

		return floor * 100 + floorRoom;

	}

	@Override
	public Room findCustomer(String name, String number) {

		return null;
	}

	@Override
	public Room findRoomNumber(int roomNumber) { 
		for (int i = 0; i < rooms.length; i++) {
			for (int j = 0; j < rooms[i].length; j++) {
				if (rooms[i][j].getRoomNum() == roomNumber) {
					return rooms[i][j];
				}
			}
		}
		return null;
	}

	@Override
	public Customer CheckRoomInfo(int roomNumber) { // 고객정보 집어넣을
		for (int i = 0; i < rooms.length; i++) {
			for (int j = 0; j < rooms[i].length; j++) {
				if (rooms[i][j].getRoomNum() == roomNumber) {
					return rooms[i][j].getCustomers();
				}
			}
		}
		return null;
	}

}
