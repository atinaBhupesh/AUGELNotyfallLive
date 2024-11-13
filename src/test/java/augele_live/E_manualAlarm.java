package augele_live;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;

public class E_manualAlarm extends B_baseClass




{

	@FindBy(xpath = "//span[text()=\"Alarm\"]")private WebElement manualAlarmModule;
	@FindBy(xpath = "//span[text()=\"Manage Alarm\"]")private WebElement manageAlarm;
	@FindBy(xpath="//a[@href=\"https://augel-notfall-frontend.azurewebsites.net/admin/Alarms/add\"]")private WebElement add;
//	@FindBy(xpath = "//button[@class=\"btn btn-success\"]")private WebElement createNewButton;
	 @FindBy(xpath="//a[@href=\"https://augel-notfall-frontend.azurewebsites.net/admin/Alarms/index\"]")private WebElement list;
	@FindBy(xpath = "//span[text()=\"Select Department\"]")private WebElement fireDepartmentField;
	@FindBy(xpath = "//input[@placeholder=\"Select Firestation\"]")
	private WebElement fireStationField;
	@FindBy(xpath = "//textarea[@id=\"AlarmTitleDe\"]")
	private WebElement titlefield;
	@FindBy(xpath = "//textarea[@id=\"AlarmDescriptionDe\"]")
	private WebElement descriptionField;
	@FindBy(xpath = "//input[@id=\"inlineRadio1\"]")
	private WebElement userTypeAttribute;
	@FindBy(xpath = "//input[@placeholder=\"Select Vehicle/Cars\"]")
	private WebElement vehicleField;
	@FindBy(xpath = "//input[@id=\"selectCheckboxes\"]")
	
	private WebElement selectAllCheckBox;

	
	@FindBy(xpath = "//input[@id=\"user_id\" and @value=\"18336\"]")private WebElement RA1;
	//@FindBy(xpath = "//input[@id=\"user_id\" and @value=\"18336\"]")private WebElement RA1;
	@FindBy(xpath = "//textarea[@id=\"AlarmAddress\"]")
	private WebElement adressFeild;
	@FindBy(xpath = "//input[@id=\"locationDrag\"]")
	private WebElement dragMarkerOnMapCheckBox;
	@FindBy(xpath = "//button[@id=\"addSubmit\"]")
	private WebElement grenrateAlarmButton;
	@FindBy(xpath = "//button[@id=\"addSubForm\"]")
	private WebElement alarmYesButton;

	@FindBy(xpath = "//input[@id=\"inlineRadio2\"]")private WebElement userTypeResource;


	@FindBy(xpath = "//input[@id=\"inlineRadio3\"]")private WebElement userTypeFireFighter;

	
	
	@FindBy(xpath = "//input[@aria-controls=\"alarmTable\"]")
	private WebElement searchField;
	@FindBy(xpath = "//button[@id=\"dt_actionSearch\"]")
	private WebElement searchButton;
	@FindBy(xpath = "(//i[@class=\"fa fa-trash-o\"])[1]")
	private WebElement delete;
	@FindBy(xpath = "//button[@id=\"delRec\"]")
	private WebElement deleteYes;

	@FindBy(xpath = "(//a[@title=\"Chat\"])[1]")
	private WebElement chatOptions;
	@FindBy(xpath = "//input[@placeholder=\"Write your message...\"]")
	private WebElement writemessageField;
	@FindBy(xpath = "//button[@id=\"actionSendMessage\"]")
	private WebElement sendmessageButton;
	@FindBy(xpath="//input[@class=\"upload\"]")private WebElement attachFile;
	
	
	@FindBy(xpath = "(//i[@class=\"fa fa-user-plus\"])[1]")
	private WebElement extendAlarmButton;

	
	@FindBy(xpath = "//input[@id=\"information_1\"]")
	private WebElement addInfoField1;
	@FindBy(xpath = "//input[@id=\"information_2\"]")
	private WebElement addInfoField2;
	@FindBy(xpath = "//input[@id=\"information_3\"]")
	private WebElement addInfoField3;
	@FindBy(xpath = "//input[@id=\"information_4\"]")
	private WebElement addInfoField4;
	@FindBy(xpath = "//input[@id=\"information_5\"]")
	private WebElement addInfoField5;
	@FindBy(xpath = "//button[@id=\"addSubmit\"]")
	private WebElement save;

	@FindBy(xpath = "//input[@name=\"data[Alarm][low_priority]\"]")
	private WebElement lowPriorityCheckBox;

	 @FindBy(xpath="//span[@class=\"select2-selection__placeholder\"]")private WebElement selectStationForStationAlarm;
		@FindBy(xpath="//select[@name=\"alarmTable_length\"]")private WebElement alarmLength;
	 @FindBy(xpath="(//span[text()=\"Active\"])[1]")private WebElement deactiveAlarm;
	@FindBy(xpath="//button[@id=\"statChange\"]")private WebElement changeStatusYes;
	 @FindBy(xpath="//span[@class=\"hidden-xs\"]")private WebElement user;
	 
	 
	 
	@FindBy(xpath = "//input[@value=\"152\"]")private WebElement swargetA1;
	@FindBy(xpath = "//input[@value=\"59\"]")private WebElement SwarR1;
	@FindBy(xpath = "//input[@value=\"60\"]")	private WebElement swarREsc;
	@FindBy(xpath = "//input[@value=\"557\"]")private WebElement dhanrajS;
	@FindBy(xpath = "//input[@value=\"558\"]")private WebElement nikhilS;
	@FindBy(xpath = "//input[@value=\"162\"]")private WebElement chtrapatiA1;
	 
	 
	 
	
	// @FindBy(xpath="")private WebElement ;
	// @FindBy(xpath="")private WebElement ;
	// @FindBy(xpath="")private WebElement ;
	// @FindBy(xpath="")private WebElement ;
	// @FindBy(xpath="")private WebElement ;
	// @FindBy(xpath="")private WebElement ;
	// @FindBy(xpath="")private WebElement ;
	// @FindBy(xpath="")private WebElement ;
	// @FindBy(xpath="")private WebElement ;
	// @FindBy(xpath="")private WebElement ;
	// @FindBy(xpath="")private WebElement ;
	// @FindBy(xpath="")private WebElement ;
	// @FindBy(xpath="")private WebElement ;
	// @FindBy(xpath="")private WebElement ;
	// @FindBy(xpath="")private WebElement ;
	// @FindBy(xpath="")private WebElement ;
	// @FindBy(xpath="")private WebElement ;
	// @FindBy(xpath="")private WebElement ;
	// @FindBy(xpath="")private WebElement ;
	// @FindBy(xpath="")private WebElement ;
	// @FindBy(xpath="")private WebElement ;
	// @FindBy(xpath="")private WebElement ;
	// @FindBy(xpath="")private WebElement ;
	// @FindBy(xpath="")private WebElement ;
	// @FindBy(xpath="")private WebElement ;
	// @FindBy(xpath="")private WebElement ;
	// @FindBy(xpath="")private WebElement ;
	// @FindBy(xpath="")private WebElement ;
	// @FindBy(xpath="")private WebElement ;
	// @FindBy(xpath="")private WebElement ;
	// @FindBy(xpath="")private WebElement ;
	// @FindBy(xpath="")private WebElement ;
	// @FindBy(xpath="")private WebElement ;
	// @FindBy(xpath="")private WebElement ;
	// @FindBy(xpath="")private WebElement ;
	// @FindBy(xpath="")private WebElement ;
	// @FindBy(xpath="")private WebElement ;
	// @FindBy(xpath="")private WebElement ;
	// @FindBy(xpath="")private WebElement ;
	// @FindBy(xpath="")private WebElement ;
	// @FindBy(xpath="")private WebElement ;
	// @FindBy(xpath="")private WebElement ;
	// @FindBy(xpath="")private WebElement ;
	// @FindBy(xpath="")private WebElement ;
	// @FindBy(xpath="")private WebElement ;
	// @FindBy(xpath="")private WebElement ;
	// @FindBy(xpath="")private WebElement ;
	// @FindBy(xpath="")private WebElement ;

	public E_manualAlarm(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void manualAlarmCommon(WebDriver driver) throws Throwable {
		manualAlarmModule.click();
		Thread.sleep(1000);
	
		manageAlarm.click();
		Thread.sleep(1000);
		
	
		

	}

	public void manualAlarmByAttribute(WebDriver driver, String date) throws Throwable {
		Actions act = new Actions(driver);
		add.click();
		Thread.sleep(1000);

//		createNewButton.click();
	
		fireDepartmentField.click();
	
		act.sendKeys("pune").build().perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(2000);
		fireStationField.click();
		
		act.sendKeys("swarget").build().perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.ENTER).build().perform();
	
		titlefield.click();
	
		act.sendKeys("BG-manual alarm by attribute-" + date).build().perform();
	
		descriptionField.click();
	
		act.sendKeys("BG-manual alarm by attribute checking.").build().perform();
	
		
	
		userTypeAttribute.click();
		Thread.sleep(2000);
		vehicleField.click();

		act.sendKeys("SwarV1").build().perform();
		Thread.sleep(3000);
		act.sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(2000);
		selectAllCheckBox.click();
		
		selectAllCheckBox.click();
	
		swargetA1.click();
		//RA1.click();

		adressFeild.click();
		Thread.sleep(2000);
		act.sendKeys("BAPS Swaminarayan mandir, Wathoda Layout, Nagpur, Maharashtra 440035").build().perform();
	
		
	
		dragMarkerOnMapCheckBox.click();
	
		grenrateAlarmButton.click();
	
		alarmYesButton.click();

	
		

	}
	
	
	



	public void manualAlarmByResource(WebDriver driver, String date) throws Throwable {
		Actions act = new Actions(driver);
		add.click();
		Thread.sleep(1000);
//		createNewButton.click();
		
		fireDepartmentField.click();
	
		act.sendKeys("pune").build().perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(2000);
		fireStationField.click();
		
		act.sendKeys("swarget").build().perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.ENTER).build().perform();
		
		titlefield.click();
		
		act.sendKeys("BG-manual alarm by resource-" + date).build().perform();
	
		descriptionField.click();
		
		act.sendKeys("BG-manual alarm by resource checking.").build().perform();
	
		
	
		userTypeResource.click();
		Thread.sleep(2000);
		selectAllCheckBox.click();

		selectAllCheckBox.click();
		
		SwarR1.click();
	
		adressFeild.click();
	
		act.sendKeys("YES Hospital, Plot no. 1 & 1A, Dighori Flyover Square, Dighori, Nagpur, Maharashtra 440017").build().perform();
		
		
	
		dragMarkerOnMapCheckBox.click();
		
		grenrateAlarmButton.click();
		alarmYesButton.click();
		

	
		

	}
	
	
	
	

	public void manualAlarmByFireFighter(WebDriver driver, String date) throws Throwable {
		Actions act = new Actions(driver);
		add.click();
		Thread.sleep(1000);
//		createNewButton.click();
		
		fireDepartmentField.click();
		
		act.sendKeys("pune").build().perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(2000);
		fireStationField.click();
		
		act.sendKeys("swarget").build().perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(2000);
		titlefield.click();
		
		act.sendKeys("BG-manual alarm by firefighter-" + date).build().perform();
	
		descriptionField.click();
		
		act.sendKeys("BG-manual alarm by firefighter checking.").build().perform();
	
		
	
		userTypeFireFighter.click();
		Thread.sleep(2000);
		vehicleField.click();
	
		act.sendKeys("swarV1").build().perform();
		Thread.sleep(3000);
		act.sendKeys(Keys.ENTER).build().perform();
		
		selectAllCheckBox.click();
		Thread.sleep(1000);
		selectAllCheckBox.click();
		Thread.sleep(1000);
		nikhilS.click();
		Thread.sleep(1000);
		dhanrajS.click();
		Thread.sleep(1000);
	
		
		

		adressFeild.click();
	
		act.sendKeys("Imperial Celebration Hall, Power House, 35, Mankapur Ring Rd, Mhalgi Nagar, Nagpur, Maharashtra 440034").build().perform();
		
		
	
		dragMarkerOnMapCheckBox.click();
	
		grenrateAlarmButton.click();
		
		alarmYesButton.click();
		

	
	
	}
	public void manualAlarmLowPriorityByAttribute(WebDriver driver, String date) throws Throwable {
		Actions act = new Actions(driver);
		add.click();
		Thread.sleep(1000);
//		createNewButton.click();
		
		fireDepartmentField.click();
	
		act.sendKeys("pune").build().perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(2000);
		fireStationField.click();
		
		act.sendKeys("swarget").build().perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(2000);
		titlefield.click();
		
		act.sendKeys("BG-low priority manual alarm by attribute-" + date).build().perform();
		
		descriptionField.click();
		
		act.sendKeys("BG-low priority manual alarm by attribute checking.").build().perform();
		
		
	
		userTypeAttribute.click();
	
		vehicleField.click();
		
		act.sendKeys("swarv1").build().perform();
	
		act.sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(2000);
		selectAllCheckBox.click();
	
		selectAllCheckBox.click();
	
		swargetA1.click();
	
	
		lowPriorityCheckBox.click();
	
		adressFeild.click();
	
		act.sendKeys("Ranjana Celebration Hall, Suyog Nagar Square, Outer Ring Rd, Nagpur, Maharashtra 440015").build().perform();
	
		
	
		dragMarkerOnMapCheckBox.click();
	
		grenrateAlarmButton.click();
	
		alarmYesButton.click();
	
	


	}
	
	

	
	
	
	
	
	
	
	

	public void manualAlarmByEscalationResource(WebDriver driver, String date) throws Throwable {
		Actions act = new Actions(driver);
		add.click();
		Thread.sleep(1000);
//		createNewButton.click();
	
		fireDepartmentField.click();
	
		act.sendKeys("pune").build().perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(2000);
		fireStationField.click();

		act.sendKeys("swarget").build().perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(2000);
		titlefield.click();
		
		act.sendKeys("BG-manual alarm by escalation resource-" + date).build().perform();
	
		descriptionField.click();
	
		act.sendKeys("BG-manual alarm by escalation resource checking.").build().perform();
		
		
		
		userTypeResource.click();
		
		selectAllCheckBox.click();
	
		selectAllCheckBox.click();
	
		swarREsc.click();
		
		adressFeild.click();
		
		act.sendKeys("Tapasya Vidya Mandir, 4446+52G, Vinkar Colony, Manewada, Nagpur, Maharashtra 440024").build().perform();
	
		
		
		dragMarkerOnMapCheckBox.click();
		
		grenrateAlarmButton.click();
		
		alarmYesButton.click();
		

	
		

	}
	

	
	public void extendAlarm(WebDriver driver, String date) throws Throwable {
		Actions act = new Actions(driver);
		
		list.click();
		Thread.sleep(1000);
		searchField.click();
		
		act.sendKeys("BG-low priority").build().perform();
		
		searchButton.click();
		Thread.sleep(2000);
		extendAlarmButton.click();
		Thread.sleep(2000);
		fireStationField.click();

		act.sendKeys("chatrapati").build().perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(2000);
		userTypeAttribute.click();
	

		
		
		chtrapatiA1.click();
		
		addInfoField1.click();
	
		act.sendKeys("additional info 1").build().perform();
	
		addInfoField2.click();

		act.sendKeys("additional info 2").build().perform();
	
		addInfoField3.click();
	
		act.sendKeys("additional info 3").build().perform();
	
		addInfoField4.click();
		
		act.sendKeys("additional info 4").build().perform();
		
		addInfoField5.click();
	
		act.sendKeys("additional info 5").build().perform();
	
		save.click();
	
	
		

	}
	
	
	
	
	
	

	public void sendmessageToAlarmUser(WebDriver driver, String date) throws Throwable
	{
		Actions act = new Actions(driver);

		searchField.click();

		act.sendKeys("BG-low priority manual alarm by attribute").build().perform();
		
		searchButton.click();
		Thread.sleep(2000);
		chatOptions.click();
	
		writemessageField.click();
	
		act.sendKeys("message-alarm users").build().perform();
		
		sendmessageButton.click();
		
		Thread.sleep(1000);
		act.moveToElement(attachFile).click().build().perform();
		Thread.sleep(1000);
		
		StringSelection ss= new StringSelection("C:\\Users\\BHUPESH\\Desktop\\New folder\\FireFighter.png");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		
		
		Robot rc=new Robot();
		Thread.sleep(2000);
		rc.keyPress(KeyEvent.VK_CONTROL);
		rc.keyPress(KeyEvent.VK_V);
		Thread.sleep(2000);
		rc.keyRelease(KeyEvent.VK_CONTROL);
		rc.keyRelease(KeyEvent.VK_V);
		Thread.sleep(2000);
		rc.keyPress(KeyEvent.VK_ENTER);
		rc.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		
		writemessageField.click();
		
		act.sendKeys("image-alarm users").build().perform();
		Thread.sleep(2000);
		sendmessageButton.click();
		Reporter.log("image attached properly",true);
		
		
		Thread.sleep(1000);
		act.moveToElement(attachFile).click().build().perform();
		Thread.sleep(1000);
		
		StringSelection ss1= new StringSelection("C:\\Users\\BHUPESH\\Desktop\\New folder\\Automation Test.pdf");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss1, null);
		
		

		Thread.sleep(2000);
		rc.keyPress(KeyEvent.VK_CONTROL);
		rc.keyPress(KeyEvent.VK_V);
		Thread.sleep(2000);
		rc.keyRelease(KeyEvent.VK_CONTROL);
		rc.keyRelease(KeyEvent.VK_V);
		Thread.sleep(2000);
		rc.keyPress(KeyEvent.VK_ENTER);
		rc.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		
		writemessageField.click();
		
		act.sendKeys("pdf-alarm users").build().perform();
		Thread.sleep(2000);
		sendmessageButton.click();
		Reporter.log("pdf attached properly",true);
		
		Thread.sleep(1000);
		act.moveToElement(attachFile).click().build().perform();
		Thread.sleep(1000);
		
		StringSelection ss2= new StringSelection("C:\\Users\\BHUPESH\\Desktop\\New folder\\Notes.docx");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss2, null);
		
		

		Thread.sleep(2000);
		rc.keyPress(KeyEvent.VK_CONTROL);
		rc.keyPress(KeyEvent.VK_V);
		Thread.sleep(2000);
		rc.keyRelease(KeyEvent.VK_CONTROL);
		rc.keyRelease(KeyEvent.VK_V);
		Thread.sleep(2000);
		rc.keyPress(KeyEvent.VK_ENTER);
		rc.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		
		writemessageField.click();
		
		act.sendKeys("word file -alarm users").build().perform();
		Thread.sleep(2000);
		sendmessageButton.click();
		Reporter.log("word file attached properly",true);
		
	
		
	}
	
	
	
	
	public void deactiveManualAlarms(WebDriver driver, String date) throws Throwable {
		Actions act = new Actions(driver);
				
		
		manualAlarmModule.click();
		Thread.sleep(1000);
		manageAlarm.click();
		Thread.sleep(1000);
		list.click();
		Thread.sleep(1000);
		
		
		Select se = new Select(alarmLength);
		se.selectByVisibleText("100");
		Thread.sleep(2000);
	

		for (int i = 1; i <= 100; i++) {
			searchField.click();
			
			act.sendKeys("BG").build().perform();
			
			searchButton.click();
			Thread.sleep(2000);
		
			deactiveAlarm.click();
			Thread.sleep(1000);
			changeStatusYes.click();
			Thread.sleep(1000);
			Reporter.log("Alarm number-" + i + " is deleted sucessfully.", true);
			Thread.sleep(2000);
		   driver.navigate().refresh();
		   Thread.sleep(1000);;

		}

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	public void deleteAlarms(WebDriver driver, String date) throws Throwable {
		Actions act = new Actions(driver);
				
		manualAlarmModule.click();
		Thread.sleep(1000);
		manageAlarm.click();
		Thread.sleep(1000);
		list.click();
		Thread.sleep(1000);
	
		Select se = new Select(alarmLength);
		se.selectByVisibleText("100");
		Thread.sleep(2000);
		
		for (int i = 1; i <= 132; i++) {
			searchField.click();
			
			act.sendKeys("BG").build().perform();
			
			searchButton.click();
			Thread.sleep(3000);
		
			delete.click();
		
			deleteYes.click();
			
			Reporter.log("Alarm number-" + i + " is deleted sucessfully.", true);
			Thread.sleep(2000);
		   driver.navigate().refresh();
		   Thread.sleep(1000);;

		}

	}

	

}