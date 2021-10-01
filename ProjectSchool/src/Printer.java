import java.io.FileNotFoundException;
import java.util.List;

public class Printer {
    private int currentYear=2021;
    public static void printDrillsNeedingBitReplacement() throws FileNotFoundException {
        List<Equipment> equipment= Reader.getData();
        for(int i=0;i<equipment.size();i++){
            if(equipment.get(i) instanceof Drill && ((Drill) equipment.get(i)).getNeedReplacement()){
                System.out.println("Drill -> id:" +equipment.get(i).getId() + " location:" + equipment.get(i).getLocation() + " year:" + equipment.get(i).getYearOfPurchase()+ " type:" + ((Drill) equipment.get(i)).getUsesBattery() + " needSharpen:" + ((Drill) equipment.get(i)).getNeedReplacement());
            }
        }
    }
    public static void printEquipmentOlderThanFiveYears() throws FileNotFoundException {
        List<Equipment> equipment= Reader.getData();
        for(int i=0;i<equipment.size();i++){
            if(equipment.get(i) instanceof Saw && ((equipment.get(i).getYearOfPurchase()-2021)>5|| (equipment.get(i).getYearOfPurchase()-2021)<-5)){
                System.out.println("Saw -> id:" +equipment.get(i).getId() + " location:" + equipment.get(i).getLocation() + " year:" + equipment.get(i).getYearOfPurchase()+ " type:" + ((Saw) equipment.get(i)).getType() + " needSharpen:" + ((Saw) equipment.get(i)).getNeedSharpened());
            }else if(equipment.get(i) instanceof Drill && ((equipment.get(i).getYearOfPurchase()-2021)>5|| (equipment.get(i).getYearOfPurchase()-2021)<-5)){
                System.out.println("Drill -> id:" +equipment.get(i).getId() + " location:" + equipment.get(i).getLocation() + " year:" + equipment.get(i).getYearOfPurchase()+ " type:" + ((Drill) equipment.get(i)).getUsesBattery() + " needSharpen:" + ((Drill) equipment.get(i)).getNeedReplacement());
            }
        }
    }
    public static void printSaws() throws FileNotFoundException {
        List<Equipment> equipment= Reader.getData();
        for(int i=0;i<equipment.size();i++){
            if(equipment.get(i) instanceof Saw){
                System.out.println("Saw -> id:" +equipment.get(i).getId() + " location:" + equipment.get(i).getLocation() + " year:" + equipment.get(i).getYearOfPurchase()+ " type:" + ((Saw) equipment.get(i)).getType() + " needSharpen:" + ((Saw) equipment.get(i)).getNeedSharpened());
            }
        }
    }
}
