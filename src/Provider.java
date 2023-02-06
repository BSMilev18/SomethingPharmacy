public class Provider {

    private String name;
    private String address;
    private String telNumber;

    public Provider() {
        this.name = "Spas";
        this.address = "Slaveykov";
        this.telNumber = "08866376742";
    }

    public Provider(String name, String address, String telNumber){
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
        return "Provider{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", telNumber='" + telNumber + '\'' +
                '}';
    }
}
