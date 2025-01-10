package testClass;
import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import Automation_Core.BaseClass;

import org.openqa.selenium.support.ui.ExpectedConditions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.List;


public class GoogleNews extends BaseClass {
	
		
@Test
		public void test_class() throws IOException 	
		
	         {
	            // Navigate to Google News
	            	            // Wait for the page to load
	            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	            wait.until(ExpectedConditions.presenceOfElementLocated(By.tagName("body")));

	            // Search for a topic
	            WebElement searchBox = driver.findElement(By.xpath("//input[@class='Ax4B8 ZAGvjd']"));
	            searchBox.sendKeys("Technology");
	                   
	            searchBox.click();
            
	            WebElement home=driver.findElement(By.xpath("//a[@class='brSCsc'and text()='Home']"));
	            home.click();
	            JavascriptExecutor js=(JavascriptExecutor)driver;
	            WebElement ForYou=driver.findElement(By.xpath("//a[@class='brSCsc'and text()='For you']"));
	            js.executeScript("arguments[0].click();",ForYou);
	            //ForYou.click();
	            String string1="ForYou";
	            Assert.assertEquals(ForYou,string1);
	            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//main")));
	            List<WebElement> headlines = driver.findElements(By.xpath("//article//h3"));
	            System.out.println("Headlines:");
	            for (WebElement headline : headlines) {
	                System.out.println("- " + headline.getText());
	            
	            WebDriverWait wait1=new WebDriverWait(driver,Duration.ofSeconds(10));
	            wait1.until(ExpectedConditions.visibilityOfElementLocated(By.id("")));
	            Assert.assertEquals(false,true);
	            
	            File screenshot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	            FileUtils.copyFile(screenshot,new File("screenshot.png"));
	       	            
	            WebDriverWait wait1=new WebDriverWait(driver,Duration.ofSeconds(10));
	            wait1.until(ExpectedConditions.visibilityOfElementLocated(By,id("")));
	            Assert.assertEquals(false,true);
	            WebDriverWait wait2=new WebDriverWait(driver,Duration.ofSeconds(10));
	            wait1.until(ExpectedConditions.visibilityOfElementLocated(By.id("")));
	           
	       	            
	           }
	       
	            JavascriptExecutor js2=(JavascriptExecutor)driver;
	            js2.executeScript("argument[0].click()",driver);
	            WebDriverWait wait2=new WebDriverWait(driver,Duration.ofSeconds(20));
	            Assert.assertEquals(false, null);
                File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	            FileUtils.copyFile(screenshot, new File("screenshot.png"));
	           
	            
	            JavascriptExecutor js3=(JavascriptExecutor)driver;
	            js3.executeScript("",driver);
	            WebDriverWait wait2DriverWait=new WebDriverWait(driver,Duration.ofSeconds(20));
	            
	            
	            
	         }
					
				public void fileReader()	                      
	                	{
	                    String filePath = "path/to/your/file.xlsx";

	                    try (FileInputStream fis = new FileInputStream(filePath);
	                         Workbook workbook = new XSSFWorkbook(fis)) {

	                        Sheet sheet = workbook.getSheetAt(0);
	                        for (Row row : sheet) {
	                            for (Cell cell : row) {
	                                switch (cell.getCellType()) {
	                                    case STRING:
	                                        System.out.print(cell.getStringCellValue() + " ");
	                                        break;
	                                    case NUMERIC:
	                                        System.out.print(cell.getNumericCellValue() + " ");
	                                        break;
	                                    default:
	                                        break;
	                                }
	                            }
	                            System.out.println();
	                        }
	                    } catch (IOException e) {
	                        e.printStackTrace();
	                                    
	                    }
	                    
	                 
	                    
	               }
				}

	  
	


