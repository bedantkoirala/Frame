package CW2;

public class Instrument
{
    //declaring private attributes
    private static int instrumentID=0;
    private String instrumentName;
    private String customerName;
    private String customerPhoneNumber;
    private int PanNumber;

    //creating constructor with instrumentName as the parameter
    public Instrument(String instrumentName){
        this.instrumentName = instrumentName;
        this.customerName = "";
        this.customerPhoneNumber= "";
        this.PanNumber = 0;
        instrumentID++;
    }

    //getter and setter method for all the attributes
    public int getInstrumentID(){
        return instrumentID;
    }
    public void setInstrumentID(int instrumentID){
        this.instrumentID = instrumentID;
    }

    public String getInstrumentName(){
        return instrumentName;
    }
    public void setInstrumentName(String instrumentName){
        this.instrumentName = instrumentName ;
    }

    public String getCustomerName(){
        return customerName;
    }
    public void setCustomerName(String customerName){
        this.customerName = customerName;
    }

    public String getCustomerPhoneNumber(){
        return customerPhoneNumber;
    }
    public void setCustomerPhoneNumber(String customerPhoneNumber){
        this.customerPhoneNumber = customerPhoneNumber;
    }

    public int getPanNumber(){
        return PanNumber;
    }
    public void setPanNumber(int PanNumber){
        this.PanNumber = PanNumber;
    }

    //display method for displaying instrument and customer information
    public void display(){
        System.out.println("CW2.Instrument ID: " + getInstrumentID());
        System.out.println("CW2.Instrument name: " + getInstrumentName());
        if ( customerName == "" || customerPhoneNumber == "" || PanNumber == 0){

        } else {
            System.out.println("Name of customer: "+ getCustomerName());
            System.out.println("Phone Number of customer: "+ getCustomerPhoneNumber());
            System.out.println("PAN Number of customer: "+ getPanNumber());
        }

    }
}