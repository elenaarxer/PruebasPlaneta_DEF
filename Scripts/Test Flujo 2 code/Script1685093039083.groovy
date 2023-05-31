import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import java.awt.Frame as Frame
import javax.swing.JOptionPane as JOptionPane
import java.awt.Font as Font
import javax.swing.JFileChooser as JFileChooser
import javax.swing.UIManager as UIManager
import javax.swing.filechooser.FileSystemView as FileSystemView
import com.kms.katalon.core.annotation.Keyword as Keyword
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
import org.openqa.selenium.JavascriptExecutor as JavascriptExecutor
import org.openqa.selenium.WebDriver as WebDriver
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory

WebUI.openBrowser('')

WebUI.navigateToUrl('https://uat.aulaplaneta.com/')

'Entra en el user Profesor, clicka el box del libro para 5A y entra al user alumno'
WebUI.callTestCase(findTestCase('Test 2 functions/Enter user Profesor and Student'), [:], FailureHandling.STOP_ON_FAILURE)

'If=Box_5A checked // Else=Box_5A not checked'
if (ElementAttribute5AChecked == 'mat-checkbox mat-accent cdk-focused cdk-mouse-focused mat-checkbox-checked') {
    WebUI.callTestCase(findTestCase('Test 2 functions/Case checked'), [:], FailureHandling.STOP_ON_FAILURE)

    'Abans d\'aquest pas cal revisar si esta el llibre "Copia profesor"'
    WebUI.click(findTestObject('Object Repository/Page_aulaPlaneta/mat-icon_keyboard_arrow_down'))

    WebUI.click(findTestObject('Object Repository/Page_aulaPlaneta/button_logoutCerrar sesin'))

    WebUI.callTestCase(findTestCase('Test 2 functions/Enter user Profesor and Student'), [:], FailureHandling.STOP_ON_FAILURE)

    WebUI.callTestCase(findTestCase('Test 2 functions/Case unchecked'), [:], FailureHandling.STOP_ON_FAILURE)
} else {
    WebUI.callTestCase(findTestCase('Test 2 functions/Case unchecked'), [:], FailureHandling.STOP_ON_FAILURE)

    'Abans d\'aquest pas cal revisar si esta el llibre "Copia profesor"'
    WebUI.click(findTestObject('Object Repository/Page_aulaPlaneta/mat-icon_keyboard_arrow_down'))

    WebUI.click(findTestObject('Object Repository/Page_aulaPlaneta/button_logoutCerrar sesin'))

    WebUI.callTestCase(findTestCase('Test 2 functions/Enter user Profesor and Student'), [:], FailureHandling.STOP_ON_FAILURE)

    WebUI.callTestCase(findTestCase('Test 2 functions/Case checked'), [:], FailureHandling.STOP_ON_FAILURE)
}

'Abans d\'aquest pas cal revisar si esta el llibre "Copia profesor"'
WebUI.click(findTestObject('Object Repository/Page_aulaPlaneta/mat-icon_keyboard_arrow_down'))

WebUI.click(findTestObject('Object Repository/Page_aulaPlaneta/button_logoutCerrar sesin'))

WebUI.closeBrowser()

