public class FlightPriceTrackingObserver implements Observer{
    private String name;
    private Subject topic;

    public FlightPriceTrackingObserver(String name){
        this.name = name;
    }

    @Override
    public void update() {
        // logic to send updates to observers
    }

    @Override
    public void setSubject(Subject sub) {
        this.topic = sub;
    }
}


