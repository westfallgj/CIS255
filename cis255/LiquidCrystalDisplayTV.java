public class LiquidCrystalDisplayTV extends Television{
    private int liquidCrystalDisplayTVID;
    private int numGlassPlates;

    public LiquidCrystalDisplayTV() {
    }

    public LiquidCrystalDisplayTV(int liquidCrystalDisplayTVID, int numGlassPlates) {
        this.liquidCrystalDisplayTVID = liquidCrystalDisplayTVID;
        this.numGlassPlates = numGlassPlates;
    }

    public LiquidCrystalDisplayTV(String brand, int screenSize, int liquidCrystalDisplayTVID, int numGlassPlates) {
        super(brand, screenSize);
        this.liquidCrystalDisplayTVID = liquidCrystalDisplayTVID;
        this.numGlassPlates = numGlassPlates;
    }

    @Override
    public void turnOn()  {
        System.out.println("Charging liquid crystal in glass plates...");
    }

    public void turnOff()  {
        System.out.println("Powering down...");
    }

    public int getLiquidCrystalDisplayTVID() {
        return liquidCrystalDisplayTVID;
    }

    public int getNumGlassPlates() {
        return numGlassPlates;
    }

    public void setLiquidCrystalDisplayTVID(int liquidCrystalDisplayTVID) {
        this.liquidCrystalDisplayTVID = liquidCrystalDisplayTVID;
    }

    public void setNumGlassPlates(int numGlassPlates) {
        this.numGlassPlates = numGlassPlates;
    }

    @Override
    public String toString() {
        return "LiquidCrystalDisplayTV [liquidCrystalDisplayTVID=" + liquidCrystalDisplayTVID + ", numGlassPlates="
                + numGlassPlates + ", getBrand()=" + getBrand() + ", getScreenSize()=" + getScreenSize() + "]";
    }

}
