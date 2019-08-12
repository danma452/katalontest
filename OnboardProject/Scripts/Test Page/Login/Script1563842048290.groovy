import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Open Chrome Browser'
WebUI.openBrowser('')

WebUI.maximizeWindow(FailureHandling.STOP_ON_FAILURE)

'Go to Method sign in page url'
WebUI.navigateToUrl('https://signin.method.me/')

'Enter in sign in email'
WebUI.sendKeys(findTestObject('Sign In/Page_Method Sign In  Online Software/input_Email Address_Email'), 'd.ma@method.me')

'Enter in sign in password'
WebUI.sendKeys(findTestObject('Sign In/Page_Method Sign In  Online Software/input_Password_Password'), '10040669Dma!')

'Click sign in button'
WebUI.click(findTestObject('Sign In/Page_Method Sign In  Online Software/button_Sign in'))

