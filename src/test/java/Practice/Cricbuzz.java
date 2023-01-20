package Practice;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.Map.Entry;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Cricbuzz {
	public static void main(String[] args) throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.cricbuzz.com/live-cricket-scorecard/56724/pak-vs-nz-2nd-test-new-zealand-tour-of-pakistan-2022-23");
	List<WebElement> wick=driver.findElements(By.xpath("//span[text()='Pakistan 1st Innings']/parent::div/parent::div/following-sibling::div[@class='cb-col cb-col-100 cb-ltst-wgt-hdr']/div[@class='cb-col cb-col-100 cb-scrd-itms ']/div[@class='cb-col cb-col-8 text-right text-bold']"));
	
	int count = wick.size();
	
	String[] a=new String[count];
	
	for(int i=0;i<count-1;i++)
	{
		WebElement w=wick.get(i);
		String s=w.getText();
		
		
               a[i]=s;
	}
	
	int largest=0;
	for(int j=0;j<count-1;j++)
	{
		if(Integer.parseInt(a[j])>largest)
			
		{
			largest=Integer.parseInt(a[j]);		
			}
	}
	
	System.out.println(largest);
	
	
//List<WebElement> wicketPlayername=driver.findElements(By.xpath("//span[text()='New Zealand 1st Innings']/parent::div/parent::div/following-sibling::div[@class='cb-col cb-col-100 cb-ltst-wgt-hdr']/div[@class='cb-col cb-col-100 cb-scrd-itms ']/div[@class='cb-col cb-col-8 text-right text-bold' and text()='"+largest+"']/parent::div/div/a"));
List<WebElement> wicketPlayername=driver.findElements(By.xpath("//span[text()='Pakistan 1st Innings']/ancestor::div[@class='cb-col cb-col-100 cb-ltst-wgt-hdr']/following-sibling::div[@class='cb-col cb-col-100 cb-ltst-wgt-hdr']/div[@class='cb-col cb-col-100 cb-scrd-itms ']/div[@class='cb-col cb-col-8 text-right text-bold' and text()='"+largest+"']/preceding-sibling::div[@class='cb-col cb-col-40']/a"));
for(WebElement wP:wicketPlayername)
{
	String wp=wP.getText();
	System.out.println(wp);
}
Thread.sleep(2000);
	//driver.close();
}
	
}
