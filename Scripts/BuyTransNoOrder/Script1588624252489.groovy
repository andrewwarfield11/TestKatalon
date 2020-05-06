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

WebUI.openBrowser('')

WebUI.navigateToUrl('http://local.transactlyapp.com:3000/login')

WebUI.setText(findTestObject('Object Repository/BuyTransNoOrder/input_Email_email'), 'alissa@transactly.com')

WebUI.setEncryptedText(findTestObject('Object Repository/BuyTransNoOrder/input_Password_password'), 'p4y+y39Ir5NaY52vjHlpIw==')

WebUI.click(findTestObject('Object Repository/BuyTransNoOrder/span_Login'))

WebUI.click(findTestObject('Object Repository/BuyTransNoOrder/span_ADD NEW TRANSACTION'))

WebUI.click(findTestObject('Object Repository/BuyTransNoOrder/button_No Ill manage it on my own'))

WebUI.click(findTestObject('Object Repository/BuyTransNoOrder/span_Buyer Party'))

WebUI.setText(findTestObject('Object Repository/BuyTransNoOrder/input_Street Address _address_line_1'), '123 buy no tc')

WebUI.setText(findTestObject('Object Repository/BuyTransNoOrder/input_City _city'), 'St. Louis')

WebUI.click(findTestObject('BuyTransNoOrder/svg_State _MuiSvgIcon-root'))

WebUI.click(findTestObject('Object Repository/BuyTransNoOrder/li_Arizona - AZ'))

WebUI.setText(findTestObject('Object Repository/BuyTransNoOrder/input_Zip _zip'), '34343')

WebUI.setText(findTestObject('Object Repository/BuyTransNoOrder/input_List Price _price'), '333')

WebUI.click(findTestObject('Object Repository/BuyTransNoOrder/button_Next'))

WebUI.click(findTestObject('Object Repository/BuyTransNoOrder/span_Next'))

WebUI.setText(findTestObject('Object Repository/BuyTransNoOrder/input_Offer Amount _offer_amt'), '453')

WebUI.click(findTestObject('Object Repository/BuyTransNoOrder/input_Cash_financing'))

WebUI.setText(findTestObject('Object Repository/BuyTransNoOrder/input_Earnest Money _earnest_money'), '3456')

WebUI.setText(findTestObject('Object Repository/BuyTransNoOrder/input_Seller Paid Closing Costs _closing_costs'), '335')

WebUI.click(findTestObject('BuyTransNoOrder/span_Next contract details'))

WebUI.uploadFile(findTestObject('BuyTransNoOrder/contractDocInput'), '/Users/andrew/downloads/dummy.pdf')

WebUI.click(findTestObject('BuyTransNoOrder/span_Next contract docs'))

WebUI.setText(findTestObject('BuyTransNoOrder/input_Acceptance Date _date'), '05/27/2020')

WebUI.setText(findTestObject('BuyTransNoOrder/input_Closing Date _date'), '05/27/2020')

WebUI.click(findTestObject('BuyTransNoOrder/span_Next key dates'))

WebUI.setText(findTestObject('BuyTransNoOrder/input_Email_email'), 'emily@transactly.com')

WebUI.click(findTestObject('BuyTransNoOrder/div_role'))

WebUI.click(findTestObject('BuyTransNoOrder/li_Seller Agent'))

WebUI.click(findTestObject('BuyTransNoOrder/span_Invite Member'))

WebUI.delay(2)

WebUI.click(findTestObject('BuyTransNoOrder/span_Next team'))

