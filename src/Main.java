import java.util.ArrayList;
import java.util.Scanner;

public class Main extends Pharmacy {
    public static void main(String[] args){
        ArrayList<Pharmacy> pharmacy = new ArrayList<Pharmacy>();
        Scanner sc = new Scanner(System.in);
        String option = sc.nextLine();
        while(option != "Exit")
        {
            switch(option) {
                case "1":
                    System.out.println(addMedicine(pharmacy).toString());
                    break;
                case "2":

                    break;
                case "3":

                    break;
                case "4":

                    break;
                case "Exit":

                    break;
                default:
                    System.out.println("Incorrect input. Try again.");
                    break;
            }
        }
    }

    public static Medicine addMedicine(ArrayList<Pharmacy> medicineList){
        ArrayList<Medicine> medicine = new ArrayList<Medicine>();
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        double price = sc.nextDouble();
        String expirationDate = sc.nextLine();
        Medicine medicine1 = new Medicine(name, price, expirationDate);
        medicine.add(medicine1);
        return medicine1;
    }

    public static ArrayList<Pharmacy> outputInfo(ArrayList<Pharmacy> info){

        ArrayList<Pharmacy> pharmacyInfo = new ArrayList<Pharmacy>();
        for(Pharmacy i1 : pharmacyInfo){
            System.out.println();
        }
        return pharmacyInfo;
    }
}
