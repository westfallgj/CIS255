public class StudentPilot implements Pilot1 {
    private String certification;
    private String radio;

    public StudentPilot()  {
        certification = "student";
        radio = "Umm...Tower...Umm...I am flying but I am confused";
    }

    public String certification()  {
        return certification;
    }

    public String radio()  {
        return radio;
    }
}
