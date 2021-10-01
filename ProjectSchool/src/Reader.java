import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Reader {
    public static List<Equipment> getData() throws FileNotFoundException {
        List<Equipment> equipment=new ArrayList<>();
        File myFile = new File("src/equipment.txt");
        Scanner myReader = new Scanner(myFile);
        while (myReader.hasNextLine()) {
            String data = myReader.nextLine();
            if(data.contentEquals("Saw")){
                Saw saw=new Saw();
                data = myReader.nextLine();
                saw.setId(Integer.parseInt(data));
                data = myReader.nextLine();
                saw.setLocation(data);
                data = myReader.nextLine();
                saw.setYearOfPurchase(Integer.parseInt(data));
                data = myReader.nextLine();
                saw.setType(data);
                data = myReader.nextLine();
                saw.setNeedSharpened(Boolean.parseBoolean(data));
                equipment.add(saw);
            }else{
                Drill drill=new Drill();
                data = myReader.nextLine();
                drill.setId(Integer.parseInt(data));
                data = myReader.nextLine();
                drill.setLocation(data);
                data = myReader.nextLine();
                drill.setYearOfPurchase(Integer.parseInt(data));
                data = myReader.nextLine();
                drill.setUsesBattery(Boolean.parseBoolean(data));
                data = myReader.nextLine();
                drill.setNeedReplacement(Boolean.parseBoolean(data));
                equipment.add(drill);
            }
        }
        myReader.close();
        return equipment;
    }
}
