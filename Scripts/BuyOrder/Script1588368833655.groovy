import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.thoughtworks.selenium.Selenium as Selenium
import org.openqa.selenium.firefox.FirefoxDriver as FirefoxDriver
import org.openqa.selenium.WebDriver as WebDriver
import com.thoughtworks.selenium.webdriven.WebDriverBackedSelenium as WebDriverBackedSelenium
import static org.junit.Assert.*
import java.util.regex.Pattern as Pattern
import static org.apache.commons.lang3.StringUtils.join

WebUI.openBrowser('http://realtydock.co/login')

//def driver = DriverFactory.getWebDriver()
//String baseUrl = "https://realtydock.co/login"
//selenium = new WebDriverBackedSelenium(driver, baseUrl)
WebUI.setText(findTestObject('BuyOrder/input_Email_email'), 'alissa@transactly.com')

WebUI.setEncryptedText(findTestObject('BuyOrder/input_Password_password'), 'p4y+y39Ir5NaY52vjHlpIw==')

WebUI.click(findTestObject('BuyOrder/span_Login'))

WebUI.click(findTestObject('BuyOrder/span_ADD NEW TRANSACTION'))

WebUI.click(findTestObject('BuyOrder/span_Yes I want to use my TC'))

WebUI.click(findTestObject('BuyOrder/span_Buyer Party'))

WebUI.setText(findTestObject('BuyOrder/input_Street Address _address_line_1'), '234 buy order')

WebUI.setText(findTestObject('BuyOrder/input_City _city'), 'St. Louis')

WebUI.click(findTestObject('BuyOrder/svg_State _MuiSvgIcon-root'))

WebUI.click(findTestObject('BuyOrder/span_Connecticut - CT'))

WebUI.setText(findTestObject('BuyOrder/input_Zip _zip'), '44444')

WebUI.setText(findTestObject('BuyOrder/input_List Price_price'), '874')

WebUI.click(findTestObject('BuyOrder/span_Next'))

WebUI.click(findTestObject('BuyOrder/button_Next'))

WebUI.click(findTestObject('BuyOrder/span_Next in contract details'))

WebUI.uploadFile(findTestObject('BuyOrder/contractDocumentsInput'), '/Users/andrew/downloads/dummy.pdf')

WebUI.click(findTestObject('BuyOrder/span_Next in contract documents'))

WebUI.click(findTestObject('BuyOrder/span_Next in key dates'))

WebUI.click(findTestObject('BuyOrder/button_Next in team'))

WebUI.click(findTestObject('BuyOrder/span_Submit'))

