public class Main {
    public static void main(String[] args) {
        // creating topic
        FlightPriceTracking topic = new FlightPriceTracking();

        // creating observers
        Observer obj1 = new FlightPriceTrackingObserver("obj1");
        Observer obj2 = new FlightPriceTrackingObserver("obj2");

        //register observers to the subject
        topic.register(obj1);
        topic.register(obj2);

        //attach observer to subject
        obj1.setSubject(topic);
        obj2.setSubject(topic);

        obj1.update();

        //now send message to subject
        topic.postMessage(7000);
    }
}