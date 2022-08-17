package CW2;

public class InstrumentToRent extends Instrument {
    //declaring private attributes
    private int chargePerDay;
    private String dateOfRent;
    private String dateOfReturn;
    private int noOfDays;
    private boolean isRented;

    // creating constructor with instrument name and charge per day

    public InstrumentToRent(String instrumentName, int chargePerDay) {
        super(instrumentName);
        this.chargePerDay = chargePerDay;
        this.dateOfRent = "";
        this.dateOfReturn = "";
        this.noOfDays = 0;
        this.isRented = false;
    }

    //getter and setter method for all the attributes
    public int getChargePerDay() {
        return chargePerDay;
    }

    public void setChargePerDay(int chargePerDay) {
        this.chargePerDay = chargePerDay;
    }

    public String getDateOfRent() {
        return dateOfRent;
    }

    public void setDateOfRent(String dateOfRent) {
        this.dateOfRent = dateOfRent;
    }

    public String getDateOfReturn() {
        return dateOfReturn;
    }

    public void setDateOfReturn(String dateOfReturn) {
        this.dateOfReturn = dateOfReturn;
    }

    public int getNoOfDays() {
        return noOfDays;
    }

    public void setNoOfDays(int noOfDays) {
        this.noOfDays = noOfDays;
    }

    public boolean getIsRented() {
        return isRented;
    }

    public void setIsRented(boolean isRented) {
        this.isRented = isRented;
    }


    //method to rent out the instrument
    public void rent(String customerName, String customerPhoneNumber, int PanNumber, String dateOfRent, String dateOfReturn, int noOfDays) {
        if (isRented == true) {
            System.out.println("Currently, this instrument is being rented.");
            System.out.println("Customer's Name is " + getCustomerName());
            System.out.println("Customer's Phone Number is " + getCustomerPhoneNumber());
            System.out.println("The instrument will be delivered back on " + this.dateOfReturn);
        } else {
            setCustomerName(customerName);
            setCustomerPhoneNumber(customerPhoneNumber);
            setPanNumber(PanNumber);
            this.dateOfRent = dateOfRent;
            this.dateOfReturn = dateOfReturn;
            this.noOfDays = noOfDays;
            setIsRented(true);
            display();
            System.out.println("Total charge of instrument " + getNoOfDays() * getChargePerDay());
        }
    }

    //method to return the rented instrument
    public void toReturn() {
        if (isRented == false) {
            System.out.println("CW2.Instrument is available ");
        } else {
            setCustomerName("");
            setCustomerPhoneNumber("");
            setPanNumber(0);
            setDateOfReturn("");
            setDateOfRent("");
            setNoOfDays(0);
            setIsRented(false);
        }
    }
    //show method that displays the renting information while calling the display method of the super class.
    public void display() {
        super.display();
        if (isRented == true) {
            System.out.println("Return Date: " + getDateOfReturn());
            System.out.println("Rent Date: " + getDateOfRent());
            System.out.println("Number of days rented: " + getNoOfDays());
        }
    }

}