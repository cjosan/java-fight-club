public enum Coin {
    HEAD,
    TAILS;

    public static Coin flip() {
        return values()[(int)(Math.random() * 2)];
    }
}
