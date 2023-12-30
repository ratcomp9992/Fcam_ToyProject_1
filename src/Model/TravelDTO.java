package Model;

public class TravelDTO {
    private int travel_id;
    private final String travel_name;
    private final String start_date;
    private final String end_date;

    private ItineraryDTO[] itineraries;
    // TODO ArrayList?

    public TravelDTO(String travel_name, String start_date, String end_date) {
        this.travel_name = travel_name;
        this.start_date = start_date;
        this.end_date = end_date;
    }

    public int getTrip_id() {
        return travel_id;
    }

    public void setTrip_id(int travel_id) {
        this.travel_id = travel_id;
    }

    public String getTrip_name() {
        return travel_name;
    }

    public String getStart_date() {
        return start_date;
    }

    public String getEnd_date() {
        return end_date;
    }

    public ItineraryDTO[] getItineraries() {
        return itineraries;
    }


    //TODO 여정 정보?
    @Override
    public String toString() {
        return "TripDTO{" +
                "trip_id=" + travel_id +
                ", trip_name=" + travel_name +
                ", start_date=" + start_date +
                ", end_date=" + end_date +
                '}';
    }
}
