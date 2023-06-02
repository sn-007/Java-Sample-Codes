public class KeyboardDriver {

    String mapKeyPress(String s)
    {
        if (s.equals("W")) {
            return "W key pressed";
        } else if (s.equals("A")) {
            return "A key pressed";
        } else if (s.equals("S")) {
            return "S key pressed";
        } else if (s.equals("D")) {
            return "D key pressed";
        }
        return "unrecognised input";
    }
}
