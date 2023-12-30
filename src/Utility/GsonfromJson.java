package Utility;

import Model.TravelDTO;
import com.google.gson.Gson;

import java.io.FileReader;
import java.io.IOException;

public class GsonfromJson {
    Gson gson;
    public GsonfromJson () {
        gson = new Gson();
    }
    public TravelDTO TravelfromJson () {
        try(FileReader reader = new FileReader("travel_1.json")) {
            return gson.fromJson(reader, TravelDTO.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
