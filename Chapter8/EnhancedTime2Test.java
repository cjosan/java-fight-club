//        (Enhancing Class Time2) Modify class Time2 of Fig. 8.5 to include a tick method that increments
//        the time stored in a Time2 object by one second. Provide method incrementMinute to increment
//        the minute by one and method incrementHour to increment the hour by one. Write a
//        program that tests the tick method, the incrementMinute method and the incrementHour method
//        to ensure that they work correctly. Be sure to test the following cases:
//        a) incrementing into the next minute,
//        b) incrementing into the next hour and
//        c) incrementing into the next day (i.e., 11:59:59 PM to 12:00:00 AM).

public class EnhancedTime2Test {

    public static void main(String[] args) {
        EnhancedTime2 time2 = new EnhancedTime2();

        System.out.println("Current time");
        System.out.println(time2.toUniversalString() + "\n");

        System.out.println("Increment hour, minute and second:");
        time2.incrementHour();
        time2.incrementMinute();
        time2.tick();
        System.out.println(time2.toUniversalString() + "\n");

        System.out.println("Set second to 59 and increment it");
        time2.setSecond(59);
        System.out.println(time2.toUniversalString());
        time2.tick();
        System.out.println(time2.toUniversalString() + "\n");

        System.out.println("Set minute to 59 and increment it");
        time2.setMinute(59);
        System.out.println(time2.toUniversalString());
        time2.incrementMinute();
        System.out.println(time2.toUniversalString() + "\n");

        System.out.println("Set hour to 23 and increment it");
        time2.setHour(23);
        System.out.println(time2.toUniversalString());
        time2.incrementHour();
        System.out.println(time2.toUniversalString() + "\n");

        System.out.println("Set time to 23:59:59 and increment second");
        time2.setTime(23, 59, 59);
        System.out.println(time2.toUniversalString());
        time2.tick();
        System.out.println(time2.toUniversalString() + "\n");
    }
}
