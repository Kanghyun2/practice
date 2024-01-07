package practice;

import java.util.Scanner;

public class HotelProgram {
	private Customer cutomers;
	private Room[][] rooms;
	private Scanner scanner;
	private HotelMangaeImpl manager;

	public HotelProgram() {
		rooms = new Room[2][5];
		scanner = new Scanner(System.in);
		manager = new HotelMangaeImpl();
		rooms = manager.Room(2, 5);
	}

	public void start() {
		while (true) {
			int input = menu();
			switch (input) {
			case 1:
				Customer ReservationCustomer = Reservation(null, null, 0);
				break;
			case 2:
				CheckRoomInfo();
				break;
			default:
				break;
			}
		}
	}

	public int menu() {
		System.out.println("1.예약 / 2. 예약 확인");
		int input = scanner.nextInt();
		scanner.nextLine();
		return input;
	}

	public Customer Reservation(String name, String number, int roomNumber) {
		System.out.println("예약할 고객 정보를 입력하세요");
		System.out.println("이름 입력");
		name = scanner.nextLine();
		System.out.println("번호 입력");
		number = scanner.nextLine();

		System.out.println("예약하실 방번호를 입력해주세요.");
		roomNumber = scanner.nextInt();

		Room room = manager.findRoomNumber(roomNumber);

		if (room != null) {
			room.setCustomers(new Customer(name, number));
			System.out.println("예약이 완료 되었습니다.");
			return room.getCustomers();
		} else {
			System.out.println("해당 방이 존재하지 않습니다.");
		}

		return null;
	}

	public void CheckRoomInfo() {
		System.out.println("고객 정보를 확인할 방번호를 입력하세요.");
		int roomCheck = scanner.nextInt();
		Customer customerInfo = manager.CheckRoomInfo(roomCheck);

		if (customerInfo != null) {
			System.out.println(roomCheck + "호 의 고객 정보 :" + customerInfo.getName() + ", " + customerInfo.getNumber());
		} else {
			System.out.println("해당 방에 예약된 고객이 없습니다.");
		}
	}
}
