package com.mz.ig.core.utils;

import java.time.LocalDate;
import java.time.Period;

import com.mz.ig.shared_domain.entity.DTO.AgeRangeDTO;

public class AgeRange {

	public static AgeRangeDTO calculateAgeRange(LocalDate birthDate) {
		if (birthDate == null) {
			throw new IllegalArgumentException("birthDate cannot be null");
		}

		int age = Period.between(birthDate, LocalDate.now()).getYears();
		String ageRange;

		if (age < 16) {
			ageRange = "CONFIRMACAO";
		} else if (age >= 17 && age <= 35) {
			ageRange = "JUVENTUDE";
		} else if (age >= 36 && age <= 60) {
			ageRange = "ADULTO";
		} else {
			ageRange = "DONZELA E MANCEBO";
		}

		AgeRangeDTO ageRangeDTO = new AgeRangeDTO();
		ageRangeDTO.setAge(Integer.toString(age));
		ageRangeDTO.setAgeRange(ageRange);

		return ageRangeDTO;
	}
}
