package com.Collections.List;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class WeekendDates {

	public static void main(String[] args) {
		List<LocalDate> dates = Arrays.asList(LocalDate.of(2025, 4, 14), LocalDate.of(2025, 4, 13),
				LocalDate.of(2025, 4, 12), LocalDate.of(2025, 4, 11));
		
		List<LocalDate> weekendDates = dates.stream().filter(date -> { DayOfWeek day = date.getDayOfWeek(); 
										return day == DayOfWeek.SATURDAY || day == DayOfWeek.SUNDAY;}).collect(Collectors.toList());
		
		System.out.println("Weekend dates are: "+ weekendDates);
		
				
				
				
	}
}
