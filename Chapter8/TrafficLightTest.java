//        Write an enum type TrafficLight, whose constants (RED, GREEN, YELLOW) take one parameter—
//        the duration of the light. Write a program to test the TrafficLight enum so that it displays the
//        enum constants and their durations.

public class TrafficLightTest {

    public static void main(String[] args) {
        for (TrafficLight light : TrafficLight.values()) {
            System.out.println(light);
        }
    }
}
