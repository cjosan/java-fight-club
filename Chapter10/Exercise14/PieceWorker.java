public class PieceWorker extends Employee {
    private double wage; // wage per piece
    private int pieces; // number of pieces sold

    public PieceWorker(String firstName, String lastName, String socialSecurityNumber, double wage, int pieces, Date birthDate) {
        super(firstName, lastName, socialSecurityNumber, birthDate);
        setWage(wage);
        setPieces(pieces);
    }

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        if (wage < 0.0) // validate wage
            throw new IllegalArgumentException(
                    "Wage for pieces sold must be greater than zero");

        this.wage = wage;
    }

    public int getPieces() {
        return pieces;
    }

    public void setPieces(int pieces) {
        if ((pieces < 0.0)) // validate hours
            throw new IllegalArgumentException(
                    "Number of pieces sold can not be negative");

        this.pieces = pieces;
    }

    @Override
    public double earnings() {
        return isBirthday() ? (getWage() * getPieces() + 100) : (getWage() * getPieces());
    }

    @Override
    public String toString() {
        return String.format("piece worker: %s\n%s: $%.2f; %s %d", super.toString(), "piece wage", getWage(),
                "number of pieces", getPieces());
    }
}
