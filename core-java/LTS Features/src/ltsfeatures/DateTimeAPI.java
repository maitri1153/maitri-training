package ltsfeatures;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;

public class DateTimeAPI {

	public static void main(String args[]) {
		LocalTime currenttime = LocalTime.now();
		System.out.println("Get current time:  " + currenttime);
		LocalDate now = LocalDate.now();
		System.out.println("Get current date:  " + now);

		LocalDate customdate = LocalDate.of(2003, 5, 11);
		System.out.println("Get Custom date :  " + customdate);

		System.out.println("Get Current date year  : " + now.getYear());
		System.out.println("Get Current date Month : " + now.getMonth());
		System.out.println("Get Current date day   : " + now.getDayOfMonth());

		ZoneId zoneid1 = ZoneId.of("Asia/Kolkata");
		ZoneId zoneid2 = ZoneId.of("Asia/Tokyo");

		LocalTime zone1 = LocalTime.now(zoneid1);
		LocalTime zone2 = LocalTime.now(zoneid2);

		System.out.println("Zone id1 Time " + zone1);
		System.out.println("Zone id2 Time " + zone2);

		Duration duration = Duration.between(zone1, zone2);
		System.out.println("Duration in Minutes : " + duration.toMinutes());
		float number = ChronoUnit.MINUTES.between(zone1, zone2);
		System.out.println("Duration of 2 timezones : " + number);

		ZonedDateTime zonedateTime = ZonedDateTime.now();
		System.out.println(zonedateTime);

		Instant instant = Instant.now();
		System.out.println(instant);

	}
}
