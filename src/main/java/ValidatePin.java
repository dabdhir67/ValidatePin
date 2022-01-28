import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ValidatePin {
    public static void main(String[] args) {
        List<String> pins = new ArrayList<>(Arrays.asList("121317", "1234", "45135", "89abc1", "900876", " 4983", ""));
        for(String pin : pins) {
            System.out.println(pin + " ----> " + "is a " + validator(pin) + " pin");
        }

    }

    private static String validator(String pin) {
        if((pin.length()!=4)&&(pin.length()!=6)||!pin.matches("[0-9]+")) {
            return "invalid";
        }else {
            return "valid";
        }
    }
}
