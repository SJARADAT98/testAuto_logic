package screenshot;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;

public class ScreenShot {

	public static void main(String[] args) throws IOException{
		System.setProperty("webdriver.edge.driver", "C:\\Users\\Saja\\Documents\\edgedriver\\msedgedriver.exe");
				
		        WebDriver driver= new EdgeDriver();
		        driver.get("http://127.0.0.1:5500/index.html");
		       //   Date currenTime = new Date (); 
				
			//	String screenshotFileName = currenTime.toString().replace(":", "-");
				//	TakesScreenshot scrShot =((TakesScreenshot)driver);
					//File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
					//File DestFile=new File("c://screenshot/"+screenshotFileName+".png");
					//FileUtils.copyFile(SrcFile,  DestFile);
					
					List <WebElement> thestudent=driver.findElements(By.tagName("option"));
					int total=thestudent.size();
                    int hmt=1;
                    for(int i=0;i<hmt;i++) {
                    	driver.findElement(By.xpath("//*[@id=\"remove\"]")).click();	}
                    List <WebElement> theStudentNew=driver.findElements(By.tagName("option"));
              
                    int actual=theStudentNew.size();
                    int expectedItems=total-hmt;
                   
                    Assert.assertEquals(actual, expectedItems);
		        
		        
		        
		        
		        
		        
		        
		        
		        
		        
		        
		        
		        
		        
		        
		        
	}

}
