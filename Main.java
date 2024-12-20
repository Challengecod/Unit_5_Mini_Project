import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws ParseException {

        Time time1 = new Time(8, 9, 58);

        System.out.println("EXPECTED RESULT: 08:09:58");
        System.out.println("ACTUAL RESULT: " + time1);
        time1.tick(); // increase by one
        System.out.println();

        System.out.println("EXPECTED RESULT: 08:09:59");
        System.out.println("ACTUAL RESULT: " + time1);
        time1.tick(); // increase by one
        System.out.println();

        System.out.println("EXPECTED RESULT: 08:10:00");
        System.out.println("ACTUAL RESULT: " + time1);
        time1.tick();
        System.out.println();

        System.out.println("EXPECTED RESULT: 08:10:01");
        System.out.println("ACTUAL RESULT: " + time1);
        time1.tick();
        System.out.println();

        System.out.println("EXPECTED RESULT: 08:10:02");
        System.out.println("ACTUAL RESULT: " + time1);
        time1.tick();
        time1.tick();
        time1.tick();
        time1.tick();
        time1.tick();
        time1.tick();
        time1.tick();
        time1.tick();
        System.out.println();

        System.out.println("EXPECTED RESULT: 08:10:10");
        System.out.println("ACTUAL RESULT: " + time1);
        System.out.println();

        Time time2 = new Time(15, 59, 58);

        System.out.println("EXPECTED RESULT: 15:59:58");
        System.out.println("ACTUAL RESULT: " + time2);
        time2.tick();
        System.out.println();

        System.out.println("EXPECTED RESULT: 15:59:59");
        System.out.println("ACTUAL RESULT: " + time2);
        time2.tick();
        System.out.println();

        System.out.println("EXPECTED RESULT: 16:00:00");
        System.out.println("ACTUAL RESULT: " + time2);
        time2.tick();
        System.out.println();

        System.out.println("EXPECTED RESULT: 16:00:01");
        System.out.println("ACTUAL RESULT: " + time2);
        System.out.println();

        Time time3 = new Time(23, 59, 58);

        System.out.println("EXPECTED RESULT: 23:59:58");
        System.out.println("ACTUAL RESULT: " + time3);
        time3.tick();
        System.out.println();

        System.out.println("EXPECTED RESULT: 23:59:59");
        System.out.println("ACTUAL RESULT: " + time3);
        time3.tick();
        System.out.println();

        System.out.println("EXPECTED RESULT: 00:00:00");
        System.out.println("ACTUAL RESULT: " + time3);
        time3.tick();
        System.out.println();

        System.out.println("EXPECTED RESULT: 00:00:01");
        System.out.println("ACTUAL RESULT: " + time3);
        time3.tick();
        System.out.println();

        System.out.println("------------");
        //The statements below test the add functionality of the Time object:
        System.out.println("The statements below test the add functionality of the Time object:");
        System.out.println("-------------");

        Time time4 = new Time(10, 14, 43);

        System.out.println("EXPECTED RESULT: 10:14:43");
        System.out.println("ACTUAL RESULT: " + time4);
        System.out.println();

        Time time5 = new Time(8, 30, 29);

        time4.add(time5); // add 10:14:43 to 08:30:29

        System.out.println("EXPECTED RESULT: 18:45:12");
        System.out.println("ACTUAL RESULT: " + time4);
        System.out.println();

        System.out.println("EXPECTED RESULT: 08:30:29");
        System.out.println("ACTUAL RESULT: " + time5);
        System.out.println();

        Time time6 = new Time(7, 20, 0);

        time4.add(time6); // add 18:45:12 to 07:20:00

        System.out.println("EXPECTED RESULT: 02:05:12");
        System.out.println("ACTUAL RESULT: " + time4);
        System.out.println();

    }
}