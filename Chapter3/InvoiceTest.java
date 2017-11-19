// (Invoice Class) Create a class called Invoice that a hardware store might use to represent
// an invoice for an item sold at the store. An Invoice should include four pieces of information as
// instance variables—a part number (type String), a part description (type String), a quantity of the
// item being purchased (type int) and a price per item (double). Your class should have a constructor
// that initializes the four instance variables. Provide a set and a get method for each instance variable.
// In addition, provide a method named getInvoiceAmount that calculates the invoice amount (i.e.,
// multiplies the quantity by the price per item), then returns the amount as a double value. If the
// quantity is not positive, it should be set to 0. If the price per item is not positive, it should be set to
// 0.0. Write a test app named InvoiceTest that demonstrates class Invoice’s capabilities.

public class InvoiceTest {

    public static void main(String[] args) {
        Invoice invoice1 = new Invoice("#3451", "Backpack", 20, 949.99);
        Invoice invoice2 = new Invoice("#4564", "Mouse", -4, -800);

        System.out.println("Item " + invoice1.getPartNumber() + " info: \n" +
                "Description: " + invoice1.getPartDescription() + "\n" +
                "Price: " + invoice1.getItemPrice() + "\n" +
                "Stock: " + invoice1.getQuantity() + "pcs\n");
        System.out.println("Item " + invoice2.getPartNumber() + " info: \n" +
                "Description: " + invoice2.getPartDescription() + "\n" +
                "Price: " + invoice2.getItemPrice() + "\n" +
                "Stock: " + invoice2.getQuantity() + "pcs\n");

        invoice1.setPartNumber("#3597");
        invoice1.setPartDescription("Keyboard");
        invoice1.setQuantity(50);
        invoice1.setItemPrice(700);

        invoice2.setPartNumber("#4563");
        invoice2.setPartDescription("Monitor");
        invoice2.setQuantity(-60);
        invoice2.setItemPrice(-300);

        System.out.println();
        System.out.println("Item " + invoice1.getPartNumber() + " info: \n" +
                "Description: " + invoice1.getPartDescription() + "\n" +
                "Price: " + invoice1.getItemPrice() + "\n" +
                "Stock: " + invoice1.getQuantity() + "pcs\n");
        System.out.println("Item " + invoice2.getPartNumber() + " info: \n" +
                "Description: " + invoice2.getPartDescription() + "\n" +
                "Price: " + invoice2.getItemPrice() + "\n" +
                "Stock: " + invoice2.getQuantity() + "pcs\n");

        System.out.println("Item " + invoice1.getPartNumber() + " invoice amount: "
                + invoice1.getInvoiceAmount());
        System.out.println("Item " + invoice2.getPartNumber() + " invoice amount: "
                + invoice2.getInvoiceAmount());
    }
}
