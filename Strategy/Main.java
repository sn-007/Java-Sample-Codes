public class Main {
    public static void main(String[] args) {

        State initialState = new State(/*...*/);
        
        Direction intialDirection = new Direction(/*...*/);
        


        int movement1 = Calculator.calculateMovement(new AirMovement(), initialState, intialDirection);
        int movement2 = Calculator.calculateMovement(new WaterMovement(), initialState, intialDirection);


                

    }
}