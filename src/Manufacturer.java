public class Manufacturer {

    private String name;
    private String address;
    private String telNumber;

    public Manufacturer() {
        this.name = "Reggie";
        this.address = "Tinkin";
        this.telNumber = "08835645430";
    }

    public Manufacturer(String name, String address, String telNumber){
        this.name = name;
        this.address = address;
        this.telNumber = telNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTelNumber() {
        return telNumber;
    }

    public void setTelNumber(String telNumber) {
        this.telNumber = telNumber;
    }

    @Override
    public String toString() {
        return "Manufacturer{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", telNumber='" + telNumber + '\'' +
                '}';
    }
}
