import java.util.ArrayList;

public class Pharmacy {

    protected ArrayList<Medicine> medicineList;
    protected ArrayList<Provider> providerList;
    protected ArrayList<Manufacturer> manufacturerList;
    protected ArrayList<Importer> importerList;

    public Pharmacy() {}

    public Pharmacy(ArrayList<Medicine> medicineList, ArrayList<Provider> providerList, ArrayList<Manufacturer> manufacturerList, ArrayList<Importer> importerList) {
        this.medicineList = new ArrayList<Medicine>();
        this.providerList = new ArrayList<Provider>();
        this.manufacturerList = new ArrayList<Manufacturer>();
        this.importerList = new ArrayList<Importer>();
    }

    public ArrayList<Medicine> getMedicineList() {
        return medicineList;
    }

    public void setMedicineList(ArrayList<Medicine> medicineList) {
        this.medicineList = medicineList;
    }

    public ArrayList<Provider> getProviderList() {
        return providerList;
    }

    public void setProviderList(ArrayList<Provider> providerList) {
        this.providerList = providerList;
    }

    public ArrayList<Manufacturer> getManufacturerList() {
        return manufacturerList;
    }

    public void setManufacturerList(ArrayList<Manufacturer> manufacturerList) {
        this.manufacturerList = manufacturerList;
    }

    public ArrayList<Importer> getImporterList() {
        return importerList;
    }

    public void setImporterList(ArrayList<Importer> importerList) {
        this.importerList = importerList;
    }
}
