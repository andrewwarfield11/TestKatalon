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

WebUI.setText(findTestObject('Object Repository/LUCTransOrder/input_Email_email'), 'kevin@transactly.com')

WebUI.setEncryptedText(findTestObject('Object Repository/LUCTransOrder/input_Password_password'), 'p4y+y39Ir5NaY52vjHlpIw==')

WebUI.click(findTestObject('LUCTransOrder/span_Login'))

WebUI.click(findTestObject('Object Repository/LUCTransOrder/span_ADD NEW TRANSACTION'))

WebUI.click(findTestObject('Object Repository/LUCTransOrder/span_Seller Party'))

WebUI.click(findTestObject('Object Repository/LUCTransOrder/span_Create as a Coordinator'))

WebUI.click(findTestObject('Object Repository/LUCTransOrder/span_Yes'))

WebUI.setText(findTestObject('Object Repository/LUCTransOrder/input_Street Address _address_line_1'), '234 luc street')

WebUI.setText(findTestObject('Object Repository/LUCTransOrder/input_City _city'), 'St. Louis')

WebUI.click(findTestObject('LUCTransOrder/svg_State _MuiSvgIcon-root'))

WebUI.click(findTestObject('Object Repository/LUCTransOrder/span_Arkansas - AR'))

WebUI.setText(findTestObject('Object Repository/LUCTransOrder/input_Zip _zip'), '34343')

WebUI.setText(findTestObject('Object Repository/LUCTransOrder/input_Expiration Date _expiration_date'), '05/27/2020')

WebUI.click(findTestObject('LUCTransOrder/span_Next'))

WebUI.click(findTestObject('LUCTransOrder/span_Next listing docs'))

WebUI.setText(findTestObject('Object Repository/LUCTransOrder/input_Offer Amount _offer_amt'), '444')

WebUI.setText(findTestObject('Object Repository/LUCTransOrder/input_Earnest Money _earnest_money'), '334')

WebUI.setText(findTestObject('Object Repository/LUCTransOrder/input_Seller Paid Closing Costs _closing_costs'), '34')

WebUI.click(findTestObject('LUCTransOrder/span_Next contract details'))

WebUI.uploadFile(findTestObject('LUCTransOrder/contractDocInput'), '/Users/andrew/downloads/dummy.pdf')

WebUI.click(findTestObject('LUCTransOrder/span_Next contract docs'))

WebUI.setText(findTestObject('Object Repository/LUCTransOrder/input_Acceptance Date _date'), '05/27/2020')

WebUI.setText(findTestObject('LUCTransOrder/input_Closing Date _date'), '05/27/2020')

WebUI.click(findTestObject('LUCTransOrder/span_Next key dates'))

WebUI.setText(findTestObject('Object Repository/LUCTransOrder/input_Email_email'), 'alissa@transactly.com')

WebUI.click(findTestObject('LUCTransOrder/div_role'))

WebUI.click(findTestObject('Object Repository/LUCTransOrder/li_Seller Agent'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/LUCTransOrder/span_Invite Member'))

WebUI.setText(findTestObject('Object Repository/LUCTransOrder/input_Email_email'), 'emily@transactly.com')

WebUI.click(findTestObject('LUCTransOrder/div_role'))

WebUI.click(findTestObject('Object Repository/LUCTransOrder/li_Buyers Agent'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/LUCTransOrder/span_Invite Member'))

WebUI.click(findTestObject('LUCTransOrder/span_Next team'))

WebUI.click(findTestObject('LUCTransOrder/div_client'))

WebUI.click(findTestObject('Object Repository/LUCTransOrder/li_Alissa Talimonchuk'))

WebUI.click(findTestObject('LUCTransOrder/span_Next order info'))

WebUI.click(findTestObject('LUCTransOrder/span_Submit'))

