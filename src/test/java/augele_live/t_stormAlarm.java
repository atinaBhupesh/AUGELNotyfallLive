package augele_live;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class t_stormAlarm {
	
	
	    @FindBy(xpath="//i[@class=\"fa fa-bolt\"]")private WebElement storm;
		@FindBy(xpath="//span[text()=\"Manage Emergencies\"]")private WebElement manageEmergencies;
		@FindBy(xpath="//a[@href=\"https://augel-notfall-frontend.azurewebsites.net/admin/Emergencies/add\"]")private WebElement add;
		@FindBy(xpath="//button[@class=\"btn btn-success\"]")private WebElement createNew;
		@FindBy(xpath="//span[@class=\"select2-selection__placeholder\"]")private WebElement selectDepartment ;
		@FindBy(xpath="//span[@class=\"select2-selection select2-selection--multiple\"]")private WebElement selectStation;
		@FindBy(xpath="//textarea[@id=\"AlarmTitleDe\"]")private WebElement alarmTitle;
		@FindBy(xpath="//textarea[@id=\"AlarmDescriptionDe\"]")private WebElement alarmDetails;
		@FindBy(xpath="//input[@id=\"inlineRadio2\"]")private WebElement userTypeResource;

		@FindBy(xpath="//textarea[@id=\"AlarmAddress\"]")private WebElement alarmAddress;
		@FindBy(xpath="//button[@id=\"addSubmit\"]")private WebElement save;
		@FindBy(xpath="//button[@id=\"addSubForm\"]")private WebElement genrateAlarm;
		
		@FindBy(xpath="//a[@href=\"https://augel-notfall-frontend.azurewebsites.net/admin/Emergencies/dashboard\"]")private WebElement stormDashboard ;
		@FindBy(xpath="//input[@class=\"form-control input-sm\" and @aria-controls=\"example2\"]")private WebElement searchField;
		@FindBy(xpath="(//span[@class=\"call\"])[2]")private WebElement dragADST07R2;
		@FindBy(xpath="(//span[@class=\"call\"])[1]")private WebElement dropADST06R2;
		@FindBy(xpath="//button[@data-alarmbox=\"droppableResource1\"]")private WebElement sendAlarm;
		@FindBy(xpath="//button[@class=\"btn btn-green\"]")private WebElement confirmSendAlarm;
		 
		
		@FindBy(xpath = "//input[@value=\"60\"]")	private WebElement swarREsc;
		// @FindBy(xpath="")private WebElement ;
		// @FindBy(xpath="")private WebElement ;
		// @FindBy(xpath="")private WebElement ;
		// @FindBy(xpath="")private WebElement ;
		// @FindBy(xpath="")private WebElement ;
		// @FindBy(xpath="")private WebElement ;
		// @FindBy(xpath="")private WebElement ;
				
			public t_stormAlarm (WebDriver driver) {
				PageFactory.initElements(driver, this);
			}
			
			
			
			
			
			public void stormAlarm(WebDriver driver,String dateDDMMYY,String gTimeHHMM) throws Throwable 
			{
				Actions act = new Actions(driver);
				
				
				storm.click();
				Thread.sleep(1000);
				manageEmergencies.click();
				Thread.sleep(1000);
				add.click();
				Thread.sleep(1000);
				//createNew.click();
				selectDepartment.click();
				act.sendKeys("pune").build().perform();
				Thread.sleep(2000);
				act.sendKeys(Keys.ENTER).build().perform();
				Thread.sleep(2000);
				selectStation.click();
				act.sendKeys("swarget").build().perform();
				Thread.sleep(2000);
				act.sendKeys(Keys.ENTER).build().perform();
				
				alarmTitle.click();
				
				act.sendKeys("BG-storm alarm by resource-" + dateDDMMYY+"_"+gTimeHHMM).build().perform();
				
				alarmDetails.click();
				
				act.sendKeys("BG-storm alarm by escalation.").build().perform();
				
				userTypeResource.click();
				Thread.sleep(2000);
				
				swarREsc.click();
				
				alarmAddress.click();
				
				act.sendKeys("BAPS Swaminarayan mandir, Wathoda Layout, Nagpur, Maharashtra 440035").build().perform();
				
				
				save.click();
				
				genrateAlarm.click();
				Thread.sleep(3000);
				
					
				
				
				
				
				
				
				
				
			}
			
			
			public void extendStormAlarm(WebDriver driver) throws Throwable 
			{
				Actions act = new Actions(driver);
				
				storm.click();
				stormDashboard.click();
				searchField.click();
				act.sendKeys("Cshivajir1").build().perform();
				Thread.sleep(2000);
				
				act.dragAndDrop(dragADST07R2, dropADST06R2).build().perform();
				Thread.sleep(1000);
				
				sendAlarm.click();
				Thread.sleep(1000);

				
				confirmSendAlarm.click();
			
				
				
				
				
				
			}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
