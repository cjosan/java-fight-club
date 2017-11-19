public class Invoice {
    private String partNumber;
    private String partDescription;
    private int quantity;
    private double itemPrice;

    public Invoice(String partNumber, String partDescription, int quantity, double itemPrice) {
        this.partNumber = partNumber;
        this.partDescription = partDescription;

        if (quantity >= 0) {
            this.quantity = quantity;
        }

        if (quantity >= 0) {
            this.itemPrice = itemPrice;
        }
    }

    public String getPartNumber() {
        return partNumber;
    }

    public void setPartNumber(String partNumber) {
        this.partNumber = partNumber;
    }

    public String getPartDescription() {
        return partDescription;
    }

    public void setPartDescription(String partDescription) {
        this.partDescription = partDescription;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        if (quantity < 0) {
            System.out.println("The quantity can not be negative!");
            return;
        }

        this.quantity = quantity;
    }

    public double getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(double itemPrice) {
        if (itemPrice < 0) {
            System.out.println("The item price can not be negative!");
            return;
        }

        this.itemPrice = itemPrice;
    }

    public double getInvoiceAmount() {
        return this.quantity * this.itemPrice;
    }
}
