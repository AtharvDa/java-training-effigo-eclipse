package com.effigo.java_training_effigo.datetime;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class DateTime {

	public static void main(String[] args) {

		String input = "29/01/2024 01:00";
		System.out.println("What we got User Input :  " + input);

		DateTimeFormatter inputFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

		LocalDateTime parsedDateTime = LocalDateTime.parse(input, inputFormatter);

		ZoneId istZoneId = ZoneId.of("Asia/Kolkata");

		ZonedDateTime istDateTime = ZonedDateTime.of(parsedDateTime, istZoneId);

		System.out.println("This is our IST date in with zone info : " + istDateTime);
		// Till now we got the Date in ZoneDatetime format
		// now we need to convert it from ist --> unixtimestamp

		long unixtimestamp = istDateTime.toEpochSecond();
		System.out.println("1. IST to UNIXTIMESTAMP " + unixtimestamp);

		ZoneId ustZoneId = ZoneId.of("UTC");

		// This is one way but we can update same instant

		// ZonedDateTime ustDateTime = ZonedDateTime.of(parsedDateTime, ustZoneId);

		// Another way use withZoneSameInstant
		ZonedDateTime utcDateTime = istDateTime.withZoneSameInstant(ustZoneId);
		System.out.println("2. Converting IST to UTC : " + utcDateTime);

		ZonedDateTime istDateTimeFromUTC = utcDateTime.withZoneSameInstant(istZoneId);

		System.out.println("3. Converting from UTC to IST back" + istDateTimeFromUTC);

		// Now to convert date into more readable format

		DateTimeFormatter outpuFormatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm");

		String istDate = istDateTimeFromUTC.format(outpuFormatter);
		System.out.println(istDate);
	}

}
