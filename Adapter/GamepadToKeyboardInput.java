public class GamepadToKeyboardInput implements GamepadInput {

    private KeyboardDriver key_driver = null;

    public GamepadToKeyboardInput(KeyboardDriver key_driver) {
        this.key_driver = key_driver;
    }

    public KeyboardDriver getKey_driver() {
        return key_driver;
    }

    public void setKey_driver(KeyboardDriver key_driver) {
        if(this.key_driver == null)
        {
            this.key_driver = key_driver;
        }
        else {
            System.out.println("Keyboard driver already issued for this adapter");
        }
    }

    @Override
    public void mapLeftButton() {
        String s = key_driver.mapKeyPress("A");
        System.out.println(s);
    }

    @Override
    public void mapRightButton() {
        String s = key_driver.mapKeyPress("D");
        System.out.println(s);
    }

    @Override
    public void mapUpButton() {
        String s = key_driver.mapKeyPress("W");
        System.out.println(s);
    }

    @Override
    public void mapDownButton() {
        String s = key_driver.mapKeyPress("S");
        System.out.println(s);
    }
}
