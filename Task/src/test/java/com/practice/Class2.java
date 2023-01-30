package com.practice;

import org.openqa.selenium.WebDriver;

public class Class2 {
	private static  WebDriver driver = null;

	public static void main(String[] args) {
		Day1 s =new Day1();
		s.task1(driver, "Ajith");
		s.task2(driver);
	}

}
