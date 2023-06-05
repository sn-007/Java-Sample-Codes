public class WaterMovement implements Movement {

    public WaterMovement() {
        
    }


    public int move(State previousState, Direction direction) {
        system.out.println("Moved in water");
        return random.nextInt(10);
        
    }
}