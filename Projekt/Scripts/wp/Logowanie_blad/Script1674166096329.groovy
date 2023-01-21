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
/*
 * Uruchomienie przegladarki
 */
WebUI.openBrowser(GlobalVariable.url)

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/morele_main/cookie'))
/*
 * uruchomienie opcji zaloguj sie
 */
WebUI.click(findTestObject('Object Repository/morele_main/login'))
/*
ustawienie wartosci w polu mail
*/
WebUI.setText(findTestObject('Object Repository/logowanie/input_mail'), mail)
/*
ustawienie wartosci w polu haslo
*/
WebUI.setText(findTestObject('Object Repository/logowanie/input_pass'), haslo)
/*
klikniecie przycisku logowania
*/
WebUI.click(findTestObject('Object Repository/logowanie/login_button'))
/*
sprawdzenie komunikatu o bledzie
*/
String el_error_msg = WebUI.getText(findTestObject('Object Repository/logowanie/login_error'))
assert login_error == el_error_msg
/*
zamykanie przegladarki
*/
WebUI.closeBrowser()