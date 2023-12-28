package View;

import Model.ItineraryDTO;
import Model.TripDTO;

import java.util.Scanner;

public class ConsoleView {
    Scanner scanner = new Scanner(System.in);
    public ConsoleView() {
    }

    public int InputNumber() {
        System.out.println("============ 메뉴 리스트 ============");
        System.out.println("1.여행기록 2.여정기록 3.여행조회 4.여정조회 5.종료");
        System.out.print("시작할 메뉴 번호를 입력하세요 : ");

        int menu = scanner.nextInt();

        if (menu >= 1 && menu <= 5) {
            return menu;
        }

        return -1;
    }

    public void printTrip(TripDTO trip) {
        // TODO JSON 파일에서 가져와서 출력
    }

    public void printIninerary(ItineraryDTO itinerary) {
        // TODO JSON 파일에서 가져와서 출력
    }
}