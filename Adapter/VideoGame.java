public class VideoGame {
    GamepadInput input_driver;

    public VideoGame(GamepadInput input_driver) {
        this.input_driver = input_driver;
    }

    void executeAction()
    {
        System.out.println("Executing UP UP DOWN DOWN LEFT RIGHT LEFT RIGHT");
        input_driver.mapUpButton();
        input_driver.mapUpButton();
        input_driver.mapDownButton();
        input_driver.mapDownButton();
        input_driver.mapLeftButton();
        input_driver.mapRightButton();
        input_driver.mapLeftButton();
        input_driver.mapRightButton();
    }
}
