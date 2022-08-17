package CW2;

public class InstrumentToSell extends Instrument {
    private int price;
    private String sellDate;
    private int discountPercent;
    private boolean isSold;

    //creating a constructor with the parameters instrumentName and price
    public InstrumentToSell(String instrumentName, int price) {
        super(instrumentName);
        this.price = price;
        this.sellDate = "";
        this.discountPercent = 0;
        this.isSold = false;
    }

    //creating getter and setter for all the attributes
    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        //checking if the instrument is already sold or not
        if (isSold == true) {
            System.out.println("The price cannot be changed since this instrument has already been sold.");
        } else {
            this.price = price;
        }
    }

    public String getSellDate() {
        return sellDate;
    }

    public void setSellDate(String sellDate) {
        this.sellDate = sellDate;
    }

    public int getDiscountPercent() {
        return discountPercent;
    }

    public void setDiscountPercent(int discountPercent) {
        this.discountPercent = discountPercent;
    }

    public boolean getIsSold() {
        return isSold;
    }

    public void setIsSold(boolean isSold) {
        this.isSold = isSold;
    }

    //method to sell the instrument
    public void toSell(String customerName, String customerPhoneNumber, int PanNumber, String sellDate, int discountPercent) {
        //checking whether the instrument is sold or not
        if (isSold == true) {
            System.out.println("It has already been sold.");
            System.out.println("Name of customer: " + getCustomerName());
            System.out.println("Phone Number of customer: " + getCustomerPhoneNumber());
            System.out.println("Customer PAN number: " + getPanNumber());
        } else {
            setCustomerName(customerName);
            setCustomerPhoneNumber(customerPhoneNumber);
            setPanNumber(PanNumber);
            setSellDate(sellDate);
            setDiscountPercent(discountPercent);
            setIsSold(true);
            price = this.price - this.price * discountPercent / 100;
            display();
        }
    }

    /*display method that displays discount information that is called from the parent class.*/
    public void display() {
        super.display();
        System.out.println("Discount percent: " + getDiscountPercent());
        System.out.println("Discounted price: " + price);
        if (isSold == true) {
            System.out.println("Sell Date: " + getSellDate());
        }
    }

}