public class PrivatePilot implements Pilot1{
    private String certification;
    private String radio;

    public PrivatePilot() {
        certification = "private";
        radio = "Tower. Cessna Niner Seven Niner One Foxtrot. "
                + "A Cessna 172. At the Club Ramp. VFR to Tullahoma. Three Thousand Five Hundred. Ready for Taxi";
    }

    public String certification() {
        return certification;
    }

    public String radio() {
        return radio;
    }

   
}
