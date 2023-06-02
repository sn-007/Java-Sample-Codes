// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
            //This is the part of the application that uses a gamepad and the signals for this will be converted in to keyboard output
            KeyboardDriver kbd = new KeyboardDriver();
            GamepadInput gamepad_ip = new GamepadToKeyboardInput(kbd);

            VideoGame newGame = new VideoGame(gamepad_ip);
            newGame.executeAction();

    }
}