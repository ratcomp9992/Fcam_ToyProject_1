package View;

import Model.ItineraryDTO;
import Model.TravelDTO;

import java.util.Scanner;

public class ConsoleView {
    Scanner scanner = new Scanner(System.in);
    public ConsoleView() {
    }

    public int InputMenu() {
        System.out.println("============ 메뉴 리스트 ============");
        System.out.println("1.여행기록 2.여정기록 3.여행조회 4.여정조회 5.종료");
        System.out.print("시작할 메뉴 번호를 입력하세요 : ");

        int menu = scanner.nextInt();

        if (menu >= 1 && menu <= 5) {
            return menu;
        }

        System.out.println("올바른 메뉴 번호를 입력해 주세요.");
        return -1;
    }

    public TravelDTO InputTravel() {
        // TODO View에서 Model객체를 생성하는게 맞는가

        System.out.print("\n여행 제목을 입력하세요:");
        String travel_name = scanner.nextLine();
        System.out.print("여행 시작일을 입력하세요:");
        String start_date = scanner.nextLine();
        System.out.print("여행 종료일을 입력하세요:");
        String end_date = scanner.nextLine();

        return new TravelDTO(travel_name, start_date, end_date);
    }
    public void printTrip(TravelDTO trip) {
        // TODO JSON 파일에서 가져와서 출력
    }

    public void printIninerary(ItineraryDTO itinerary) {
        // TODO JSON 파일에서 가져와서 출력
    }
}