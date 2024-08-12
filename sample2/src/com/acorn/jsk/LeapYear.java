package com.acorn.jsk;

/**
 * 서력 기원 연수가 4로 나누어 떨어지는 해는 윤년으로 한다. (1988년, 1992년, 1996년, 2004년, 2008년, 2012년,
 * 2016년, 2020년, 2024년, 2028년, 2032년, 2036년, 2040년, 2044년 ...) 서력 기원 연수가 4,
 * 100으로 나누어 떨어지는 해는 평년으로 한다. (1900년, 2100년, 2200년, 2300년, 2500년...) 서력 기원 연수가
 * 4, 100, 400으로 나누어 떨어지는 해는 윤년으로 둔다. (2000년, 2400년...)
 */

public class LeapYear {

	public static boolean isLeapYear(int year) {
		if (year % 4 == 0) {
			if (year % 100 == 0) {
				if (year % 400 == 0) {
					return true;
				} else {
					return false;
				}
			} else {
				return true;
			}
		} else {
			return false;
		}

	}
}
