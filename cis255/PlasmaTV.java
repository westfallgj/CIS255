public class PlasmaTV extends Television{
    private int plasmaID;
    private int numPlasmaCells;
    
    public PlasmaTV() {
    }

    public PlasmaTV(String brand, int screenSize, int plasmaID, int numPlasmaCells) {
        super(brand, screenSize);

        this.plasmaID = plasmaID;
        this.numPlasmaCells = numPlasmaCells;
    }

    @Override
    public void turnOn() {
        System.out.println("Charging plasma cells...");
    }

    public int getPlasmaID() {
        return plasmaID;
    }

    public int getNumPlasmaCells() {
        return numPlasmaCells;
    }

    public void setPlasmaID(int plasmaID) {
        this.plasmaID = plasmaID;
    }

    public void setNumPlasmaCells(int numPlasmaCells) {
        this.numPlasmaCells = numPlasmaCells;
    }

    @Override
    public String toString() {
        return "PlasmaTV [plasmaID=" + plasmaID + ", numPlasmaCells=" + numPlasmaCells + ", getBrand()=" + getBrand()
                + ", getScreenSize()=" + getScreenSize() + "]";
    }

    
}
