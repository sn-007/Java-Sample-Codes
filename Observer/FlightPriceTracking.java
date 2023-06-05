import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FlightPriceTracking implements Subject{
    private List<Observer> observers;
    private String sourceLocation;
    private String destinationLocation;
    private Date flightDateAndTime;
    private double price;

    public FlightPriceTracking(){
        this.observers=new ArrayList<>();
    }
    @Override
    public void register(Observer obj) {
        // logic to add observers to the list
    }

    @Override
    public void unregister(Observer obj) {
        // logic to remove observers form the list
    }

    @Override
    public void notifyObservers() {
        // logic to notify observers
    }

    @Override
    public Object getUpdate(Observer obj) {
        return this.price;
    }

    public void postMessage(double price){
        this.price=price;
        notifyObservers();
    }
}
