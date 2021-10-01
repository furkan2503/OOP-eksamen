import javax.sound.midi.Soundbank;
import java.io.FileNotFoundException;
import java.util.List;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("Task 1:");
        task1();//to check if I got the correct data from file
        System.out.println("\nAll drills that need replacement");
        Printer.printDrillsNeedingBitReplacement();
        System.out.println("\nEquipment older than 5 years");
        Printer.printEquipmentOlderThanFiveYears();
        System.out.println("\nAll saws");
        Printer.printSaws();
    }
    static void task1() throws FileNotFoundException {
        List<Equipment> equipment= Reader.getData();
        for(int i=0;i<equipment.size();i++){
            if(equipment.get(i) instanceof Saw){
                System.out.println("Saw -> id:" +equipment.get(i).getId() + " location:" + equipment.get(i).getLocation() + " year:" + equipment.get(i).getYearOfPurchase()+ " type:" + ((Saw) equipment.get(i)).getType() + " needSharpen:" + ((Saw) equipment.get(i)).getNeedSharpened());
            }else{
                System.out.println("Drill -> id:" +equipment.get(i).getId() + " location:" + equipment.get(i).getLocation() + " year:" + equipment.get(i).getYearOfPurchase()+ " type:" + ((Drill) equipment.get(i)).getUsesBattery() + " needSharpen:" + ((Drill) equipment.get(i)).getNeedReplacement());
            }
        }
    }
}
