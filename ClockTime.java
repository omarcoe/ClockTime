
/**
* Name: 
* Course: CSCI 241 - Computer Science I
* Section: 001 <-- choose your section
* Assignment: 9
*
* Project/Class Description:
* Creates a clock class with time in hour, minute and seconds.
*
* Known bugs:
* none
*/
public class ClockTime
{
    private int hour;
    private int minute;
    private int second;
    
    public ClockTime() {
        hour = 0;
        minute = 0;
        second = 0;
    }
    public ClockTime(int hour1, int minute1, int second1) {
        if (second1 > 59){
            minute += second1/60;
            second = second1%60;
        }
        else if (second1 < 0)
            second = 0;
        else 
            second += second1;
        if (minute > 59){
            hour += minute/60;
            minute = minute%60;
        }
        if (hour > 24){
            hour = hour%24;
        }
        if (minute1 > 59){
            hour += minute1/60;
            minute += minute1%60;
        }
        else if (minute1 < 0)
            minute = 0;
        else 
            minute += minute1;
        if (hour > 24){
            hour = hour%24;
        }
        if (hour1 > 24){
            hour += hour1%24;
        }
        else if (hour1 < 0)
            hour = 0;
        else 
            hour += hour1;
        if (hour > 24){
            hour = hour%24;
        }
    }
    public int getHour(){
        return hour;
    }
    public int getMinute(){
        return minute;
    }
    public int getSecond(){
        return second;
    }
    public void setHour(int x){
        if (x > 24){
            hour = x%24;
        }
        else if (x < 0)
            hour = 0;
        else 
            hour = x;
    }
    public void setMinute(int x){
        if (x > 59){
            hour += x/60;
            minute = x%60;
        }
        else if (x < 0)
            minute = 0;
        else 
            minute = x;
        if (hour > 24){
            hour = hour%24;
        }
    }
    public void setSecond(int x){
        if (x > 59){
            minute += x/60;
            second = x%60;
        }
        else if (x < 0)
            second = 0;
        else 
            second = x;
        if (minute > 59){
            hour += minute/60;
            minute = minute%60;
        }
        if (hour > 24){
            hour = hour%24;
        }
    }
    public String toString(){
        String hour24 = String.format("%02d:%02d:%02d",hour,minute,second);
        return hour24;
    }
    public String toString12(){
        String time = "A.M.";
        int nHour = hour;
        if (hour > 12) {
            nHour = hour%12;
            time = "P.M.";
        }
        String hour12 = String.format("%02d:%02d:%02d %4s",nHour,minute,second,time);
        return hour12;
    }
    public void advance(int amount) {
        int sum = amount+second;
        if (sum > 59){
            minute += sum/60;
            second = sum%60;
        }
        else 
            second = sum;
        if (minute > 59){
            hour += minute/60;
            minute = minute%60;
        }
        if (hour > 24){
            hour = hour%24;
        }
    }
    public boolean equals(ClockTime clock) {
        if (hour == clock.getHour() && minute == clock.getMinute() && second == clock.getSecond())
            return true;
        else
            return false;
    }
}
