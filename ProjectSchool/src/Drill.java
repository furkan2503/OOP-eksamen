public class Drill extends Equipment{
    private boolean usesBattery;
    private boolean needReplacement;

    public Drill(){}
    public Drill(int id,String location, int yearOfPurchase, boolean usesBattery, boolean needReplacement){
        super(id,location,yearOfPurchase);
        this.usesBattery=usesBattery;
        this.needReplacement=needReplacement;
    }

    public void setUsesBattery(boolean usesBattery){
        this.usesBattery=usesBattery;
    }

    public void setNeedReplacement(boolean needReplacement){
        this.needReplacement=needReplacement;
    }

    public boolean getUsesBattery(){
        return usesBattery;
    }

    public boolean getNeedReplacement(){
        return needReplacement;
    }
}
