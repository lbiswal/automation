package com.cleartrip;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.*;simport java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class BookingFlightAutomation {

	DateFormat dateFormat2 = new SimpleDateFormat("dd");
	Date date2 = new Date();

	String today = dateFormat2.format(date2);

	String returnDate = today + 10;

	WebDriver driver = new FirefoxDriver();

	driver.get("https://www.cleartrip.com");

	driver.findElement(By.xpath("//a[@href='/flights' and @title='Find flights from and to international destinations around the world']")).click();

	driver.findElement(By.xpath("//label[@title='Round trip']")).click();driver.findElement(By.xpath("//input[@id='FromTag']")).clear();

	driver.findElement(By.xpath("//input[@id='FromTag']")).sendKeys("Delhi");

	driver.findElement(By.xpath("//input[@id='ToTag']")).clear();

	driver.findElement(By.xpath("//input[@id='ToTag']")).sendKeys("Mumbai");

	List <WebElement> dates = driver.findElement(By.xapth("//div[@id='ui-datepicker-div']"));

	for(
	WebElement date:dates)
	{
		if (date.getText().equals(today)) {
			date.click();
			break;
		}
	}

	List<WebElement> rDates = driver.findElement(By.xpath("//input[@id='ReturnDate']"));for(
	WebElement date:dates)
	{
		if (date.getText().equals(returnDate)) {
			date.click();
			break;
		}
	}

	driver.findElement(By.xpath("//input[@id='SearchBtn']")).click();

}
