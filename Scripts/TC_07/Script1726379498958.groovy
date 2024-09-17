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

WebUI.openBrowser('https://online.vinsys.com/#/client/OTExOQBjAG15c3Fs')

WebUI.setText(findTestObject('Name_3'), 'Sushant')

WebUI.setText(findTestObject('address'), 'India')

WebUI.click(findTestObject('Male'))

WebUI.click(findTestObject('Reading'))

Total Totalcount = WebUI.getNumberOfTotalOption(findTestObject('Country'))

if (Totalcount == 6) {
    println('Test case passed')

    WebUI.selectOptionByLabel(findTestObject('Country'), 'United States of America', false)
} else {
    println('Test case Failed')
}

WebUI.selectOptionByLabel(findTestObject('City'), 'Delhi', false)

WebUI.setText(findTestObject('DOB'), '09/24/2024')

WebUI.click(findTestObject('submit3'))

