public class Time {
    private int hours;
    private int minutes;
    private int seconds;

    public Time(int hours, int minutes, int seconds){
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;

    }

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

    public void tick(){
        seconds += 1;
        if(seconds == 60){
            seconds = 0;
            minutes += 1;
            if(minutes ==60){
                minutes = 0;
                hours+=1;
                if (hours == 24){
                    hours = 0;
                }
            }
        }

    }

}
