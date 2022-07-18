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

WebUI.openBrowser('')

WebUI.maximizeWindow(FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2)

WebUI.navigateToUrl(GlobalVariable.Url)

WebUI.setText(findTestObject('CaNanoLab/Login/Login_LOGIN ID'), GlobalVariable.Username)

WebUI.setEncryptedText(findTestObject('CaNanoLab/Login/Login_PASSWORD'), GlobalVariable.Password)

WebUI.click(findTestObject('CaNanoLab/Login/Login_button'))

'Create a Protocol'
WebUI.comment('Create a Protocol')

WebUI.click(findTestObject('CaNanoLab/PROTOCOLs/PROTOCOLS Tab'))

WebUI.click(findTestObject('CaNanoLab/PROTOCOLs/Create Protocols/Pro_Createa New Protocol'))

WebUI.click(findTestObject('CaNanoLab/PROTOCOLs/Create Protocols/Create Pro_Protocol Type'))

WebUI.selectOptionByLabel(findTestObject('CaNanoLab/PROTOCOLs/Create Protocols/Create Pro_Protocol Type'), Typevitro, false)

//WebUI.selectOptionByLabel(findTestObject('CaNanoLab/PROTOCOLs/Create Protocols/Create Pro_Protocol Type'), Type3_in vivo assay, false)
WebUI.setText(findTestObject('CaNanoLab/PROTOCOLs/Create Protocols/Create Pro_Protocol Name'), ProtocolName)

WebUI.click(findTestObject('CaNanoLab/PROTOCOLs/Create Protocols/Create Pro_Enter File URL'))

WebUI.setText(findTestObject('CaNanoLab/PROTOCOLs/Create Protocols/Create Pro_File Title'), 'Google.com')

WebUI.click(findTestObject('CaNanoLab/PROTOCOLs/Create Protocols/Create Pro_button_Add'))

WebUI.delay(1)

WebUI.click(findTestObject('CaNanoLab/PROTOCOLs/Create Protocols/Create Pro_Add_Collaboration Group'))

not_run: WebUI.click(findTestObject('CaNanoLab/PROTOCOLs/Create Protocols/Create Pro_Add_User'))

not_run: WebUI.selectOptionByLabel(findTestObject('CaNanoLab/PROTOCOLs/Create Protocols/Create Pro_Add_User'), '', false)

WebUI.click(findTestObject('CaNanoLab/PROTOCOLs/Create Protocols/Create Pro_Add_button_Search'))

WebUI.click(findTestObject('CaNanoLab/PROTOCOLs/Create Protocols/Create Pro_Add_Search dd'))

WebUI.selectOptionByLabel(findTestObject('CaNanoLab/PROTOCOLs/Create Protocols/Create Pro_Add_Search dd'), 'Test PV Grp1', 
    false)

WebUI.delay(1)

WebUI.click(findTestObject('CaNanoLab/PROTOCOLs/Create Protocols/Create Pro_Add_Access dd'))

WebUI.selectOptionByLabel(findTestObject('CaNanoLab/PROTOCOLs/Create Protocols/Create Pro_Add_Access dd'), 'READ', false)

WebUI.click(findTestObject('CaNanoLab/PROTOCOLs/Create Protocols/Create Pro_Add_Access_button_Save'))

WebUI.delay(1)

WebUI.click(findTestObject('CaNanoLab/PROTOCOLs/Create Protocols/button_Save'))

WebUI.verifyEqual(findTestObject('CaNanoLab/PROTOCOLs/Create Protocols/Protocol Save message'), 'rotocol successfully saved')

WebUI.click(findTestObject('CaNanoLab/PROTOCOLs/Create Protocols/button_Submit for Review'))

WebUI.click(findTestObject(null))

WebUI.click(findTestObject(null))

WebUI.click(findTestObject(null))

