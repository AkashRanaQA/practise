package com.generics;

import static org.testng.Assert.assertEquals;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

public class Basepage 
{
  //Select class
	public void selectByText(WebDriver driver, WebElement element, String text)
	{
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(element));
		Select select= new Select(element);
		select.selectByVisibleText(text);
	}
	public void selectByValue(WebDriver driver, WebElement element, String value)
	{
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(element));
		Select select= new Select(element);
		select.selectByValue(value);
	}
	public void selectByIndex(WebDriver driver, WebElement element, int index)
	{
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(element));
		Select select= new Select(element);
		select.selectByIndex(index);
	}
	public void deselectByText(WebDriver driver, WebElement element, String text)
	{
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(element));
		Select select= new Select(element);
		select.deselectByVisibleText(text);
	}
	public void deselectByValue(WebDriver driver, WebElement element, String value)
	{
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(element));
		Select select= new Select(element);
		select.deselectByValue(value);
	}
	public void deselectByIndex(WebDriver driver, WebElement element, int index)
	{
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(element));
		Select select= new Select(element);
		select.deselectByIndex(index);
	}
	public void deselectAll(WebDriver driver, WebElement element)
	{
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(element));
		Select select= new Select(element);
		select.deselectAll();
	}
	public void selectIsMultiple(WebDriver driver, WebElement element)
	{
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(element));
		Select select= new Select(element);
	    Assert.assertEquals(select.isMultiple(), true, "dropdown is not multiple");
	}
	public void getOptions(WebDriver driver, List<WebElement> elements, WebElement element, int expectedSize)
	{
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(element));
		Select select= new Select(element);
		List<WebElement> alloptions = select.getOptions();
		Reporter.log("size of list is :" + alloptions.size(), true);
		Assert.assertEquals(alloptions.size() , expectedSize, "size is not matching as expected");
	}
	public void getAllSelectedOptions(WebDriver driver, List<WebElement> elements, WebElement element, int expectedsize)
	{
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(element));
		Select select= new Select(element);
		List<WebElement> allselectoptions = select.getAllSelectedOptions();
		Reporter.log("size of list is :" + allselectoptions.size(), true);
		Assert.assertEquals(allselectoptions.size(), expectedsize, "size is not matching as expected");
	}
	public void getFirstSelectedOptions(WebDriver driver,WebElement element, String expectedFirstSelected)
	{
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(element));
		Select select= new Select(element);
		WebElement firstselectedoption = select.getFirstSelectedOption();
		Reporter.log("first selected option is :"+ firstselectedoption.getText());
        Assert.assertEquals(firstselectedoption.getText(), expectedFirstSelected, "text is not matching");		
	}
	
	//Action class
	public void clickOnElement(WebDriver driver, WebElement element)
	{
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(element));
		Actions action= new Actions(driver);
		action.click(element).perform();
	}
	public void doubleClickOnElement(WebDriver driver, WebElement element)
	{
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(element));
		Actions action= new Actions(driver);
		action.doubleClick(element).perform();
	}
	public void moveToElement(WebDriver driver, WebElement element)
	{
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(element));
		Actions action= new Actions(driver);
		action.moveToElement(element).perform();
	}
	public void rightClickOnElement(WebDriver driver, WebElement element)
	{
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(element));
		Actions action= new Actions(driver);
		action.contextClick(element).perform();
	}
	public void scrollToElement(WebDriver driver, WebElement element)
	{
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(element));
		Actions action= new Actions(driver);
		action.scrollToElement(element).perform();
	}
	public void enterDataElement(WebDriver driver, WebElement element, String value)
	{
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(element));
		Actions action= new Actions(driver);
		action.sendKeys(value).pause(Duration.ofSeconds(2)).perform();
	}
	public void dragAndDrop(WebDriver driver, WebElement sourceElement, WebElement targetElement)
	{
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(sourceElement));
		wait.until(ExpectedConditions.visibilityOf(targetElement));
		Actions action= new Actions(driver);
		action.dragAndDrop(sourceElement, targetElement).perform();
	}
	public void clickHoldElement(WebDriver driver, WebElement element)
	{
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(element));
		Actions action= new Actions(driver);
		action.clickAndHold(element).perform();
	}
	public void releaseElement(WebDriver driver, WebElement element)
	{
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(element));
		Actions action= new Actions(driver);
		action.release(element).perform();
	}
	public void dragDropSlider(WebDriver driver, WebElement element, int x, int y)
	{
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(element));
		Actions action= new Actions(driver);
		action.dragAndDropBy(element, x, y).perform(); 
	}
	
	//ChromeOptions class
	public void chromeHeadless()
	{
		ChromeOptions option= new ChromeOptions();
		option.addArguments("headless");
	}
	public void chromeStartMaximized()
	{
		ChromeOptions option= new ChromeOptions();
		option.addArguments("start-maximized");
	}
	public void chromeBlockNotification()
	{
		ChromeOptions option= new ChromeOptions();
		option.addArguments("disabale-notifications");
	}
	public void chromeIncognito()
	{
		ChromeOptions option= new ChromeOptions();
		option.addArguments("incognito");
	}
	public void chromeInecureWebsiteHandle()
	{
		ChromeOptions option= new ChromeOptions();
		option.setAcceptInsecureCerts(true);
	}
	public void chromeAddExtension(String extensionPath)
	{
		ChromeOptions option= new ChromeOptions();
		option.addExtensions(new File(extensionPath));
	}
	
	//Robot class
	public void robotEnter() throws AWTException
	{
		Robot robot= new Robot();
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.delay(1000);
		robot.keyRelease(KeyEvent.VK_ENTER);
	}
	
	//WebDriverWait class
	public void waitVisibilityOf(WebDriver driver, WebElement element)
	{
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	public void waitTitleIs(WebDriver driver, String title)
	{
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.titleIs(title));
	}
	public void waitTitleContains(WebDriver driver, String partialtitle)
	{
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.titleContains(partialtitle));
	}
	public void waitURLmatches(WebDriver driver, String url)
	{
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.urlMatches(url));
	}
	public void waitURLcontains(WebDriver driver, String partialUrl)
	{
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.urlContains(partialUrl));
	}
	public void waitElementToBeClickable(WebDriver driver, By locator)
	{
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(locator));
	}
	public void waitelementToBeSelected(WebDriver driver, By locator)
	{
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeSelected(locator));
	}
	public void waitTextToBe(WebDriver driver,By locator, String value)
	{
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.textToBe(locator, value));
	}
	public void waitVisibilityOfElementLocated(WebDriver driver, By locator)
	{
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}
	public void waitVisibilityOfAllElementLocated(WebDriver driver, By locator)
	{
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator));
	}
	public void waitAlertIsPresent(WebDriver driver)
	{
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.alertIsPresent());
	}
	public void waitAttributeContains(WebDriver driver, By locator, String attribute, String value)
	{
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.attributeContains(locator, attribute, value));
	}
	//Alert interface
	public void alertAccept(WebDriver driver)
	{
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.alertIsPresent());
		Reporter.log("text of alert is:"+ driver.switchTo().alert().getText(), true);
		driver.switchTo().alert().accept();
	}
	public void alertDismiss(WebDriver driver)
	{
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.alertIsPresent());
		Reporter.log("text of alert is:"+ driver.switchTo().alert().getText(), true);
		driver.switchTo().alert().dismiss();;
	}
	public void alertEnter(WebDriver driver, String text)
	{
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.alertIsPresent());
		Reporter.log("text of alert is:"+ driver.switchTo().alert(), true);
		Alert alert=driver.switchTo().alert();
		alert.sendKeys(text);
		alert.accept();
	}
	//Handling multiple windows
	public void parentWindow(WebDriver driver, String partialTitle, String expectedTitle)
	{
		String parentWindow = driver.getWindowHandle();
		driver.switchTo().window(parentWindow);
		Assert.assertEquals(driver.getTitle().contains(parentWindow), expectedTitle, "both title no match");
	}
	public void allWindows(WebDriver driver, String partialTitle, String expectedTitle)
	{
		Set<String> allWindows = driver.getWindowHandles();
		List<String> al= new ArrayList<>(allWindows);
		
		for (int i=0; i<al.size();i++)
		{
			driver.switchTo().window(al.get(i));
		}
		Assert.assertEquals(driver.getTitle().contains(partialTitle), expectedTitle, "both title no match");
	}
	//JavaScriptExecutor Interface
	public void javascriptClick(WebDriver driver, WebElement element)
	{
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(element));
		
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", element);
	}
	public void javascriptEnter(WebDriver driver, WebElement element, String value)
	{
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(element));
		
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript(value, element);
	}
	public void javascriptScrollToView(WebDriver driver, WebElement element)
	{
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(element));
		
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true)", element);
	}
	public void javascriptScrollToElement(WebDriver driver, WebElement element)
	{
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(element));
		
		int x= element.getLocation().getX();
		int y= element.getLocation().getY();
		
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy("+x+", "+y+")");
	}
	public void javascriptScrollPageEnd(WebDriver driver, WebElement element)
	{
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(element));
		
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	}
	public void javascriptCreateAlertPopup(WebDriver driver, String alertText)
	{
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript(alertText);
	}
	public void javascriptCreateConfirmPopup(WebDriver driver, String confirmText)
	{
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript(confirmText);
	}
	public void javascriptCreatePromptPopup(WebDriver driver, String promptText)
	{
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript(promptText);
	}
	public void javascriptGetTitle(WebDriver driver, WebElement element)
	{
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(element));
		
		JavascriptExecutor js= (JavascriptExecutor)driver;
		System.out.println(js.executeScript("return document.title"));
	}
	public void javascriptGetCurrentUrl(WebDriver driver, WebElement element)
	{
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(element));
		
		JavascriptExecutor js= (JavascriptExecutor)driver;
		System.out.println(js.executeScript("return document.URL"));
	}
	public void javascriptRefresh(WebDriver driver, WebElement element)
	{
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(element));
		
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("history.go(0)");
	}
	public void javascriptHandlingDisableElement(WebDriver driver, WebElement disableelement, String value)
	{
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(disableelement));
		
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript(value, disableelement);
	}
	public void javascriptHighlightElement(WebDriver driver, WebElement element) throws InterruptedException
	{
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(element));
		
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("arguments[0].setAttribute('style', 'background: green')", element);
		
		Thread.sleep(3000);
		js.executeScript("arguments[0].setAttribute('style', 'background: blue')", element);
	}
	//WebElementinterface
	public void clearText(WebDriver driver, WebElement element)
	{
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(element));
		element.clear();
		Assert.assertEquals(element.getAttribute("value").isEmpty(), true, "text not clear");
	}
	public void clearDelete(WebDriver driver, WebElement element)
	{
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(element));
		element.sendKeys(Keys.CONTROL,"a");
		element.sendKeys(Keys.DELETE);
		Assert.assertEquals(element.getAttribute("value").isEmpty(), true, "text not clear");
	}
	public void clearBackspace(WebDriver driver, WebElement element)
	{
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(element));
		element.sendKeys(Keys.CONTROL,"a");
		element.sendKeys(Keys.BACK_SPACE);
		Assert.assertEquals(element.getAttribute("value").isEmpty(), true, "text not clear");
	}
	public void clearSingleBackspace(WebDriver driver, WebElement element)
	{
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(element));
		element.sendKeys(Keys.BACK_SPACE);
	}
	public void copyPaste(WebDriver driver, WebElement copyelement, WebElement pasteelement, String text, String expectedText)
	{
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(copyelement));
		wait.until(ExpectedConditions.visibilityOf(pasteelement));
		copyelement.sendKeys(Keys.CONTROL,"a");
		copyelement.sendKeys(Keys.CONTROL,"c");
		pasteelement.sendKeys(Keys.CONTROL,"v");
		Assert.assertEquals(pasteelement.getAttribute("value").equals(text), expectedText, "text not copied");
	}
	public void cutPaste(WebDriver driver, WebElement copyelement, WebElement pasteelement, String text, String expectedText)
	{
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(copyelement));
		wait.until(ExpectedConditions.visibilityOf(pasteelement));
		copyelement.sendKeys(Keys.CONTROL,"a");
		copyelement.sendKeys(Keys.CONTROL,"x");
		pasteelement.sendKeys(Keys.CONTROL,"v");
		Assert.assertEquals(pasteelement.getAttribute("value").equals(text), expectedText, "text not cut");
	}
	public void enter(WebDriver driver, WebElement element)
	{
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(element));
		element.sendKeys(Keys.ENTER);	
	}
	public void getElementAttribute(WebDriver driver, WebElement element,String attribute,String value, String expectedValue)
	{
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(element));	
		Assert.assertEquals(element.getAttribute(attribute).equals(value), expectedValue, "attrbute value not match");
	}
	public void getElementCssValue(WebDriver driver, WebElement element, String cssvalue)
	{
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(element));	
		Reporter.log(element.getCssValue(cssvalue), true);
	}
	public void getElementLocation(WebDriver driver, WebElement element)
	{
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(element));	
		element.getLocation();
	}
	public void getElementSize(WebDriver driver, WebElement element)
	{
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(element));	
		element.getSize();
	}
	public void getElementTagName(WebDriver driver, WebElement element,String expectedTagname)
	{
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(element));	
		Assert.assertEquals(element.getTagName(),  expectedTagname, "tag name not match");
	}
	public void validateText(WebDriver driver, WebElement element,String expectedText)
	{
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(element));	
		Assert.assertEquals(element.getText(),  expectedText, "text name not match");
	}
	public void replaceElementText(WebDriver driver, WebElement sourceelement, WebElement targetelement, String text, String expectedText)
	{
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(sourceelement));
		wait.until(ExpectedConditions.visibilityOf(targetelement));
		sourceelement.clear();
		targetelement.sendKeys(text);
		Assert.assertEquals(targetelement.getAttribute("value"), expectedText, "text not match");
	}
	public void elementIsDisplayed(WebDriver driver, WebElement element)
	{
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(element));
		Assert.assertEquals(element.isDisplayed(), "true", "element not display");
	}
	public void elementEnabled(WebDriver driver, WebElement element)
	{
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(element));
		Assert.assertEquals(element.isEnabled(), "true", "element not enabled");
	}
	public void elementIsSelected(WebDriver driver, WebElement element)
	{
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(element));
		Assert.assertEquals(element.isSelected(), "true", "element not select");
	}
	public void click(WebDriver driver, WebElement element)
	{
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(element));
		element.click();	
	}
	//WebDriver interface
	public void validateTitle(WebDriver driver, String expectedTitle)
	{
		Assert.assertEquals(driver.getTitle(), expectedTitle, "title not match");
	}
	public void validateCurrentUrl(WebDriver driver, String expectedUrl)
	{
		Assert.assertEquals(driver.getCurrentUrl(), expectedUrl, "url not match");
	}
	public void validatePageSource(WebDriver driver, String expectedPageSource)
	{
		Assert.assertEquals(driver.getPageSource(), expectedPageSource, "pagesource not match");
	}
	public void getCookies (WebDriver driver, WebElement element)
	{
		driver.manage().getCookies();
	}


	

	
}
