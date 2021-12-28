
package com.BaseClass_1;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Base_Of_Runner_1 {
	private static String value = null;
	public static WebDriver a;
	private static Workbook w;

	public static WebDriver getBrowser(String type) {
		if (type.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + "\\driver\\chromedriver.exe");
			a = new ChromeDriver();
		} else if (type.contains("firefox")) {
			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "\\driver\\geckodriver.exe");
			a = new FirefoxDriver();
		}
		a.manage().window().maximize();
		return a;
	}
	

	public static void url(String url) {
		a.get(url);
	}

	public static void timeouts() {
		a.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	public static void inputValue(WebElement element, String value) {
		element.sendKeys(value);
	}

	public static void clickOnElement(WebElement element) {
		element.click();
	}

	public static void sleep(long mills) throws InterruptedException {
		Thread.sleep(mills);
	}

	public static void dropdown(String type, WebElement element, String value) {
		Select s = new Select(element);
		if (type.equalsIgnoreCase("index")) {
			int index = Integer.parseInt(value);
			s.selectByIndex(index);
		} else if (type.equalsIgnoreCase("text")) {
			s.selectByVisibleText(value);
		} else if (type.equalsIgnoreCase("value")) {
			s.selectByValue(value);
		}
	}

	public static void deselect(String type, WebElement element, String value) {
		Select m = new Select(element);
		if (type.equalsIgnoreCase("index")) {
			int index = Integer.parseInt(value);
			m.deselectByIndex(index);
		} else if (type.equalsIgnoreCase("value")) {
			m.deselectByValue(value);
		} else if (type.equalsIgnoreCase("text")) {
			m.deselectByVisibleText(value);
		}
	}

	public static void actions(String type, WebElement element) {
		Actions n = new Actions(a);
		if (type.equalsIgnoreCase("click")) {
			n.click(element).build().perform();
		} else if (type.equalsIgnoreCase("contextclick")) {
			n.contextClick(element).build().perform();
		} else if (type.equalsIgnoreCase("doubleclick")) {
			n.doubleClick(element).build().perform();
		} else if (type.equalsIgnoreCase("moveTo")) {
			n.moveToElement(element).build().perform();
		} else if (type.equalsIgnoreCase("click&hold")) {
			n.clickAndHold(element).build().perform();
		}
	}

	public static void Scroll(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) a;
		js.executeScript("arguments[0].scrollIntoView();", element);

	}

	
	
	
	
public static   String Data(String path,int row_index, int cell_index  ) throws IOException {
	File f= new File(path);
	FileInputStream fis=new FileInputStream(f);
	w = new XSSFWorkbook(fis);
	Sheet sheetAt = w.getSheetAt(0);
	Row row = sheetAt.getRow(row_index);
	Cell cell = row.getCell(cell_index);
	CellType cellType = cell.getCellType();
	if (cellType.equals(CellType.STRING)) {
		value = cell.getStringCellValue();	
	}
	else if (cellType.equals(CellType.NUMERIC)) {
		double numericCellValue = cell.getNumericCellValue();
		int val=(int)numericCellValue;
		value =String.valueOf(val);
	}

 return value;

}	


	public static void clear(WebElement element) {
		element.clear();
	}

	public static void quit(WebDriver a) {
		a.quit();

	}

	public static void Wait(WebDriver element) throws InterruptedException {
		element.wait();

	}

	public static void close(WebDriver a) {
		a.close();
	}

	public static void screenshot() throws IOException {
		TakesScreenshot x = (TakesScreenshot) a;
		File input = x.getScreenshotAs(OutputType.FILE);
		File output = new File("C:\\Users\\GGG\\eclipse-workspace\\Maven_Project_1\\Screenshot\\snap1.png");
		FileUtils.copyFile(input, output);
	}
}
