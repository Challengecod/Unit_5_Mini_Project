/**
 * The Time class represents the time. The Time has hours, minutes, and seconds.
 *
 */

public class Time {
    private int hours;
    private int minutes;
    private int seconds;

    /**
     * Constructor for the Time class. This creates a new instance of
     * Time given the below parameters
     *
     * @param hours represents the number of hours in Time.
     * @param minutes represents the number of minutes in Time.
     * @param seconds represents the number of seconds in Time.
     */

    public Time(int hours, int minutes, int seconds){
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;

    }

    /**
     * add method for the Time class. This method will update the time by adding
     * the time to another Time object. This method will also follow the time rules.
     * If seconds after adding by the otherTime seconds, if it's greater than or equal
     * to 60, subtract the number of seconds by 60 and set it equal to seconds. Then increase
     * minutes by one. Do that for minutes also. For hours is if hours is greater than or equal to 24.
     *
     * @param otherTime represents the other Time object that needed to be added.
     *
    */

    public void add(Time otherTime){
        hours = hours + otherTime.hours;
        minutes = minutes + otherTime.minutes;
        seconds = seconds + otherTime.seconds;

        if(seconds >= 60){
            seconds = seconds - 60;
            minutes += 1;
        }

        if(minutes >= 60){
            minutes = minutes - 60;
            hours += 1;
        }

        if(hours >= 24){
            hours = hours - 24;
        }

    }

    /**
     * toString method for the Time class. This method will return a String
     * showing all the information of the hours, minutes and seconds about the Time
     * in a formatted HH:MM:SS with single digits being padded with leading zeros.
     * If the number of hours, minutes or seconds are less than 10 the number should be
     * padded with leading zero.
     *
     * @return returns a String in a properly formatted HH:MM:SS containing all
     * the information of the hours. minutes and seconds about the Time.
     */

    public String toString(){
        String formatHours = "";
        String formatMinutes = "";
        String formatSeconds = "";
        if(hours < 10){
            formatHours = "0"+String.valueOf(hours);
        }

        else{
            formatHours = String.valueOf(hours);
        }

        if(minutes < 10){
            formatMinutes = "0"+String.valueOf(minutes);
        }

        else{
            formatMinutes = String.valueOf(minutes);
        }

        if(seconds < 10){
            formatSeconds = "0"+String.valueOf(seconds);
        }

        else{
            formatSeconds = String.valueOf(seconds);
        }

        return formatHours + ":" + formatMinutes + ":" + formatSeconds;
    }

    /**
     * tick method for the Time class. This method will increase the seconds by one.
     * If the number of seconds is 60 then minutes will increase by one and seconds set back to 0.
     * If the minutes is 60, then hours will increase by one and minutes set back to 0.
     * If the hours is 24, then hours will set back to zero.
     * Tick only increases by one seconds so there is no need to check greater than 60 or greater than 24.
     *
     */

    public void tick(){
        seconds += 1;
        if(seconds == 60){
            seconds = 0;
            minutes += 1;
            if(minutes == 60){
                minutes = 0;
                hours+=1;
                if (hours == 24){
                    hours = 0;
                }
            }
        }

    }

}
