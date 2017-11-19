public class SalesPerson {
    private double earnings;
    private int[] soldItems;

    public SalesPerson() {
        earnings = 200;
        this.soldItems = new int[4];
    }

    public int[] getSoldItems() {
        return soldItems;
    }

    public double getEarnings() {
        return calculateSalesComission() + this.earnings;
    }

    private double calculateSalesComission() {
        double earnings = 0;

        for (int i = 0; i < soldItems.length; i++) {
            earnings += soldItems[i] * getItemValue(i + 1);
        }

        return earnings * 0.09;
    }

    private double getItemValue(int index) {
        switch (index) {
            case 1:
                return 239.99;
            case 2:
                return 129.75;
            case 3:
                return 99.95;
            case 4:
                return 350.89;
            default:
                return -1;
        }
    }
}
