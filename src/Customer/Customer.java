package Customer;

public class Customer {

    //Member variables
    private String CustomerID;
    private String CustomerName;
    private String email;
    private String address;
    private int contactNumber;
    private String dateOfBirth;
    private String gender;


    //constructor
    public Customer() {
        CustomerID = "C000";
        CustomerName = "";
        email = "";
        address = "";
        contactNumber = 0;
        dateOfBirth = "";
        gender = "";
    }

    public Customer(String customerId, String customerName, String email, String address, int contactNumber, String dateOfBirth, String gender) {
        this.CustomerID = customerId;
        this.CustomerName = customerName;
        this.email = email;
        this.address = address;
        this.contactNumber = contactNumber;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
    }

    //Setters
    public void setCustomerID(String customerId) {
        CustomerID = customerId;
    }

    public void setCustomerName(String customerName) {
        CustomerName = customerName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setContactNumber(int contactNumber) {
        this.contactNumber = contactNumber;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    //Getters


    public String getCustomerID() {
        return CustomerID;
    }

    public String getCustomerName() {
        return CustomerName;
    }

    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }

    public int getContactNumber() {
        return contactNumber;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public String getGender() {
        return gender;
    }


}
