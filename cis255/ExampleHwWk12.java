public class ExampleHwWk12 {
    public static void main(String[] args) {
        // plasma TV object
        String plasmaBrand = "Sony";
        int plasmaScreenSize = 65;
        int plasmaID = 1;
        int numPlasmaCells = 3;

        PlasmaTV pTV = new PlasmaTV(plasmaBrand, plasmaScreenSize, plasmaID, numPlasmaCells);

        System.out.println("PLASMA TV:\n" + pTV);
        pTV.turnOn(); 

        // LCD TV object
        String lcdBrand = "Toshiba";
        int lcdScreenSize = 42;
        int lcdID = 2;
        int lcdNumGlassPlates = 5;

        LiquidCrystalDisplayTV lcdTV = new LiquidCrystalDisplayTV(lcdBrand, lcdScreenSize, lcdID, lcdNumGlassPlates);

        System.out.println("LCD TV:\n" + lcdTV);
        lcdTV.turnOn(); 
        lcdTV.turnOff();
    
    }

}
