package Controller;

import Model.TravelDTO;
import Service.TravelService;
import Utility.GsontoJson;
import View.ConsoleView;

public class TravelController {
    public TravelController() {
    }
    public void applicationStart() {
        TravelService service = new TravelService();
        ConsoleView view = new ConsoleView();
        GsontoJson gsontoJson = new GsontoJson();

        while(true) {
            int menu = view.InputMenu();
            TravelDTO travel;
            switch(menu) {
                case 1 :
                    travel = view.InputTravel();
                    break;
                case 2 :

                    break;
                case 3 :

                    break;
                case 4 :

                    break;
                case 5 :
                    break;

            }
        }
    }
}
