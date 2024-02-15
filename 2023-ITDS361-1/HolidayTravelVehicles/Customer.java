import java.util.ArrayList;
public class Customer {
    private String customerID;
    private String custormerName, address;
    private String phoneNumber;
    private ArrayList<TradeInVehicle> tradeInList;

    public Customer(){}

    public Customer(String customerID, String custormerName, String address, String phoneNumber){
        this.customerID = customerID;
        this.custormerName = custormerName;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.tradeInList = new ArrayList<TradeInVehicle>();
    }

    public String getCustomerID(){
        return customerID;
    }

    public String getCustomerName(){
        return custormerName;
    }

    public String getAddress(){
        return address;
    }

    public String getPhoneNumber(){
        return phoneNumber;
    }

    public void setCustomerID(String customerID){
        this.customerID = customerID;
    }

    public void setCustomerName(String customerName){
        this.custormerName = customerName;
    }

    public void setAddress(String address){
        this.address = address;
    }

    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }

    public void setCustomerProfile(String customerID, String customerName, String address, String phoneNumber){
        this.customerID = customerID;
        this.custormerName = customerName;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public void addTradeInVehicle(TradeInVehicle tradeInvInVehicle){
        tradeInList.add(tradeInvInVehicle);
        System.out.println(tradeInList);
    }

    public String toString(){
        return "Customer ID: " + customerID + " | Customer Name: " + custormerName + " | Address: " + address + " | Phone: " + phoneNumber;
    }
}