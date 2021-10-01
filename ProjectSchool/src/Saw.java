public class Saw extends Equipment{
    private String type;
    private boolean needSharpened;

    public Saw(){};
    public Saw(int id,String location, int yearOfPurchase, String type, boolean needSharpened){
        super(id,location,yearOfPurchase);
        this.type=type;
        this.needSharpened=needSharpened;
    }
    public void setType(String type) {
        this.type = type;
    }

    public void setNeedSharpened(boolean needSharpened) {
       this.needSharpened=needSharpened;
    }

    public String getType(){
        return type;
    }

    public boolean getNeedSharpened(){
        return needSharpened;
    }
}
