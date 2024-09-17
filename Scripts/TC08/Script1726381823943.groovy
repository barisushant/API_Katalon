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
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('https://testpages.herokuapp.com/styled/alerts/alert-test.html')

WebUI.maximizeWindow()

WebUI.click(findTestObject('Alerts/Show alert'))

WebUI.acceptAlert()

WebUI.click(findTestObject('Alerts/Show alert'))

WebUI.getAlertText()

WebUI.dismissAlert()

WebUI.verifyAlertNotPresent(5)

WebUI.scrollToElement(findTestObject('Alerts/Confirm box'), 5)

WebUI.click(findTestObject('Alerts/Confirm box'))

WebUI.verifyAlertPresent(5)

WebUI.acceptAlert()

WebUI.scrollToElement(findTestObject('Alerts/Prompt box'), 5)

WebUI.click(findTestObject('Alerts/Prompt box'))

WebUI.waitForAlert(5)

WebUI.setAlertText('Sushant')

WebUI.acceptAlert()

WebUI.scrollToElement(findTestObject('Alerts/Prompt box'), 5)

WebUI.click(findTestObject('Alerts/Prompt box'))

WebUI.setAlertText('MAhindra', FailureHandling.STOP_ON_FAILURE)

WebUI.dismissAlert()

WebUI.deleteAllCookies()

WebUI.closeBrowser()

