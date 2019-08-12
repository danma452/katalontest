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

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://signin.method.me/')

WebUI.sendKeys(findTestObject('signup/Page_Method Sign In  Online Software/Page_Method Sign In  Online Software/input_Email Address_Email'), 
    'danm123@hotmail.com')

WebUI.sendKeys(findTestObject('signup/Page_Method Sign In  Online Software/Page_Method Sign In  Online Software/Page_Method Sign In  Online Software/input_Password_Password'), 
    'Admin01!')

WebUI.click(findTestObject('signup/Page_Method Sign In  Online Software/Page_Method Sign In  Online Software/Page_Method Sign In  Online Software/button_Sign in'))

