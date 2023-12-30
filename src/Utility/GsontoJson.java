package Utility;

import Model.TravelDTO;
import com.google.gson.Gson;

import java.io.FileWriter;
import java.io.IOException;

public class GsontoJson {
    Gson gson;
    public GsontoJson () {
        gson = new Gson();
    }
    public void TraveltoJson (TravelDTO travel) {
        try(FileWriter writer = new FileWriter("travel_1.json")) {
            gson.toJson(travel, writer);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
