package practice;

public interface HotelManage {
	
	// 룸 접근
	Room[][] Room(int floor, int floorRoom);
	// 고객 찾기
	Room findCustomer(String name, String number);
	// 방 접근 빈 방 체크
	Room findRoomNumber(int roomNumber);
	// 방 접근 예약 고객 정보 확인
	Customer CheckRoomInfo (int roomNumber);
}
