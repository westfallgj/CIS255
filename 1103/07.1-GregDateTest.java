import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class GregDateTest {
    public static void main(String args[]) {
        Date pastDate = new GregorianCalendar(2010, 03, 15).getTime();
		
        System.out.println("Period in Years: " + getTimePeriodInYears(pastDate));
	
        Date currDate = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
        System.out.println("Formatted Date is: " + formatter.format(currDate));
        System.out.println("Formatted Date is: " + new Date());
    }
    
    public static int getTimePeriodInYears(Date pastDate) {
        int timePeriod = 0;

        if (pastDate != null) {
            GregorianCalendar timePeriodCalendar = new GregorianCalendar();
            int pastYear = 0;
            int currentYear = 0;

            timePeriodCalendar.setTime(pastDate);
            pastYear = timePeriodCalendar.get(Calendar.YEAR);
            currentYear = new GregorianCalendar().get(Calendar.YEAR);
            timePeriod = currentYear - pastYear;    
        }

        return timePeriod;
    }
}