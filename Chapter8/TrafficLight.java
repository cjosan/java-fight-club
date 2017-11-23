public enum TrafficLight {
    RED(25),
    GREEN(50),
    YELLOW(10);

    private int duration;

    TrafficLight(int duration) {
        this.duration = duration;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }


    @Override
    public String toString() {
        return "Light: " + super.toString() + "\n" +
                "Duration: " + duration + "s";
    }
}
