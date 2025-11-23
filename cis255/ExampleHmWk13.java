import java.util.ArrayList;
import java.util.List;

public class ExampleHmWk13 {
    public static void main(String[] args) {
        List<Pilot1> pilots = new ArrayList<Pilot1>();

        Pilot1 studentPilot = new StudentPilot();
        Pilot1 privatePilot = new PrivatePilot();

        pilots.add(studentPilot);
        pilots.add(privatePilot);

        for (Pilot1 p: pilots)  {
            System.out.println(
                p.certification() + ": " + p.radio());
        }
    }
}
