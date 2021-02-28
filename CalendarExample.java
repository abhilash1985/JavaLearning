// CalendarExample.java

// java.util.Date
// java.sql.Date
// java.sql.Time
// java.sql.Timestamp

// java.util.Calendar
// int year = calendar.get(Calendar.YEAR);
// int month = calendar.get(Calendar.YEAR);

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Calendar;
import java.util.GregorianCalendar;

import java.time.LocalDate;
import java.time.ZoneId;
import java.time.Period;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

class CalendarExample {
	public static void main(String[] args) {
		long millis = System.currentTimeMillis();
		java.util.Date dt = new java.util.Date(millis);
		System.out.println("Date: " + dt);

		Date date = new Date();
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
		String strDate = formatter.format(date);

		System.out.println("strDate = " + strDate);

		// Calendar and Gregorian Calendar
		// Calendar calendar = new GregorianCalendar();
		Calendar calendar = new GregorianCalendar();
		int year = calendar.get(Calendar.YEAR);
		int month = calendar.get(Calendar.MONTH);
		int dayOfMonth = calendar.get(Calendar.DAY_OF_MONTH);
		int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
		int weekOFYear = calendar.get(Calendar.WEEK_OF_YEAR);
		int weekOFMonth = calendar.get(Calendar.WEEK_OF_MONTH);

		System.out.println(year + "-" + month + "-" + dayOfMonth + "-" + dayOfWeek + "-" + weekOFYear + "-" + weekOFMonth);

                // LocalDate, ZoneId, Period
                LocalDate localDate = LocalDate.now();
                System.out.println("Today's Date: " + localDate);

                LocalDate localDateZone = LocalDate.now(ZoneId.of("America/Los_Angeles"));
                System.out.println("Today's Date at America: " + localDateZone);

                LocalDate localDate1 = LocalDate.of(2020, 03, 14);
                LocalDate localDate2 = LocalDate.of(2021, 04, 23);
                Period period = Period.between(localDate1, localDate2);
                System.out.println("Period: " + period.getYears() + " " + period.getMonths() +
                	               " " + period.getDays());

                // DateTimeFormatter
                DateTimeFormatter datTimeFormatter1 = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
                DateTimeFormatter datTimeFormatter2 = DateTimeFormatter.ofPattern("yyyy/MM/dd");
                DateTimeFormatter datTimeFormatter3 = DateTimeFormatter.ofPattern("dd/MMM/YYYY");

                ZonedDateTime zonedDateTime = ZonedDateTime.now();
                String formatter1 = datTimeFormatter1.format(zonedDateTime);
                String formatter2 = datTimeFormatter2.format(zonedDateTime);
                String formatter3 = datTimeFormatter3.format(zonedDateTime);

                System.out.println("formatter1: " + formatter1);
                System.out.println("formatter2: " + formatter2);
                System.out.println("formatter3: " + formatter3);
	}
}
