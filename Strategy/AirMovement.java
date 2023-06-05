public class AirMovement implements Movement {

    public AirMovement() {
        
    }


    public int move(State presentState, Direction direction) {
        system.out.println("Moved in air");
        return random.nextInt(10);
        
    }
}