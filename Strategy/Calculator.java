public class Calculator{

    public Calculator() {
        
    }

    public static int calculateMovement(Movement movement, State presentState, Direction direction) {
        return movement.move(presentState, direction);
    }


}