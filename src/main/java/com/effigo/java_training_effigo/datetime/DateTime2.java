package com.effigo.java_training_effigo.datetime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;

public class DateTime2 {

	public static void main(String[] args) {

		String input = "29/01/2024 01:00";

		DateTimeFormatter inpuFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

		LocalDateTime dt = LocalDateTime.parse(input, inpuFormatter);
		System.out.println(dt);
		

		LocalDateTime plusDaysByOne = dt.plusDays(1);
		System.out.println("\nAfter adding 1 day : " + plusDaysByOne);
		

		LocalDateTime minusDaysByTen = dt.minusDays(10);
		System.out.println("\nAfter Substracting 10 days : " + minusDaysByTen);
		

		LocalDateTime plusByOneHour = dt.plusHours(1);
		System.out.println("\nAfter adding 1 Hour : " + plusByOneHour);
		

		LocalDateTime custom = dt.minusHours(5).minusMinutes(30);
		System.out.println("\nAfter Substracting 5:30 minutes : " + custom);
		

		ArrayList<LocalDateTime> list = new ArrayList<>();
		list.add(dt);
		list.add(plusDaysByOne);
		list.add(minusDaysByTen);
		list.add(plusByOneHour);
		list.add(custom);

		Collections.sort(list);

		System.out.println();
		System.out.println(list);
	}
}
