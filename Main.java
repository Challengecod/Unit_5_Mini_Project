import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws ParseException {

        Time time1 = new Time(8, 9, 58);
        System.out.println(time1);
        time1.tick();
        System.out.println(time1);
        time1.tick();
        System.out.println(time1);
        time1.tick();
        System.out.println(time1);

    }
}