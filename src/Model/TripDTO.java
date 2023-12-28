package Model;

public class TripDTO {
    private int trip_id;
    private String trip_name;
    private String start_date;
    private String end_date;

    private ItineraryDTO[] itineraries;
    // TODO ArrayList?

    public TripDTO() {
    }

    // TODO JSON 연동으로 다 갈아엎기
    public int getTrip_id() {
        return trip_id;
    }

    public void setTrip_id(int trip_id) {
        this.trip_id = trip_id;
    }

    public String getTrip_name() {
        return trip_name;
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
                "trip_id=" + trip_id +
                ", trip_name=" + trip_name +
                ", start_date=" + start_date +
                ", end_date=" + end_date +
                '}';
    }
}
