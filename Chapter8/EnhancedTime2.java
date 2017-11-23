public class EnhancedTime2 {
    private int hour;
    private int minute;
    private int second;

    // Time2 no argument constructor:
    // Initialises each instance variable to zero
    public EnhancedTime2(){
        this(0, 0, 0);  // invoke Time2 constructor with three arguments
    }
    // Time2 constructor: hour supplied, minute and second defaulted to 0
    public EnhancedTime2(int h){
        this(h, 0, 0);
    }
    // Time2 constructor: hour and minute supplied, second defaulted to 0
    public EnhancedTime2(int h, int m){
        this(h, m, 0);
    }
    // Time2 constructor: hour, minute and second supplied
    public EnhancedTime2(int h, int m, int s){
        setTime(h, m, s);
    }
    // Time2 constructor: another Time2 object supplied
    public EnhancedTime2(Time2 time){
        // invoke Time2 three-argument constructor
        this(time.getHour(), time.getMinute(), time.getSecond());
    }

    // SETTERS
    // set a new time value using universal time
    // validate the data
    public void setTime(int h, int m, int s){
        setHour(h);
        setMinute(m);
        setSecond(s);
    }
    // validate and set the hour
    public void setHour(int h){
        if(h >= 0 && h < 24)
            hour = h;
        else
            throw new IllegalArgumentException("hour must be 0-23");
    }
    // validate and set minute
    public void setMinute(int m){
        if(m >= 0 && m < 60)
            minute = m;
        else
            throw new IllegalArgumentException("minute must be 0-59");
    }
    // validate and set second
    public void setSecond(int s){
        if(s >= 0 && s < 60)
            second = ((s >= 0 && s < 60) ? s : 0);
        else
            throw new IllegalArgumentException("second must be 0-59");
    }
    // GETTERS
    // get hour
    public int getHour(){
        return hour;
    }
    // get minute
    public int getMinute(){
        return minute;
    }
    // get second
    public int getSecond(){
        return second;
    }

    public void tick() {
        second++;

        if (second == 60) {
            incrementMinute();
            second = 0;
        }
    }

    public void incrementMinute() {
        minute++;

        if (minute == 60) {
            incrementHour();
            second = 0;
            minute = 0;
        }
    }

    public void incrementHour() {
        hour++;
        if (hour == 24) {
            hour = 0;
            minute = 0;
            second = 0;
        }
    }

    // convert to String in universal time format (HH:MM:SS)
    public String toUniversalString(){
        return String.format(
                "%02d:%02d:%02d", getHour(), getMinute(), getSecond());
    }
    // convert to String in standard time format (H:MM:MM AM/PM)
    public String toString(){
        return String.format("%d:%02d:%02d %s",
                ((getHour() == 0 || getHour() == 12) ? 12 : getHour() % 12),
                getMinute(), getSecond(), (getHour() < 12 ? "AM" : "PM"));
    }
}
